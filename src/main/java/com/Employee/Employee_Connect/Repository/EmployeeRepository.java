package com.Employee.Employee_Connect.Repository;

import com.Employee.Employee_Connect.Repository.Model.AdminRecord;
import com.Employee.Employee_Connect.Repository.Model.EmployeeRecord;
import org.springframework.data.repository.CrudRepository;


    public interface EmployeeRepository extends CrudRepository<EmployeeRecord, Long>{

    }


