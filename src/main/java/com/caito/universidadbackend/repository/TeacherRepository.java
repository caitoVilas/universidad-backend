package com.caito.universidadbackend.repository;

import com.caito.universidadbackend.entity.Career;
import com.caito.universidadbackend.entity.Pupil;
import com.caito.universidadbackend.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    List<Teacher> findByCareers(Career career);
    Optional<Teacher> findByNameAndLastname(String name, String lastname);
    Optional<Teacher> findByDni(String dni);
    List<Teacher> findByLastname(String lastname);
}
