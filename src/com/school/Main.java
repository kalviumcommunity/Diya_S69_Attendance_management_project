package com.school;

public class Main {
    public static void main(String[] args) {
        // Create arrays
        Student[] students = new Student[2];
        Course[] courses = new Course[2];

        // Add students
        students[0] = new Student(1, "Alice", 20);
        students[1] = new Student(2, "Bob", 22);

        // Add courses
        courses[0] = new Course("CS101", "Intro to CS", 4);
        courses[1] = new Course("MATH201", "Calculus II", 3);

        // Display all students
        System.out.println("---- Students ----");
        for (Student s : students) {
            s.displayInfo();
        }

        // Display all courses
        System.out.println("\n---- Courses ----");
        for (Course c : courses) {
            c.displayInfo();
        }
    }
}
