package com.devmentor;

import java.util.HashMap;
import java.util.Map;

public class LanguageEnUs extends Language {
    public String getContent(Event event) {
        Map<String, String> map = new HashMap<>();
        map.put(RegisterSuccessEvent.class.getName(), " register success");
        map.put(BookCourseEvent.class.getName(), " book course");
        map.put(CancelCourserEvent.class.getName(), " cancel course");

        if (map.containsKey(event.getClass().getName())) {
            return map.get(event.getClass().getName());
        }

        return "";
    }
}
