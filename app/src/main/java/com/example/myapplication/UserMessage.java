package com.example.myapplication;

import android.service.notification.StatusBarNotification;

public class UserMessage {
    String message;
    User sender;
    long createdAt;

    public User getSender() {
        return sender;
    }

    public String getMessage() {
        return message;
    }

    public long getCreatedAt() {
        return createdAt;
    }
}
