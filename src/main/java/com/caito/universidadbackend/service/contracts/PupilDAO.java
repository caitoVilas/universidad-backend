package com.caito.universidadbackend.service.contracts;

import com.caito.universidadbackend.entity.Pupil;

import java.util.List;
import java.util.Optional;

public interface PupilDAO extends GenericDAO<Pupil> {
    Optional<Pupil> getByNameAndLastName(String name, String lastname);
    List<Pupil> getByCareer(Long career_id);
    Optional<Pupil> getByDni(String dni);
    List<Pupil> getByLastname(String lastname);
}
