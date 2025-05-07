// File: StudentCourseApp.java

class Student {
    String name;
    String dob; // Accept DOB as plain string

    public Student(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Date of Birth: " + dob);
    }
}

class StudentCourses {
    String[] semesters = {"Semester 1", "Semester 2"};
    String[][] courses = {
        {"Math", "Science"},
        {"English", "History"}
    };
    int[][] marks = {
        {85, 78},
        {90, 80}
    };

    public void displayCourses() {
        for (int i = 0; i < semesters.length; i++) {
            System.out.println("\n" + semesters[i] + ":");
            for (int j = 0; j < courses[i].length; j++) {
                System.out.println(courses[i][j] + ": " + marks[i][j]);
            }
        }
    }
}

public class StudentCourseApp {
    public static void main(String[] args) {
        Student student = new Student("Alice", "12-05-2002");
        student.displayStudentInfo();

        StudentCourses courses = new StudentCourses();
        courses.displayCourses();
    }
}