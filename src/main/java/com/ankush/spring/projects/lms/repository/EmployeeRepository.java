package com.ankush.spring.projects.lms.repository;

import com.ankush.spring.projects.lms.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long > {
}
