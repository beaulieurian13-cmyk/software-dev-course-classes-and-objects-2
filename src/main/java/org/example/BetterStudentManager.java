package org.example;


import java.util.ArrayList;
import java.util.List;

public class BetterStudentManager {
    public List<Student> students = new ArrayList<>();

    public void addStudent(String name, double grade) {
        Student student = new Student();
        student.name = name;
        student.grade = grade;
        students.add(student);


        // This method should add a new student to the list of students
    }

    public void removeStudent(String name) {
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).name.equals(name)) {
                index = i;
            }
        }

        if (index != -1) {
            students.remove(index);
        }


    }

    public String getStudentList() {
        String result = "";

        for (Student student : students) {
            result += student.name + " " + student.grade + "\n";
        }

        return result;
    }
}
