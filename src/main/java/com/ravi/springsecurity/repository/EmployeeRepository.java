package com.ravi.springsecurity.repository;

import com.ravi.springsecurity.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
