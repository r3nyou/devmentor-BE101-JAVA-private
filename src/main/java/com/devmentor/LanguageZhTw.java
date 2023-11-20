package com.devmentor;

import java.util.HashMap;
import java.util.Map;

public class LanguageZhTw extends Language {
    public String getContent(Event event) {
        Map<String, String> map = new HashMap<>();
        map.put(new RegisterSuccessEvent(null).getClass().getName(), " 註冊成功");
        map.put(new BookCourseEvent(null).getClass().getName(), " 預約課程");
        map.put(new CancelCourserEvent(null).getClass().getName(), " 取消課程");

        if (map.containsKey(event.getClass().getName())) {
            return map.get(event.getClass().getName());
        }

        return "";
    }
}
