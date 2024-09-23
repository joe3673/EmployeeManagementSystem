package com.Employee.Employee_Connect.Repository.Model;

public class AdminRecord {

    private final Long adminId;

    private final String password;


    public AdminRecord(Long adminId, String password) {
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
