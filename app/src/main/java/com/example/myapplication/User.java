package com.example.myapplication;

import android.service.notification.StatusBarNotification;

public class User {
    String nickname;
    String profileUrl;

    public User(String mNickname, String mProfileUrl) {
        nickname = mNickname;
        profileUrl = mProfileUrl;
    }

    public static User getCurrentUser() {
        return null;
    }

    public Object getUserId() {
        return null;
    }

    public String getNickname() {
        return nickname;
    }

    public String getProfileUrl() {
        return getProfileUrl();
    }
}
