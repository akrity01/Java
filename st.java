// File: student/Student.java
package student;

public class Student {
    private String studentId;
    private String name;
    private int age;

    public Student(String studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }

    public String getStudentInfo() {
        return "Student ID: " + studentId + ", Name: " + name + ", Age: " + age;
    }
}

// File: course/Course.java
package course;

public class Course {
    private String courseId;
    private String courseName;
    private int credits;

    public Course(String courseId, String courseName, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
    }

    public String getCourseInfo() {
        return "Course ID: " + courseId + ", Name: " + courseName + ", Credits: " + credits;
    }
}

// File: enrollment/Enrollment.java
package enrollment;

import student.Student;
import course.Course;

public class Enrollment {
    private Student student;
    private Course course;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public String getEnrollmentInfo() {
        return "Enrollment Info:\n" + student.getStudentInfo() + "\n" + course.getCourseInfo();
    }
}

// File: Main.java (default package)
import student.Student;
import course.Course;
import enrollment.Enrollment;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("S001", "Alice", 20);
        Course course = new Course("C101", "Java Programming", 4);
        Enrollment enrollment = new Enrollment(student, course);

        System.out.println(student.getStudentInfo());
        System.out.println(course.getCourseInfo());
        System.out.println(enrollment.getEnrollmentInfo());
    }
}
