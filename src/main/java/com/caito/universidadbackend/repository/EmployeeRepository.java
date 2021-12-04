package com.caito.universidadbackend.repository;

import com.caito.universidadbackend.entity.Employee;
import com.caito.universidadbackend.entity.Pavillon;
import com.caito.universidadbackend.models.enums.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByEmployeetype(EmployeeType employeeType);
    List<Employee> findByPavillon(Pavillon pavillon);
}
