package com.caito.universidadbackend.service.impl;

import com.caito.universidadbackend.entity.Career;
import com.caito.universidadbackend.entity.Pupil;
import com.caito.universidadbackend.repository.CareerRepository;
import com.caito.universidadbackend.repository.PupilRepository;
import com.caito.universidadbackend.service.contracts.PupilDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PupilService implements PupilDAO {
    @Autowired
    private PupilRepository repository;
    @Autowired
    private CareerRepository careerRepository;


    @Override
    @Transactional(readOnly = true)
    public Optional<Pupil> getById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Pupil save(Pupil entidad) {
        return repository.save(entidad);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Pupil> getAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Pupil> getByNameAndLastName(String name, String lastname) {
        return repository.findByNameAndLastname(name, lastname);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Pupil> getByCareer(Long career_id) {
        Career career = careerRepository.findById(career_id).orElse(null);
        if (career == null)
            return null;
        return repository.findByCareer(career);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Pupil> getByDni(String dni) {
        return repository.findByDni(dni);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Pupil> getByLastname(String lastname) {
        return repository.findByLastname(lastname);
    }
}
