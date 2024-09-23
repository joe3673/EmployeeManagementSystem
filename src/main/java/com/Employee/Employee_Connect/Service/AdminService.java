package com.Employee.Employee_Connect.Service;

import com.Employee.Employee_Connect.Repository.AdminRepository;
import com.Employee.Employee_Connect.Repository.EmployeeRepository;

public class AdminService {

    AdminRepository adminRepository;

    EmployeeRepository employeeRepository;

    public AdminService(AdminRepository adminRepository, EmployeeRepository employeeRepository){
        this.adminRepository = adminRepository;
        this.employeeRepository = employeeRepository;
    }




}
