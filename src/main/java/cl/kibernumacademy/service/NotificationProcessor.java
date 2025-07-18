package cl.kibernumacademy.service;

import cl.kibernumacademy.model.Channel;
import cl.kibernumacademy.model.Notification;

public class NotificationProcessor {
  private final NotificationService emailService;
  private final NotificationService smsService;
  private final NotificationHistory notificationHistory;

  public NotificationProcessor(NotificationService emailService, NotificationService smsService,
      NotificationHistory notificationHistory) {
    this.emailService = emailService;
    this.smsService = smsService;
    this.notificationHistory = notificationHistory;
  }

  public boolean sendNotification(String message, String recipient, Channel channel) {
    if (message == null || message.trim().isEmpty() ||
        recipient == null || recipient.trim().isEmpty()) {
      throw new IllegalArgumentException("Mensaje vacío o destinatario nulo");
    }

    boolean result;
    if (channel == Channel.EMAIL) {
      result = emailService.send(message, recipient);
    } else if (channel == Channel.SMS) {
      result = smsService.send(message, recipient);
    } else {
      throw new IllegalArgumentException("Canal de notificación desconocido");
    }

    if (result) {
      notificationHistory.add(new Notification(message, recipient, channel));
    }

    return result;
  }
}
