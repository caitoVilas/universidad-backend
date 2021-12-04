package com.caito.universidadbackend.service.contracts;

import com.caito.universidadbackend.entity.Pupil;
import com.caito.universidadbackend.entity.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherDAO extends GenericDAO<Teacher> {
    Optional<Teacher> getByNameAndLastName(String name, String lastname);
    List<Teacher> getByCareer(Long career_id);
    Optional<Teacher> getByDni(String dni);
    List<Teacher> getByLastname(String lastname);
}
