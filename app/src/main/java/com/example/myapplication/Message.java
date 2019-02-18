package com.example.myapplication;

public class Message {
    String message;
    User sender;
    long createdAt;

    public Message(String mMessage, User mUser, long mCreatedAt) {
        message = mMessage;
        sender = mUser;
        createdAt = mCreatedAt;
    }

    public User getSender() {
        return sender;
    }

    public String getMessage(){
        return message;
    }

    public long getCreatedAt() {
        return createdAt;
    }
}
