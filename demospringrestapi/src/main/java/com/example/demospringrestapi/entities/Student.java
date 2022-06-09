package com.example.demospringrestapi.entities;

public class Student {
    private int id;
    private String name;
    private  String course;
    private String subject;

    public Student(int id, String name, String course, String subject) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.subject = subject;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
