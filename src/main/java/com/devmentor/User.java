package com.devmentor;

public class User {
    private int id;

    private Language language;

    public User(int id, Language language) {
        this.id = id;
        this.language = language;
    }

    public void register() {

    }

    public int getId() {
        return id;
    }

    public Language getLanguage() {
        return language;
    }
}
