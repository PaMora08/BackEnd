package com.argpro.back.repository;

import com.argpro.back.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepo extends CrudRepository<Persona, Long> {

    public boolean existsByNombre(String nombre);

    public boolean existsById(Long idPersona);


}
