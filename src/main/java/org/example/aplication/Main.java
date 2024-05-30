package org.example.aplication;

import org.example.aplication.service.PersonaServiceImpl;
import org.example.domain.MetodosMain;
import org.example.domain.Persona;
import org.example.infraestructure.repository.PersonaRepositoryImpl;
import org.example.interfaces.PersonaRepository;
import org.example.interfaces.PersonaService;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);


    GimnasioGUI gimnasioGUI = new GimnasioGUI();

    public static void main(String[] args) {
        boolean salir = false;
        while (!salir) {
            System.out.println("1. Registrar");
            System.out.println("2. Actualizar datos");
            System.out.println("3. ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    MetodosMain.registrarPersona();
                    break;
                case 2:
                    MetodosMain.actualizarPersona();
                    break;
                case 3:
                    MetodosMain.recorrerLista();
                    break;
                case 4:
                    salir = true;
                    break;

                default:
                    System.out.println("Opción inválida");
            }
        }

    }
}