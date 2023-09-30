package front;

import front.clients.ClientWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Desktop extends JFrame {
    private static final int WINDOW_HEIGHT = 400;
    private static final int WINDOW_WIDTH = 500;
    private static final int WINDOW_POSX = 1000;
    private static final int WINDOW_POSY = 250;
    JButton btnClients = new JButton("CLIENTS");
    JButton btnPets = new JButton("PETS");
    JButton btnConsultations = new JButton("CONSULTATIONS");
    ClientWindow clientWindow;

    public Desktop() {
        clientWindow = new ClientWindow(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Pets clinic");
        setResizable(false);
        setLayout(new GridLayout(3,1));
        add(btnClients);
        add(btnPets);
        add(btnConsultations);

        setVisible(true);

        btnClients.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clientWindow.setVisible(true);
            }
        });

        btnPets.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btnConsultations.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }
}
