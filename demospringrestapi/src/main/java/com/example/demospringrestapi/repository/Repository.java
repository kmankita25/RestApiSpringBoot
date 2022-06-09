package com.example.demospringrestapi.repository;

import com.example.demospringrestapi.entities.Student;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    Student s1 = new Student(1, "Ankita","mca", "cs" );
    Student s2 = new Student(2, "Anki", "betch", "math");
    public List<Student> getData()
    {
        List<Student> studentList=new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        return studentList;
    }

}
