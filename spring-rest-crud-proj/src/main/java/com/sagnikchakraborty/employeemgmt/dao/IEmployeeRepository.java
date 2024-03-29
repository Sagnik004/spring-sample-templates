package com.sagnikchakraborty.employeemgmt.dao;

import com.sagnikchakraborty.employeemgmt.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
}
