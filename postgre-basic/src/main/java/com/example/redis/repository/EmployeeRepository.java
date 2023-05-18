package com.example.redis.repository;

import com.example.redis.model.Employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	@Query(value = "SELECT e FROM Employee e where id>2")
	public List<Employee> findAllSelectedEmployee();
	
	@Query(value = "SELECT e FROM Employee e where firstName= :fName")
	public List<Employee> findSingleEmployee(@Param("fName") String fName);
}