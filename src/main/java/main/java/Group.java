package main.java;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Group {
    private int maxOccupancy;
    private List<Student> studentList;
    private int availability;
    private int average;

    public Group(int maxOccupancy) {
        studentList = new ArrayList<>();
        this.maxOccupancy = maxOccupancy;
    }

    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    public void add(Student student) {
        if (maxOccupancy > studentList.size()) {
            studentList.add(student);
        } else
            throw new GroupOccupancyExceededException();
    }

    public List<Student> getStudents() {
        return studentList;
    }

    public int availability() {
        availability = maxOccupancy - studentList.size();
        return availability;
    }

    public double getAverage() {
        for (Student student : studentList) {
            if(student.getGrade() != null)
                average += student.getGrade();
            else
                throw new MissedGradeException();
        }
        return (double) average / maxOccupancy;
    }
}
