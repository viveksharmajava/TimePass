package com.timePass.controller;

import java.util.List;

public interface EmployeeDAO 
{
    public List<EmployeeEntity> getAllEmployees();
    public List<DepartmentEntity> getAllDepartments();
    public void addEmployee(EmployeeEntity employee);
}
