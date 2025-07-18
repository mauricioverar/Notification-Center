package cl.kibernumacademy.service;

public class SmsNotificationService implements NotificationService {

  @Override
  public boolean send(String message, String recipient) {
    // Aquí iría la lógica para enviar un SMS
    // Por ejemplo: Twilio, Nexmo, etc.
    System.out.println("Enviando SMS a " + recipient + " con mensaje: " + message);
    // Simulamos que el envío tiene éxito
    return true;
  }
}
