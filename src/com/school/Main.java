package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create hierarchy objects
        Student student1 = new Student("Alice", 16, "10th Grade");
        Student student2 = new Student("Bob", 18, "12th Grade");
        Teacher teacher1 = new Teacher("Dr. Smith", "Mathematics");
        Staff staff1 = new Staff("Mr. Johnson", "Clerk");

        // Display details
        System.out.println("---- Person Hierarchy ----");
        student1.displayDetails();
        student2.displayDetails();
        teacher1.displayDetails();
        staff1.displayDetails();

        // Existing Attendance system
        System.out.println("\n---- Attendance Records ----");
        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        Course course1 = new Course("Intro to CS", 4);
        Course course2 = new Course("Calculus II", 3);

        AttendanceRecord record1 = new AttendanceRecord(student1.getId(), course1.getCourseId(), "Present");
        AttendanceRecord record2 = new AttendanceRecord(student2.getId(), course2.getCourseId(), "Absent");
        AttendanceRecord record3 = new AttendanceRecord(student1.getId(), course2.getCourseId(), "Holiday"); // Invalid

        attendanceLog.add(record1);
        attendanceLog.add(record2);
        attendanceLog.add(record3);

        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }
    }
}
