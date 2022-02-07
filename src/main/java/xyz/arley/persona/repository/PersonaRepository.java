package xyz.arley.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import xyz.arley.persona.model.Persona;

public interface PersonaRepository extends JpaRepository <Persona, Long>{

}
