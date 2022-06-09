package com.example.demospringrestapi.Controller;

import com.example.demospringrestapi.Services.ServiceImp;
import com.example.demospringrestapi.entities.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class College {
    @GetMapping("/Student")
    public List<Student> getStudent()
    {
  ServiceImp s1=new ServiceImp();
  return s1.getAllStudents();

    }

}
