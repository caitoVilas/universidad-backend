package com.caito.universidadbackend.service.contracts;

import com.caito.universidadbackend.entity.Career;

import java.util.List;

public interface CareerDAO extends GenericDAO<Career>{
    List<Career> getByNameLike(String name);
    List<Career> getByTeacher(Long teacher_id);
}
