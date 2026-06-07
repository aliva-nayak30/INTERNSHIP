package org.example;

import org.example.entity.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Student student = context.getBean(Student.class);
        student.display();

        context.close();
    }
}