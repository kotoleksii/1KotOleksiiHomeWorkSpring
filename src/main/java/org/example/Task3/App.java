package org.example.Task3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextTask3.xml");

        User user = context.getBean("user", User.class);
        System.out.println(user);

        context.close();
    }
}
