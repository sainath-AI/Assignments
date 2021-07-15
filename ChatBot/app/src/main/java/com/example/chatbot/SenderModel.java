package com.example.chatbot;



public class SenderModel extends ChatModel {

    private String message;

    public SenderModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public int getType() {
        return 1;
    }
}
