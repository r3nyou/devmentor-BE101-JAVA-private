package com.devmentor;

import java.util.ArrayList;
import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        User user = new User(1, new LanguageZhTw());
        Event registerSuccessEvent = new RegisterSuccessEvent();
        registerSuccessEvent.addNotifyChannel(new SmsNotify());
        registerSuccessEvent.addNotifyChannel(new EmailNotify());
        registerSuccessEvent.dispatch(user);

        Student student = new Student(2, new LanguageEnUs());
        Event bookCoursEvent = new BookCourseEvent();
        bookCoursEvent.addNotifyChannel(new SmsNotify());
        bookCoursEvent.addNotifyChannel(new TelegramNotify());
        bookCoursEvent.dispatch(student);

        Event cancelCourserEvent = new CancelCourserEvent();
        cancelCourserEvent.addNotifyChannel(new SmsNotify());
        cancelCourserEvent.addNotifyChannel(new TelegramNotify());
        cancelCourserEvent.dispatch(student);
    }
}
