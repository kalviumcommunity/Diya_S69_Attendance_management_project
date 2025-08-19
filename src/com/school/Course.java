package com.school;

public class Course {
    private String code;
    private String title;
    private int credits;

    // Constructor
    public Course(String code, String title, int credits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
    }

    // Getters
    public String getCode() { return code; }
    public String getTitle() { return title; }
    public int getCredits() { return credits; }

    // Method to display course details
    public void displayInfo() {
        System.out.println("Course Code: " + code + ", Title: " + title + ", Credits: " + credits);
    }
}
