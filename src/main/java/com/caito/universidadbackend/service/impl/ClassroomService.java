package com.caito.universidadbackend.service.impl;

import com.caito.universidadbackend.entity.Classroom;
import com.caito.universidadbackend.entity.Pavillon;
import com.caito.universidadbackend.models.enums.BlackboardType;
import com.caito.universidadbackend.repository.ClassroomRepository;
import com.caito.universidadbackend.repository.PavillonRepository;
import com.caito.universidadbackend.service.contracts.ClassroomDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.ParameterResolutionDelegate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ClassroomService implements ClassroomDAO {
    @Autowired
    private ClassroomRepository repository;
    @Autowired
    private PavillonRepository pavillonRepository;


    @Override
    @Transactional(readOnly = true)
    public List<Classroom> getByBlackboard(BlackboardType blackboard) {
        return repository.findByBlackboard(blackboard);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Classroom> getByPavillon(Long pavillon_id) {
        Pavillon pavillon = pavillonRepository.findById(pavillon_id).orElse(null);
        if (pavillon == null)
            return null;
        return repository.findByPavillon(pavillon);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Classroom> getByNroClassroom(Integer nroClassroom) {
        return repository.findByNroClassroom(nroClassroom);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Classroom> getById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Classroom save(Classroom entidad) {
        return repository.save(entidad);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Classroom> getAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
