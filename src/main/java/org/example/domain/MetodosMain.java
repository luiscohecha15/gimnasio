package org.example.domain;

import org.example.aplication.service.PersonaServiceImpl;
import org.example.infraestructure.repository.PersonaRepositoryImpl;

import java.util.List;
import java.util.Scanner;


public class MetodosMain {
    private static final Scanner scanner = new Scanner(System.in);
    static PersonaRepositoryImpl personaRepository = new PersonaRepositoryImpl();
    static PersonaServiceImpl personaService = new PersonaServiceImpl(personaRepository);

    public static void registrarPersona() {
        System.out.println("Ingrese el nombre: ");
        String nombre = scanner.next();
        System.out.println("Ingrese el apellido: ");
        String apellido = scanner.next();
        System.out.println("Ingrese el id: ");
        long id = scanner.nextLong();

        Persona persona = new Persona(id,nombre,apellido,false);
        try {
            personaService.save(persona);
            System.out.println("Paciente registrado exitosamente. ");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void actualizarPersona() {
        System.out.println("ingrese el id  del paciente a actualizar:");
        long cc = scanner.nextLong();
        scanner.nextLine();
        Persona personas = personaService.findByid(cc);
        if (personas == null) {
            System.out.println("no se encontro la persona con cc:" + cc);
            return;
        }
        System.out.println("ingrese el nuevo nombre de la persona (dejar en blanco para no cambiar) :");
        String nombre = scanner.next();
        if (nombre.isEmpty()) {
            personas.setNombre(nombre);
        }
        System.out.println("ingrese el nuevo apellido de la persona (dejar en blanco para no cambiar)");
        String apellido = scanner.next();
        if (apellido.isEmpty()) {
            personas.setApellido(apellido);
        }
        try {
        personaService.update(personas);
        System.out.println("paciente actualizado exitosamente.");
        }catch (IllegalArgumentException e){
            System.out.println("Error"+ e.getMessage());
        }
    }

    public static void recorrerLista(){
        List<Persona> personas = personaService.findAll();

        for (Persona persona : personas){
            System.out.println(persona.toString());
        }
    }
}