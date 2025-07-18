package cl.kibernumacademy.model;

import java.time.LocalDateTime;

public class Notification {
private String message;
    private String recipient;
    private Channel channel;
    private LocalDateTime timestamp;

    public Notification(String message, String recipient, Channel channel) {
        this.message = message;
        this.recipient = recipient;
        this.channel = channel;
        this.timestamp = LocalDateTime.now();
    }

    public String getMessage() {
        return message;
    }

    public String getRecipient() {
        return recipient;
    }

    public Channel getChannel() {
        return channel;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "message='" + message + '\'' +
                ", recipient='" + recipient + '\'' +
                ", channel=" + channel +
                ", timestamp=" + timestamp +
                '}';
    }
}
