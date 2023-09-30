package front.clients;

import front.Desktop;
import org.openapitools.client.Start;
import org.openapitools.client.model.Client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class ClientWindow extends JFrame {
    private static final int WINDOW_HEIGHT = 400;
    private static final int WINDOW_WIDTH = 500;
    private static final int WINDOW_POSX = 1000;
    private static final int WINDOW_POSY = 250;

    JLabel log = new JLabel("Log console:");
    JButton btnCreate = new JButton("CREATE");
    JButton btnGetById = new JButton("READ");
    JButton btnUpdate = new JButton("UPDATE");
    JButton btnDelete = new JButton("DELETE");
    JButton btnGetAll = new JButton("SHOW ALL");

    JButton btnBack = new JButton("BACK");
    JTextArea messageField = new JTextArea();
    JPanel jPanelBottom = new JPanel(new GridLayout(2, 3));
    CreateWindow createWindow;
    UpdateWindow updateWindow;
    DeleteWindow deleteWindow;
    GetByIdWindow getByIdWindow;


    public JTextArea getMessageField() {
        return messageField;
    }

    private static final String FILENAME = "LOG.TXT";

    //region constructors
    public ClientWindow(Desktop desktop) {
        setLocationRelativeTo(desktop);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Clients");
        setResizable(false);
        add(log, BorderLayout.NORTH);
        add(messageField);

        jPanelBottom.add(btnCreate, BorderLayout.SOUTH);
        jPanelBottom.add(btnGetById, BorderLayout.SOUTH);
        jPanelBottom.add(btnUpdate, BorderLayout.SOUTH);
        jPanelBottom.add(btnDelete, BorderLayout.SOUTH);
        jPanelBottom.add(btnGetAll, BorderLayout.SOUTH);
        jPanelBottom.add(btnBack, BorderLayout.SOUTH);

        add(jPanelBottom, BorderLayout.SOUTH);


        messageField.setEditable(false);

        //region buttons listeners
        btnCreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createWindow = new CreateWindow(ClientWindow.this);
                createWindow.setVisible(true);
            }
        });
        btnGetById.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getByIdWindow = new GetByIdWindow(ClientWindow.this);
                getByIdWindow.setVisible(true);
            }
        });
        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateWindow = new UpdateWindow(ClientWindow.this);
                updateWindow.setVisible(true);
            }
        });
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteWindow = new DeleteWindow(ClientWindow.this);
                deleteWindow.setVisible(true);
            }
        });
        btnGetAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<Client> clientList = Start.getAll();
                if (clientList == null || clientList.isEmpty()) {
                    messageField.setText("Client list is empty.\n");
                } else {
                    messageField.setText("");
                    for (Client client : clientList) {
                        messageField.append(client.getClientId() + " "
                                + client.getSurname() + " "
                                + client.getFirstname() + " "
                                + client.getPatronymic() + " "
                                + client.getDocument() + " "
                                + client.getBirthday() + "\n");
                    }
                }
            }
        });

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        //endregion
    }
}
