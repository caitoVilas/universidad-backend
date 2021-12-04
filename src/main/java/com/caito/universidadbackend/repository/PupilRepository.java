package com.caito.universidadbackend.repository;

import com.caito.universidadbackend.entity.Career;
import com.caito.universidadbackend.entity.Pupil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PupilRepository extends JpaRepository<Pupil, Long> {
    List<Pupil> findByCareer(Career career);
    Optional<Pupil> findByNameAndLastname(String name, String lastname);
    Optional<Pupil> findByDni(String dni);
    List<Pupil> findByLastname(String lastname);
}
