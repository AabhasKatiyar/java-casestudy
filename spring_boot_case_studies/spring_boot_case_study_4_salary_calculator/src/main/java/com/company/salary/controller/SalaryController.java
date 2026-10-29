package com.company.salary.controller;

import com.company.salary.model.SalaryRequest;
import com.company.salary.model.SalarySlip;
import com.company.salary.service.SalaryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/salary")
@CrossOrigin(origins = "*")
public class SalaryController {

    private final SalaryService salaryService;

    public SalaryController(SalaryService salaryService) {
        this.salaryService = salaryService;
    }

    @PostMapping("/calculate")
    public ResponseEntity<?> calculateSalary(@RequestBody SalaryRequest request) {
        if (request.getBasicSalary() < 0) {
            return ResponseEntity.badRequest().body("Basic salary cannot be negative");
        }
        if (request.getEmployeeName() == null || request.getEmployeeName().trim().isEmpty()) {
            return ResponseEntity.badRequest().body("Employee name is required");
        }
        SalarySlip slip = salaryService.calculateSalary(request);
        return ResponseEntity.ok(slip);
    }
}
