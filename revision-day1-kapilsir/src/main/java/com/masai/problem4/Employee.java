package com.masai.problem4;

public class Employee {
    private String employeeId;
    private String name;
    private double salary;
    private EPFOAccount epfoAccount;

    public Employee(String employeeId, String name, double salary, EPFOAccount epfoAccount) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.epfoAccount = epfoAccount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Employee employee = (Employee) obj;
        return employeeId.equals(employee.employeeId);
    }

    @Override
    public int hashCode() {
        return employeeId.hashCode();
    }

    @Override
    public String toString() {
        return "Employee Id: " + employeeId + " Name: " + name + " Salary: " + salary +
                " EPFO Account details: " + epfoAccount.toString();
    }
}