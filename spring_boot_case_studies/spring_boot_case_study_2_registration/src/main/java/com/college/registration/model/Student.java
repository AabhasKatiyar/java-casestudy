package com.college.registration.model;

public class Student {
    private String name;
    private String rollNumber;
    private String course;

    public Student() {
    }

    public Student(String name, String rollNumber, String course) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
