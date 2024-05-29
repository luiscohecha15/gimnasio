package org.example.interfaces;

import org.example.domain.Persona;

import java.util.List;

public interface PersonaRepository {
    List<Persona> findAll();
    Persona findByid(long id);
    void save(Persona persona);
    void update(Persona persona);
    void delete(long id);
    void filterIn_out(boolean in_out);
}
