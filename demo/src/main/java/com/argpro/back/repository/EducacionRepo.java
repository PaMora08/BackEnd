package com.argpro.back.repository;

import com.argpro.back.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface EducacionRepo extends JpaRepository<Educacion, Long> {
    public Optional<Educacion> findByNombreInst(String nombreInst);
    /*public boolean existsByTituloEdu(String titulo);*/
    public boolean existsByNombreInst(String nombreInst);

    boolean existsByTituloEdu(String tituloEdu);
}
