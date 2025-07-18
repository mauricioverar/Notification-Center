package cl.kibernumacademy.service;

import java.util.ArrayList;
import java.util.List;

import cl.kibernumacademy.model.Notification;

public class NotificationHistory {
private List<Notification> history = new ArrayList<>();

    public void add(Notification notification) {
        history.add(notification);
    }

    public List<Notification> getHistory() {
        return history;
    }
}
