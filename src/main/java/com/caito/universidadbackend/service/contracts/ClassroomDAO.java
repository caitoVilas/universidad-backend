package com.caito.universidadbackend.service.contracts;

import com.caito.universidadbackend.entity.Classroom;
import com.caito.universidadbackend.models.enums.BlackboardType;

import java.util.List;
import java.util.Optional;

public interface ClassroomDAO extends GenericDAO<Classroom> {
    List<Classroom> getByBlackboard(BlackboardType blackboard);
    List<Classroom> getByPavillon(Long pavillon_id);
    Optional<Classroom> getByNroClassroom(Integer nroClassroom);
}
