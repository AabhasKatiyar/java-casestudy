package com.company.salary.service;

import com.company.salary.model.SalaryRequest;
import com.company.salary.model.SalarySlip;
import org.springframework.stereotype.Service;

@Service
public class SalaryService {

    public SalarySlip calculateSalary(SalaryRequest request) {
        double basic = request.getBasicSalary();
        double allowances = basic * 0.20;
        double deductions = basic * 0.10;
        double grossSalary = basic + allowances;
        double netSalary = grossSalary - deductions;

        return new SalarySlip(
                request.getEmployeeName(),
                basic,
                allowances,
                deductions,
                grossSalary,
                netSalary
        );
    }
}
