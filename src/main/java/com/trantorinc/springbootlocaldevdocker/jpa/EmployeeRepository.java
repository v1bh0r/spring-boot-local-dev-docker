package com.trantorinc.springbootlocaldevdocker.jpa;

import com.trantorinc.springbootlocaldevdocker.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
