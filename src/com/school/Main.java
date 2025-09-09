package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);

        // Create courses
        Course course1 = new Course("Intro to CS", 4);
        Course course2 = new Course("Calculus II", 3);

        // Display all students
        System.out.println("---- Students ----");
        student1.displayInfo();
        student2.displayInfo();

        // Display all courses
        System.out.println("\n---- Courses ----");
        course1.displayInfo();
        course2.displayInfo();

        // Attendance records
        System.out.println("\n---- Attendance Records ----");
        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        AttendanceRecord record1 = new AttendanceRecord(student1.getStudentId(), course1.getCourseId(), "Present");
        AttendanceRecord record2 = new AttendanceRecord(student2.getStudentId(), course2.getCourseId(), "Absent");
        AttendanceRecord record3 = new AttendanceRecord(student1.getStudentId(), course2.getCourseId(), "Holiday"); // Invalid

        attendanceLog.add(record1);
        attendanceLog.add(record2);
        attendanceLog.add(record3);

        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }
    }
}
