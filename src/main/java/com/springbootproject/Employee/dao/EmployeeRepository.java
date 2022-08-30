package com.springbootproject.Employee.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootproject.Employee.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
