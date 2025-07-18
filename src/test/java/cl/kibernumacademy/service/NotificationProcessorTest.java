package cl.kibernumacademy.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.never;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import org.mockito.ArgumentCaptor;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class NotificationProcessorTest {

  @Mock
  private NotificationService emailService;

  @Mock
  private NotificationService smsService;

  @Mock
  private NotificationHistory notificationHistory;

  @Captor
  private ArgumentCaptor<Notification> notificationCaptor;

  @InjectMocks
  private NotificationProcessor notificationProcessor;

  @BeforeEach
  void setUp() {
    notificationProcessor = new NotificationProcessor(emailService, smsService, notificationHistory);
  }

  @Test
  void testSendEmailNotification_Success() {
    String message = "Bienvenido a nuestra plataforma";
    String recipient = "usuario@example.com";

    given(emailService.send(message, recipient)).willReturn(true);

    boolean result = notificationProcessor.sendNotification(message, recipient, Channel.EMAIL);

    assertTrue(result);
    verify(emailService).send(message, recipient);
    verify(notificationHistory).add(notificationCaptor.capture());

    Notification notification = notificationCaptor.getValue();
    assertEquals(message, notification.getMessage());
    assertEquals(recipient, notification.getRecipient());
    assertEquals(Channel.EMAIL, notification.getChannel());
  }

  @Test
  void testSendSmsNotification_Success() {
    String message = "Tu código de verificación es 123456";
    String recipient = "+1234567890";

    given(smsService.send(message, recipient)).willReturn(true);

    boolean result = notificationProcessor.sendNotification(message, recipient, Channel.SMS);

    assertTrue(result);
    verify(smsService).send(message, recipient);
    verify(notificationHistory).add(notificationCaptor.capture());

    Notification notification = notificationCaptor.getValue();
    assertEquals(message, notification.getMessage());
    assertEquals(recipient, notification.getRecipient());
    assertEquals(Channel.SMS, notification.getChannel());
  }

  @Test
  void testSendNotification_EmptyMessage_ThrowsException() {
    String message = "";
    String recipient = "usuario@example.com";

    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
        () -> notificationProcessor.sendNotification(message, recipient, Channel.EMAIL));

    assertEquals("Mensaje vacío o destinatario nulo", exception.getMessage());
    verify(emailService, never()).send(anyString(), anyString());
  }

  @Test
  void testSendNotification_NullRecipient_ThrowsException() {
    String message = "Hola";
    String recipient = null;

    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
        () -> notificationProcessor.sendNotification(message, recipient, Channel.EMAIL));

    assertEquals("Mensaje vacío o destinatario nulo", exception.getMessage());
    verify(emailService, never()).send(anyString(), anyString());
  }

  @Test
  void testSendNotification_FailureInService_ReturnsFalse() {
    String message = "Notificación importante";
    String recipient = "usuario@example.com";
    given(emailService.send(message, recipient)).willReturn(false);

    boolean result = notificationProcessor.sendNotification(message, recipient, Channel.EMAIL);

    assertFalse(result);
    verify(emailService).send(message, recipient);
  }

  @Test
  void testBDDStyle_SendEmailNotification() {
    String message = "Correo de prueba";
    String recipient = "test@example.com";
    given(emailService.send(message, recipient)).willReturn(true);

    boolean result = notificationProcessor.sendNotification(message, recipient, Channel.EMAIL);

    then(result).isTrue();
    then(emailService).should().send(message, recipient);
  }

  @Test
  void testNotificationHistory_ContainsCorrectData() {
    String message = "Historial de prueba";
    String recipient = "historial@example.com";
    LocalDateTime now = LocalDateTime.now();
    given(emailService.send(message, recipient)).willReturn(true);

    notificationProcessor.sendNotification(message, recipient, Channel.EMAIL);

    verify(notificationHistory).add(notificationCaptor.capture());
    Notification notification = notificationCaptor.getValue();

    assertEquals(message, notification.getMessage());
    assertEquals(recipient, notification.getRecipient());
    assertEquals(Channel.EMAIL, notification.getChannel());
    assertNotNull(notification.getTimestamp());
  }
}
