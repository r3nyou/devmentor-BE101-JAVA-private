package com.devmentor;

import java.util.ArrayList;

public abstract class Event {
    protected ArrayList<NotifyChannel> notifyChannels;

    public Event(ArrayList<NotifyChannel> notifyChannels) {
        this.notifyChannels = notifyChannels;
    }

    public String getContent(User user) {
        return String.format(
            "id: %d %s",
            user.getId(),
            user.getLanguage().getContent(this)
        );
    }

    public void dispatch(User user) {
        String message = getContent(user);
        for(NotifyChannel channel : notifyChannels) {
            System.out.println(channel.notify(message));
        }
    }
}
