package com.school;

public class Student extends Person {
    private int age;
    private String gradeLevel;

    // Constructor uses super(name) for id and name
    public Student(String name, int age, String gradeLevel) {
        super(name);
        this.age = age;
        this.gradeLevel = gradeLevel;
    }

    // Getters
    public int getAge() {
        return age;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    // Override displayDetails
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Student, Age: " + age + ", Grade Level: " + gradeLevel);
    }
}
