package com.ritul.Springboot.tutorial.service;

import com.ritul.Springboot.tutorial.entity.Department;
import com.ritul.Springboot.tutorial.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    public Department fetchDepartmentByName(String departmentName);

    public Department saveDepartment(Department department);

   public List<Department> fetchDepartmentList();

   public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

   public  void deleteDepartmentById(Long departmentId);

   public  Department updateDepartmentById(Long departmentId,Department department);
}
