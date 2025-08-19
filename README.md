# Diya_S69_Attendance_management_project

# Aarzoo_S69_Attendance_management_project

# Attendance Management Project

## Project Setup (Part 1)

This is the first phase of the Attendance Management Project.

# Attendance Management Project

This is the *first phase* of the Attendance Management Project.  
In this part, we set up the project structure, write a simple Java program, and push it to GitHub.

---

## 📂 Project Structure
AttendanceSystem/
│
├── src/
│ └── com/
│ └── school/
│ └── Main.java
│
└── README.md

## How to Run

1. Compile:
javac src/com/school/Main.java

2. Run:
javac src/com/school/Main.java
java -cp src com.school.Main


### Output
Welcome to the Attendance Management Project!

## Part 2 – Core Domain Modelling

### What I added
- src/com/school/Student.java – basic Student model (id, name, email)
- src/com/school/Course.java – basic Course model (code, title, capacity + simple seat allocation)
- Updated src/com/school/Main.java to create arrays of Students and Courses, loop through them, and print details

### How to compile
```bash
javac src/com/school/*.java