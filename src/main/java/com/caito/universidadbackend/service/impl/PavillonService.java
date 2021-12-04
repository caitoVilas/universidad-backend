package com.caito.universidadbackend.service.impl;

import com.caito.universidadbackend.entity.Pavillon;
import com.caito.universidadbackend.repository.PavillonRepository;
import com.caito.universidadbackend.service.contracts.PavillonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PavillonService implements PavillonDAO {
    @Autowired
    private PavillonRepository repository;


    @Override
    @Transactional(readOnly = true)
    public Optional<Pavillon> getById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Pavillon save(Pavillon entidad) {
        return repository.save(entidad);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Pavillon> getAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
