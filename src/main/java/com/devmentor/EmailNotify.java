package com.devmentor;

public class EmailNotify extends NotifyChannel {
    public String notify(String message) {
        return  "[email] " + message;
    }
}
