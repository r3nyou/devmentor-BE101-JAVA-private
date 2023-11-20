package com.devmentor;

public class SmsNotify extends NotifyChannel {
    public String notify(String message) {
        return  "[sms] " + message;
    } 
}
