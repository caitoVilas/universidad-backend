package com.caito.universidadbackend.service.impl;

import com.caito.universidadbackend.entity.Employee;
import com.caito.universidadbackend.entity.Pavillon;
import com.caito.universidadbackend.models.enums.EmployeeType;
import com.caito.universidadbackend.repository.EmployeeRepository;
import com.caito.universidadbackend.repository.PavillonRepository;
import com.caito.universidadbackend.service.contracts.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements EmployeeDAO {
    @Autowired
    private EmployeeRepository repository;
    @Autowired
    private PavillonRepository pavillonRepository;


    @Override
    @Transactional(readOnly = true)
    public List<Employee> getByEmployeeType(EmployeeType employeeType) {
        return repository.findByEmployeetype(employeeType);
    }

    @Override
    public List<Employee> getByPavillon(Long pavillon_id) {
        Pavillon pavillon = pavillonRepository.findById(pavillon_id).orElse(null);
        if (pavillon == null)
            return null;
        return repository.findByPavillon(pavillon);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Employee> getById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Employee save(Employee entidad) {
        return repository.save(entidad);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Employee> getAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
