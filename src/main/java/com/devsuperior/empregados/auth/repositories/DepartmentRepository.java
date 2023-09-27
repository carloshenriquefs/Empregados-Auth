package com.devsuperior.empregados.auth.repositories;

import com.devsuperior.empregados.auth.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
