package front.clients;

import org.openapitools.client.Start;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class UpdateWindow extends JFrame {
    private static final int WINDOW_HEIGHT = 330;
    private static final int WINDOW_WIDTH = 450;
    JLabel clientIdLabel = new JLabel("ClientId:");
    JTextField clientIdField = new JTextField();
    JButton btnSubmit = new JButton("Submit");
    JLabel firstnameLabel = new JLabel("Firstname:");
    JTextField firstnameField = new JTextField();
    JLabel surnameLabel = new JLabel("Surname:");
    JTextField surnameField = new JTextField();
    JLabel patronymicLabel = new JLabel("Patronymic:");
    JTextField patronymicField = new JTextField();
    JLabel documentLabel = new JLabel("Document:");
    JTextField documentField = new JTextField();
    JLabel birthdayLabel = new JLabel("Birthday:");
    JTextField birthdayField = new JTextField();

    JPanel jPanelBottom = new JPanel(new BorderLayout());

    UpdateWindow(ClientWindow clientWindow) {

        setLocationRelativeTo(clientWindow);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setLayout(new GridLayout(13, 1));
        add(clientIdLabel);
        add(clientIdField);
        add(surnameLabel);
        add(surnameField);
        add(firstnameLabel);
        add(firstnameField);
        add(patronymicLabel);
        add(patronymicField);
        add(documentLabel);
        add(documentField);
        add(birthdayLabel);
        add(birthdayField);
        jPanelBottom.add(btnSubmit);
        add(jPanelBottom);
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer result = Start.clientUpdate(
                        clientIdField.getText(),
                        surnameField.getText(),
                        firstnameField.getText(),
                        patronymicField.getText(),
                        documentField.getText(),
                        LocalDate.parse(birthdayField.getText()));
                clientWindow.getMessageField().setText("Successfully updated items: " + result);

                setVisible(false);
            }
        });
    }
}
