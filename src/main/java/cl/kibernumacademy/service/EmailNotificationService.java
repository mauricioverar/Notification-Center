package cl.kibernumacademy.service;

public class EmailNotificationService implements NotificationService {

  @Override
  public boolean send(String message, String recipient) {
    // Aquí iría la lógica real para enviar un correo
    // Por ejemplo: JavaMailSender, SMTP, etc.
    System.out.println("Enviando correo a " + recipient + " con mensaje: " + message);
    // Simulamos que el envío siempre es exitoso
    return true;
  }
}
