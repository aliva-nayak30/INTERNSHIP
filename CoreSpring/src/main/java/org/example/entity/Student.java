package org.example.entity;

public class Student {
    private int id;
    private String name;

    // Default constructor - required for setter injection
    public Student() {
    }

    // Constructor for constructor injection
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Setters for setter injection
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}