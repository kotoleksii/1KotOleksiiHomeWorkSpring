package org.example.Task2;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextTask2.xml");

        CatsList cats = (CatsList) context.getBean("cats");
        System.out.println(cats);

        context.close();
    }
}
