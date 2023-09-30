package front.clients;

import org.openapitools.client.Start;
import org.openapitools.client.model.Client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class GetByIdWindow extends JFrame {
    private static final int WINDOW_HEIGHT = 130;
    private static final int WINDOW_WIDTH = 250;
    JLabel clientIdLabel = new JLabel("ClientId:");
    JTextField clientIdField = new JTextField();
    JButton btnSubmit = new JButton("Submit");
    JPanel jPanelBottom = new JPanel(new BorderLayout());

    GetByIdWindow(ClientWindow clientWindow) {

        setLocationRelativeTo(clientWindow);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setLayout(new GridLayout(3, 1));
        add(clientIdLabel);
        add(clientIdField);
        jPanelBottom.add(btnSubmit);
        add(jPanelBottom);
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Client client = Start.getById(clientIdField.getText());
                if (client == null) {
                    clientWindow.getMessageField().setText("Client is missing by this id.\n");
                } else {
                    clientWindow.getMessageField().setText(client.getClientId() + " "
                            + client.getSurname() + " "
                            + client.getFirstname() + " "
                            + client.getPatronymic() + " "
                            + client.getDocument() + " "
                            + client.getBirthday() + "\n");
                }
                setVisible(false);
            }
        });
    }
}
