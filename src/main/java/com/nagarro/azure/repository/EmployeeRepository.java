package com.nagarro.azure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.azure.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee,Integer>{

}
