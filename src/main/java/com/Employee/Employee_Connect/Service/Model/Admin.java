package com.Employee.Employee_Connect.Service.Model;

public class Admin {


    private final Long adminId;

    private final String password;


    public Admin(Long adminId, String password) {
        this.adminId = adminId;
        this.password = password;
    }

    public Long getAdminId() {
        return adminId;
    }

    public String getPassword() {
        return password;
    }
}
