package com.caito.universidadbackend.repository;

import com.caito.universidadbackend.entity.Career;
import com.caito.universidadbackend.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CareerRepository extends JpaRepository<Career, Long> {
    List<Career> findByNameLike(String name);
    List<Career> findByTeachers(Teacher teacher);
}
