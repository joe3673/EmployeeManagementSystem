package com.Employee.Employee_Connect.Repository.Model;

import java.time.LocalDate;
import java.time.Period;

public class EmployeeRecord {

        private final Long employeeId;

        private String employeeFirstName;

        private String employeeLastName;

        private String employeeEmail;

        private String employeePassword;

        private String employeeRole;

        private double employeeWage;

        private LocalDate employeeHireDate;

    public EmployeeRecord(Long employeeId, String employeeFirstName, String employeeLastName, String employeeEmail,
            String employeePassword, String employeeRole, double employeeWage, LocalDate employeeHireDate){
        this.employeeId = employeeId;
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeeEmail = employeeEmail;
        this.employeePassword = employeePassword;
        this.employeeRole = employeeRole;
        this.employeeWage = employeeWage;
        this.employeeHireDate = employeeHireDate;
    }

        public Long getEmployeeId () {
        return employeeId;
    }

        public String getEmployeeFirstName () {
        return employeeFirstName;
    }

        public void setEmployeeFirstName (String employeeFirstName){
        this.employeeFirstName = employeeFirstName;
    }

        public String getEmployeeLastName () {
        return employeeLastName;
    }

        public void setEmployeeLastName (String employeeLastName){
        this.employeeLastName = employeeLastName;
    }

        public String getEmployeeRole () {
        return employeeRole;
    }

        public void setEmployeeRole (String employeeRole){
        this.employeeRole = employeeRole;
    }

        public double getEmployeeWage () {
        return employeeWage;
    }

        public void setEmployeeWage ( double employeeWage){
        this.employeeWage = employeeWage;
    }

        public LocalDate getEmployeeHireDate () {
        return employeeHireDate;
    }

        public void setEmployeeHireDate (java.time.LocalDate employeeHireDate){
        this.employeeHireDate = employeeHireDate;
    }
        public Period getTenure () {
        return Period.between(employeeHireDate, java.time.LocalDate.now());
    }

        public String getEmployeeEmail () {
        return employeeEmail;
    }

        public void setEmployeeEmail (String employeeEmail){
        this.employeeEmail = employeeEmail;
    }

        public String getEmployeePassword () {
        return employeePassword;
    }

        public void setEmployeePassword (String employeePassword){
        this.employeePassword = employeePassword;
    }

    }

