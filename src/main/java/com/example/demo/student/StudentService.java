package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

//    new Student(
//                        1L,
//                                "Davi Silva",
//                                "davisilvaphoto@gmail.com",
//                        LocalDate.of(1985, Month.NOVEMBER, 3),
//                        36
//                                )

    @GetMapping
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
}
