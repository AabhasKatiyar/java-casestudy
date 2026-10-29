package com.company.salary.model;

public class SalaryRequest {
    private String employeeName;
    private double basicSalary;

    public SalaryRequest() {
    }

    public SalaryRequest(String employeeName, double basicSalary) {
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
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
}
