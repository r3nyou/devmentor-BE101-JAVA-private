package com.devmentor;

import java.util.ArrayList;

public class RegisterSuccessEvent extends Event {
    public RegisterSuccessEvent(ArrayList<NotifyChannel> notifyChannels) {
        super(notifyChannels);
    }
}
