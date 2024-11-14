package com.example.demo.repotitory;

import com.example.demo.entity.Checker;
import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.Instant;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

public interface CheckerRepository extends JpaRepository<Checker, Long> {
    void deleteAllByStudent(Student student);


    List<Checker> findAllByStudent(Student student);
}
