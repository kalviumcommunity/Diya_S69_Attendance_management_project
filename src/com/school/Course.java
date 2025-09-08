package com.school;

public class Course {
    private int courseId;
    private String title;
    private int credits;
    private static int nextCourseIdCounter = 101;

    // Constructor with title and credits (ID auto-generated)
    public Course(String title, int credits) {
        this.courseId = nextCourseIdCounter++;
        this.title = title;
        this.credits = credits;
    }

    // Getters
    public int getCourseId() { return courseId; }
    public String getTitle() { return title; }
    public int getCredits() { return credits; }

    // Method to display course details
    public void displayInfo() {
        System.out.println("Course ID: C" + courseId + ", Title: " + title + ", Credits: " + credits);
    }
}
