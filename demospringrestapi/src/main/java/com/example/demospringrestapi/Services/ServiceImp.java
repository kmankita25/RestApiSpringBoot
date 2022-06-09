package com.example.demospringrestapi.Services;

import com.example.demospringrestapi.entities.Student;
import com.example.demospringrestapi.repository.Repository;

import java.util.List;

public class ServiceImp {
    public List<Student> getAllStudents()
    {
        Repository r1=new Repository();
        List<Student> studentList= r1.getData();
        return studentList;
    }
}
