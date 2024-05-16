package org.example.aplication;

import org.example.aplication.service.PersonaServiceImpl;
import org.example.domain.Persona;
import org.example.infraestructure.repository.PersonaRepositoryImpl;
import org.example.interfaces.PersonaRepository;
import org.example.interfaces.PersonaService;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        boolean salir = false;
        while (!salir) {
            System.out.println("1. RegistrarPaciente");
            System.out.println("2. Actualizar datos");
            System.out.println("3. registrar cita paciente existente");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:

                    break;
                case 2:
                    salir = true;
                    break;

                default:
                    System.out.println("Opción inválida");
            }
        }

    }

    //metodos


}