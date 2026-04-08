package com.sbp;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface empRepo extends JpaRepository<Employee, Integer> {
	List<Employee> findAll();
	List<Employee> findByName(String name);
	

}
