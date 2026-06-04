package org.example;

import org.example.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        System.out.println("Constructor Injection:");
        Student s1 = (Student) context.getBean("studentConstructor");
        s1.display();

        System.out.println("\nSetter Injection:");
        Student s2 = (Student) context.getBean("studentSetter");
        s2.display();
    }
}