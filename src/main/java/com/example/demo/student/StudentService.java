package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Dawit",
                        LocalDate.of(2002, Month.APRIL, 20),
                        21,
                        "dawit@gmail.com"

                )
        );
    }
}
