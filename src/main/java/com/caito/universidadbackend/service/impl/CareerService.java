package com.caito.universidadbackend.service.impl;

import com.caito.universidadbackend.entity.Career;
import com.caito.universidadbackend.entity.Teacher;
import com.caito.universidadbackend.repository.CareerRepository;
import com.caito.universidadbackend.repository.TeacherRepository;
import com.caito.universidadbackend.service.contracts.CareerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CareerService implements CareerDAO {
    @Autowired
    private CareerRepository repository;
    @Autowired
    private TeacherRepository teacherRepository;


    @Override
    @Transactional(readOnly = true)
    public List<Career> getByNameLike(String name) {
        return repository.findByNameLike(name);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Career> getByTeacher(Long teacher_id) {
        Teacher teacher = teacherRepository.findById(teacher_id).orElse(null);
        if (teacher == null)
        return null;
        return repository.findByTeachers(teacher);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Career> getById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Career save(Career entidad) {
        return repository.save(entidad);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Career> getAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
