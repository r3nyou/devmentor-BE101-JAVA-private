package com.devmentor;

public class TelegramNotify extends NotifyChannel {
    public String notify(String message) {
        return  "[telegram] " + message;
    } 
}
