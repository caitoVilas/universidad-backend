package com.caito.universidadbackend.service.contracts;

import java.util.List;
import java.util.Optional;

public interface GenericDAO <E>{
    Optional<E> getById(Long id);
    E save(E entidad);
    List<E> getAll();
    void delete(Long id);
}
