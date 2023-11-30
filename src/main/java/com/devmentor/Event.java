package com.devmentor;

import java.util.Collection;
import java.util.HashSet;

public abstract class Event {
    protected Collection<NotifyChannel> notifyChannels = new HashSet<>();

    public void addNotifyChannel(NotifyChannel notifyChannel) {
        notifyChannels.add(notifyChannel);
    }

    public void dispatch(User user) {
        String message = String.format(
                "id: %d %s",
                user.getId(),
                user.getLanguage().getContent(this)
        );

        for(NotifyChannel channel : notifyChannels) {
            System.out.println(channel.notify(message));
        }
    }
}
