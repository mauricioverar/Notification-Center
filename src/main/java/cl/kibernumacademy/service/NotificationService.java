package cl.kibernumacademy.service;

public interface NotificationService {
  boolean send(String message, String recipient);
}
