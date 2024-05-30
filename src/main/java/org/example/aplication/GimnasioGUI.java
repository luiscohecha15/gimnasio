package org.example.aplication;

import org.example.aplication.service.PersonaServiceImpl;
import org.example.domain.Persona;
import org.example.infraestructure.repository.PersonaRepositoryImpl;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


public class GimnasioGUI extends JFrame{
    PersonaRepositoryImpl personaRepository = new PersonaRepositoryImpl();
    PersonaServiceImpl personaService = new PersonaServiceImpl(personaRepository);
    private JButton entrarAlGymButton;
    private JButton salirDelGymButton;
    private JTextField ingreseIdTextField;
    private JPanel panelMain;

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

                JOptionPane.showMessageDialog(entrarAlGymButton, ingreseIdTextField.getText() +
                        ", Bienvenido "+ persona.getNombre()+ " " + persona.getApellido());
                System.out.println(persona.toString());
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

                JOptionPane.showMessageDialog(entrarAlGymButton, ingreseIdTextField.getText() +
                        ", Hasta Luego "+ persona.getNombre());
                System.out.println(persona.toString());

            }
        });
    }

    public static void main(String[] args) {

        GimnasioGUI gym = new GimnasioGUI();
        gym.setContentPane(gym.panelMain);
        gym.setBounds(550,400,400,200);
        gym.setTitle("Programa Gym");
        gym.setVisible(true);
        gym.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
