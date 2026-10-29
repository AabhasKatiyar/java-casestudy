package com.college.registration.controller;

import com.college.registration.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "*")
public class StudentController {

    private final List<Student> studentList = new ArrayList<>();

    @PostMapping
    public ResponseEntity<?> registerStudent(@RequestBody Student student) {
        if (student.getRollNumber() == null || student.getRollNumber().trim().isEmpty()) {
            return ResponseEntity.badRequest().body("Roll number is required");
        }
        for (Student s : studentList) {
            if (s.getRollNumber().equalsIgnoreCase(student.getRollNumber())) {
                return ResponseEntity.status(HttpStatus.CONFLICT).body("Student already registered with roll number: " + student.getRollNumber());
            }
        }
        studentList.add(student);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.ok(studentList);
    }

    @GetMapping("/{rollNumber}")
    public ResponseEntity<?> getStudentByRollNumber(@PathVariable String rollNumber) {
        for (Student s : studentList) {
            if (s.getRollNumber().equalsIgnoreCase(rollNumber)) {
                return ResponseEntity.ok(s);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found with roll number: " + rollNumber);
    }
}
