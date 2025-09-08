package com.school;

public class Student {
    private int studentId;
    private String name;
    private int age;
    private static int nextStudentIdCounter = 1;

    // Constructor with name and age (ID auto-generated)
    public Student(String name, int age) {
        this.studentId = nextStudentIdCounter++;
        this.name = name;
        this.age = age;
    }

    // Getters
    public int getStudentId() { return studentId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Student ID: S" + studentId + ", Name: " + name + ", Age: " + age);
    }
}
