package com.devsuperior.empregados.auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.empregados.auth.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
