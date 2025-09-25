package com.school;

public class Course implements Storable {
    private int courseId;
    private String courseName;
    private int credits;
    private static int nextCourseIdCounter = 101;

    // Constructor with course name and credits (ID auto-generated)
    public Course(String courseName, int credits) {
        this.courseId = nextCourseIdCounter++;
        this.courseName = courseName;
        this.credits = credits;
    }

    // Getters
    public int getCourseId() { return courseId; }
    public String getCourseName() { return courseName; }
    public int getCredits() { return credits; }

    // Method to display course details
    public void displayInfo() {
        System.out.println("Course ID: C" + courseId + ", Course Name: " + courseName + ", Credits: " + credits);
    }

    // Implementation of Storable
    @Override
    public String toDataString() {
        return courseId + "," + courseName + "," + credits;
    }
}
