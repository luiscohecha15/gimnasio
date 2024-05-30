package org.example.aplication;

import org.example.aplication.service.PersonaServiceImpl;
import org.example.domain.MetodosMain;
import org.example.domain.Persona;
import org.example.infraestructure.repository.PersonaRepositoryImpl;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GimnasioGUI extends JFrame{

    PersonaRepositoryImpl personaRepository = new PersonaRepositoryImpl();
    PersonaServiceImpl personaService = new PersonaServiceImpl(personaRepository);
    private JButton entrarAlGymButton;
    private JButton salirDelGymButton;
    private JTextField ingreseIdTextField;
    private JPanel panelMain;
    private JTextField IdTextField1;
    private JTextField NombreTextField2;
    private JTextField ApellidoTextField3;
    private JButton CrearUsuarioButton;

    public GimnasioGUI() {
        entrarAlGymButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                long id = Long.parseLong(ingreseIdTextField.getText());

                Persona persona = personaService.findByid(id);

                if(persona == null){
                    JOptionPane.showMessageDialog(null,"Usuario no encontrado");
                    return;
                }
                persona.setIn_out(true);
                personaService.update(persona);

                JOptionPane.showMessageDialog(entrarAlGymButton, ingreseIdTextField.getText() +
                        ", Bienvenido "+ persona.getNombre()+ " " + persona.getApellido());
                MetodosMain.recorrerLista();
            }
        });

        salirDelGymButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                long id = Long.parseLong(ingreseIdTextField.getText());

                Persona persona = personaService.findByid(id);

                if(persona == null){
                    JOptionPane.showMessageDialog(null,"Usuario no encontrado");
                    return;
                }
                persona.setIn_out(false);
                personaService.update(persona);

                JOptionPane.showMessageDialog(entrarAlGymButton, ingreseIdTextField.getText() +
                        ", Hasta Luego "+ persona.getNombre());
                MetodosMain.recorrerLista();

            }
        });
        CrearUsuarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                long id = Long.parseLong(IdTextField1.getText());

                String nombre = NombreTextField2.getText();

                String apellido = ApellidoTextField3.getText();

                Persona persona = new Persona(id,nombre,apellido,false);
                try {
                    personaService.save(persona);
                    JOptionPane.showMessageDialog(CrearUsuarioButton, "Usuario registrado exitosamente. ");
                    System.out.println("Usuario registrado exitosamente. ");
                    IdTextField1.setText("");
                    NombreTextField2.setText("");
                    ApellidoTextField3.setText("");
                } catch (IllegalArgumentException i) {
                    System.out.println("Error: " + i.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {

        GimnasioGUI gym = new GimnasioGUI();
        gym.setContentPane(gym.panelMain);
        gym.setBounds(550,400,450,350);
        gym.setTitle("Programa Gym");
        gym.setVisible(true);
        gym.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
