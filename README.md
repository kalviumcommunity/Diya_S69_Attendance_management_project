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

## Part 2 - Core Domain Modelling

In this part, we created two base classes: `Student` and `Course`.  
We then used arrays of these objects in `Main.java` to manage and display details.

### Features
- Defined `Student` with id, name, age
- Defined `Course` with code, title, credits
- Created arrays of Students and Courses
- Displayed their details via methods

### How to Run
```bash
cd src
javac com/school/*.java
java com.school.Main

## Part 3: Constructor Initialization & Auto-ID Generation
- Implemented parameterized constructors in `Student` and `Course` classes for object initialization.
- Utilized `private static` member variables for automatic and unique ID generation.
- Demonstrated the use of the `this` keyword to distinguish instance variables from constructor parameters.
- Changed `Course`'s `courseId` to `int` for simpler auto-generation and updated its display.
- Updated `Main.java` to use constructors and show ID progression.

### How to Run (ensure this is up-to-date)
1. Navigate to the project root directory.
2. Compile: `javac src/com/school/Student.java src/com/school/Course.java src/com/school/Main.java` (or `javac src/com/school/*.java`)
3. Run: `java -cp src com.school.Main`

## Part 4: Data Encapsulation & Attendance Recording Validation
- Applied encapsulation to `Student` and `Course` classes by making fields `private` and adding public `getters`.
- Introduced a new `AttendanceRecord` class with `private` fields, a constructor, and `getters` to store attendance data.
- Implemented basic validation in the `AttendanceRecord` constructor for the attendance status (allowing only "Present" or "Absent").
- Used an `ArrayList` in `Main.java` to store and display `AttendanceRecord` objects.
- Demonstrated retrieving IDs using getters (e.g., `student1.getStudentId()`) when creating records.

### How to Run
1. Navigate to the project root directory.
2. Compile: `javac src/com/school/*.java` (or list individual files including `AttendanceRecord.java`)
3. Run: `java -cp src com.school.Main`

## Part 5: Establishing Students, Teaching & Non-Teaching Staff hierarchy
- Created a base class `Person.java` with common attributes (`id`, `name`), a universal auto-ID generator, and a `displayDetails()` method.
- Modified `Student.java` to inherit from `Person`, using `super()` to call the parent constructor and overriding `displayDetails()` to add student-specific info (e.g., grade level).
- Created `Teacher.java` extending `Person`, adding a `subjectTaught` attribute and its own `displayDetails()`.
- Created `Staff.java` extending `Person`, adding a `role` attribute and its own `displayDetails()`.
- Demonstrated creation and display of `Student`, `Teacher`, and `Staff` objects in `Main.java`.
- Updated `AttendanceRecord` creation to use the inherited `getId()` method.

