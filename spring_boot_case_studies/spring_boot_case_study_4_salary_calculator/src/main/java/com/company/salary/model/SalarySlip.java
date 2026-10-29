package com.company.salary.model;

public class SalarySlip {
    private String employeeName;
    private double basicSalary;
    private double allowances;
    private double deductions;
    private double grossSalary;
    private double netSalary;

    public SalarySlip() {
    }

    public SalarySlip(String employeeName, double basicSalary, double allowances, double deductions, double grossSalary, double netSalary) {
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.allowances = allowances;
        this.deductions = deductions;
        this.grossSalary = grossSalary;
        this.netSalary = netSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getAllowances() {
        return allowances;
    }

    public void setAllowances(double allowances) {
        this.allowances = allowances;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }
}
