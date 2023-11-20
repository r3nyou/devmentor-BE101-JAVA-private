package com.devmentor;

import java.util.ArrayList;
import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        User user = new User(1, new LanguageZhTw());
        Event registerSuccessEvent = new RegisterSuccessEvent(new ArrayList<>(
            Arrays.asList(new EmailNotify(), new SmsNotify())
        ));
        registerSuccessEvent.dispatch(user);

        Student student = new Student(2, new LanguageEnUs());
        Event bookCoursEvent = new BookCourseEvent(new ArrayList<>(
            Arrays.asList(new SmsNotify(), new TelegramNotify())
        ));
        bookCoursEvent.dispatch(student);

        Event cancelCourserEvent = new CancelCourserEvent(new ArrayList<>(
            Arrays.asList(new SmsNotify(), new TelegramNotify())
        ));
        cancelCourserEvent.dispatch(student);
    }
}
