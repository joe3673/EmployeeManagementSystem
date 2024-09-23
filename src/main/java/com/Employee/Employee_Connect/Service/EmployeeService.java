package com.Employee.Employee_Connect.Service;

import com.Employee.Employee_Connect.Exception.EmployeeNotFoundException;
import com.Employee.Employee_Connect.Repository.EmployeeRepository;
import com.Employee.Employee_Connect.Repository.Model.EmployeeRecord;
import com.Employee.Employee_Connect.Service.Model.Employee;
import org.slf4j.Logger;

import java.time.LocalDate;
import java.util.Objects;

public class EmployeeService {

    EmployeeRepository employeeRepository;

    Logger logger;




    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;

    }


    public Employee createNewEmployee(Employee employee){

        EmployeeRecord employeeRecord = new EmployeeRecord(employee.getEmployeeId(), employee.getEmployeeFirstName(), employee.getEmployeeLastName(), employee.getEmployeeEmail(),
                employee.getEmployeePassword(), employee.getEmployeeRole(), employee.getEmployeeWage(), employee.getEmployeeHireDate());

        employeeRepository.save(employeeRecord);

        return employeeRecordConverter(employeeRecord);
    }

    public Employee getEmployee(Long employeeId){
        Objects.requireNonNull(employeeId, "Not a valid employee ID");

        EmployeeRecord employeeRecord = employeeRepository.findById(employeeId).orElseThrow(() -> new EmployeeNotFoundException("Employee Not Found with ID: " + employeeId));

        return employeeRecordConverter(employeeRecord);
    }


    public Employee updateEmployee(Employee employee){

        EmployeeRecord employeeRecord = employeeRepository.findById(employee.getEmployeeId()).orElseThrow(() -> new EmployeeNotFoundException("Employee Not Found"));

        employeeRecord.setEmployeeEmail(employee.getEmployeeEmail());
        employeeRecord.setEmployeePassword(employee.getEmployeePassword());
        employeeRecord.setEmployeeWage(employee.getEmployeeWage());
        employeeRecord.setEmployeeRole(employee.getEmployeeRole());

        employeeRepository.save(employeeRecord);

        return employeeRecordConverter(employeeRecord);


    }


    public Employee employeeRecordConverter(EmployeeRecord employeeRecord){

        Employee employee = new Employee(employeeRecord.getEmployeeId(), employeeRecord.getEmployeeFirstName(), employeeRecord.getEmployeeLastName(),
                employeeRecord.getEmployeeEmail(), employeeRecord.getEmployeePassword(), employeeRecord.getEmployeeRole(), employeeRecord.getEmployeeWage(),
                employeeRecord.getEmployeeHireDate());
    }
}
