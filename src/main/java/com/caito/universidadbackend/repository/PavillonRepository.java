package com.caito.universidadbackend.repository;

import com.caito.universidadbackend.entity.Pavillon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PavillonRepository extends JpaRepository<Pavillon, Long> {
}
