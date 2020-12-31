package main.java;

public class Student {
    private String name;
    private String id;
    private Integer grade;


    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Object getName() {
        return name;
    }

    public Object getId() {
        return id;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Integer getGrade() {
        return grade;
    }
}
