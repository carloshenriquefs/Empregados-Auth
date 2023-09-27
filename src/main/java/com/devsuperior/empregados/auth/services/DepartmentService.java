package com.devsuperior.empregados.auth.services;

import java.util.List;
import java.util.stream.Collectors;

import com.devsuperior.empregados.auth.dto.DepartmentDTO;
import com.devsuperior.empregados.auth.entities.Department;
import com.devsuperior.empregados.auth.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository repository;
	
	public List<DepartmentDTO> findAll() {
		List<Department> list = repository.findAll(Sort.by("name"));
		return list.stream().map(x -> new DepartmentDTO(x)).collect(Collectors.toList());
	}
}
