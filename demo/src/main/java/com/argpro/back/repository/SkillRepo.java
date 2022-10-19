package com.argpro.back.repository;

import com.argpro.back.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SkillRepo extends JpaRepository<Skill, Long> {
    public Optional<Skill> findByNombreSkill(String nombreSkill);

    public boolean existsById(Long idSkill);

    boolean existsByNombreSkill(String nombreSkill);
}
