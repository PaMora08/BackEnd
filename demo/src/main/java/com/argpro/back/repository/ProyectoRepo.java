package com.argpro.back.repository;

import com.argpro.back.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProyectoRepo extends JpaRepository<Proyecto, Long> {
    public boolean existsByNombreProy(String nombreProy);

    public Optional<Proyecto> findByNombreProy(String nombreProy);
}
