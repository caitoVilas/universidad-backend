package com.caito.universidadbackend.repository;

import com.caito.universidadbackend.entity.Classroom;
import com.caito.universidadbackend.entity.Pavillon;
import com.caito.universidadbackend.models.enums.BlackboardType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClassroomRepository extends JpaRepository<Classroom, Long> {
    List<Classroom> findByBlackboard(BlackboardType blackboard);
    List<Classroom> findByPavillon(Pavillon pavillon);
    Optional<Classroom> findByNroClassroom(Integer nroClassroom);
}
