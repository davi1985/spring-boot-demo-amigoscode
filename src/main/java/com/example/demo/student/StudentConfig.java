package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.AUGUST;
import static java.time.Month.NOVEMBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
           Student davi = new Student(
                    "Davi Silva",
                    "davisilvaphoto@gmail.com",
                    LocalDate.of(1985, NOVEMBER, 3),
                    36
            );

            Student joelma = new Student(
                    "Joelma Braga",
                    "joelmabraga@gmail.com",
                    LocalDate.of(1990, AUGUST, 3),
                    32
            );

            repository.saveAll(
                    List.of(davi,joelma)
            );
        };
    }
}
