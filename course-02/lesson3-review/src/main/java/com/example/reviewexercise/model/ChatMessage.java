package com.example.reviewexercise.model;

// data type class for message list's fields
// store a message with a username attached
public class ChatMessage {
    private String username;
    private String message;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
