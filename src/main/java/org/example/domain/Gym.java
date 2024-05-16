package org.example.domain;

import org.example.aplication.service.PersonaServiceImpl;
import org.example.infraestructure.repository.PersonaRepositoryImpl;
import org.example.interfaces.PersonaRepository;
import org.example.interfaces.PersonaService;

import java.util.Scanner;

public class Gym {
    private static final Scanner scanner = new Scanner(System.in);
    private static final PersonaService personaService;

    static {
        PersonaRepository personaRepository = new PersonaRepositoryImpl();
        personaService = new PersonaServiceImpl(personaRepository);
    }

    //creacion de metodos para la interfaz
    public void registroPersona(){

    }

    //....
}
