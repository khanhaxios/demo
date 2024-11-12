package com.example.demo.controller;

import com.example.demo.service.checker.CheckerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.dto.AddFingerRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/public/log")
@RequiredArgsConstructor
@CrossOrigin
public class LogApi {

    private final CheckerService checkerService;

    @PostMapping("check-in-by-finger/{id}")
    ResponseEntity<?> checkIn(@PathVariable(name = "id") String  id) {
        try {
            return checkerService.checkInByFinger(id);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
    @PostMapping("check-out-by-id/{id}")
    ResponseEntity<?> checkOut(@PathVariable(name = "id") String id) {
        try {
            return checkerService.checkOutById(id);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
    @PostMapping("add-finger")
    ResponseEntity<?> addFinger(@RequestBody AddFingerRequest request) {
        try {
            return checkerService.addFinger(request);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
