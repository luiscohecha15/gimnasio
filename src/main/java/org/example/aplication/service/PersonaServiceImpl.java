package org.example.aplication.service;

import org.example.domain.Persona;
import org.example.interfaces.PersonaRepository;
import org.example.interfaces.PersonaService;

import java.util.List;

public class PersonaServiceImpl implements PersonaService {
    private final PersonaRepository personaRepository;
    public PersonaServiceImpl(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    @Override
    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    @Override
    public Persona findByid(int id) {
        return personaRepository.findByid(id);
    }

    @Override
    public void save(Persona persona) {
        personaRepository.save(persona);
    }
    @Override
    public void update(Persona persona) {
        personaRepository.update(persona);
    }
    @Override
    public void delete(int id) {
        personaRepository.delete(id);
    }
}
