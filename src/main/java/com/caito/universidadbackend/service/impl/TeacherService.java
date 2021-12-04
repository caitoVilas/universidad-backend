package com.caito.universidadbackend.service.impl;

import com.caito.universidadbackend.entity.Career;
import com.caito.universidadbackend.entity.Teacher;
import com.caito.universidadbackend.repository.CareerRepository;
import com.caito.universidadbackend.repository.TeacherRepository;
import com.caito.universidadbackend.service.contracts.TeacherDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
public class TeacherService implements TeacherDAO {

    @Autowired
    private TeacherRepository repository;
    @Autowired
    private CareerRepository careerRepository;


    @Override
    @Transactional(readOnly = true)
    public Optional<Teacher> getById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Teacher save(Teacher entidad) {
        return repository.save(entidad);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Teacher> getAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Teacher> getByNameAndLastName(String name, String lastname) {
        return repository.findByNameAndLastname(name, lastname);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Teacher> getByCareer(Long career_id) {
        Career career = careerRepository.findById(career_id).orElse(null);
        if (career == null)
            return null;
        return repository.findByCareers(career);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Teacher> getByDni(String dni) {
        return repository.findByDni(dni);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Teacher> getByLastname(String lastname) {
        return repository.findByLastname(lastname);
    }
}
