package com.devmentor;

import java.util.HashMap;
import java.util.Map;

public class LanguageEnUs extends Language {
    public String getContent(Event event) {
        Map<String, String> map = new HashMap<>();
        map.put(new RegisterSuccessEvent(null).getClass().getName(), " register success");
        map.put(new BookCourseEvent(null).getClass().getName(), " book course");
        map.put(new CancelCourserEvent(null).getClass().getName(), " cancel course");

        if (map.containsKey(event.getClass().getName())) {
            return map.get(event.getClass().getName());
        }

        return "";
    }
}
