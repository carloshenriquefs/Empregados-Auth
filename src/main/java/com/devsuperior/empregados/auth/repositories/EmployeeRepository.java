package com.devsuperior.empregados.auth.repositories;

import com.devsuperior.empregados.auth.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
