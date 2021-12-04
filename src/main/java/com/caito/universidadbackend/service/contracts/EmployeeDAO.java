package com.caito.universidadbackend.service.contracts;

import com.caito.universidadbackend.entity.Employee;
import com.caito.universidadbackend.models.enums.EmployeeType;

import java.util.List;

public interface EmployeeDAO extends GenericDAO<Employee> {
    List<Employee> getByEmployeeType(EmployeeType employeeType);
    List<Employee> getByPavillon(Long pavillon_id);
 }
