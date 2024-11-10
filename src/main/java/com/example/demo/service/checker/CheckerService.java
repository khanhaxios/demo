package com.example.demo.service.checker;

import com.example.demo.entity.Checker;
import com.example.demo.entity.Student;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface CheckerService {
    List<Checker> getAll();

    List<Checker> getAllByUser(Student student);

    ResponseEntity<?> checkInByFinger(int id);

    ResponseEntity<?> checkOutById(long id);
}