package org.example.interfaces;

import org.example.domain.Persona;

import java.util.List;

public interface PersonaService {
    List<Persona> findAll();
    Persona findByid(int id);
    void save(Persona persona);
    void update(Persona persona);
    void delete(int id);
}
