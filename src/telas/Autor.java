package telas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Autor extends JFrame {
    private JTextField campoNome;
    private JTextField campoSobrenome;
    private JButton botaoInserir;
    private DefaultListModel<String> listaModel;
    private JList<String> listaNomes;
    private int proximoIdentificador = 1;
    
    public Autor() {
        setTitle("Cadastro Autor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setResizable(false);

        // Criação dos componentes
        campoNome = new JTextField(20);
        campoSobrenome = new JTextField(20);
        botaoInserir = new JButton("Inserir");
        listaModel = new DefaultListModel<>();
        listaNomes = new JList<>(listaModel);

        // Criação do GBL
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        // Configurações do campo Nome
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(5, 5, 5, 5);
        add(new JLabel("Nome:"), constraints);

        constraints.gridx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add(campoNome, constraints);

        // Configurações do campo Sobrenome
        constraints.gridx = 0;
        constraints.gridy = 1;
        add(new JLabel("Sobrenome:"), constraints);

        constraints.gridx = 1;
        add(campoSobrenome, constraints);

        // Configurações do botão Inserir
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.EAST;
        add(botaoInserir, constraints);

        // Configurações da lista de nomes
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.gridheight = 2;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        add(new JScrollPane(listaNomes), constraints);

        // Ação do botão Inserir
        botaoInserir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String nome = campoNome.getText();
                String sobrenome = campoSobrenome.getText();

                // Verifica se atingiu o limite de 1000 identificadores
                if (proximoIdentificador <= 1000) {
                    // Crie o nome completo do autor
                    String nomeCompleto = nome + " " + sobrenome;

                    // Adicione o nome completo e o identificador à lista
                    String autorInfo = proximoIdentificador + " - " + nomeCompleto;
                    listaModel.addElement(autorInfo);

                    // Incremente o identificador para o próximo autor
                    proximoIdentificador++;

                    // Limpe os campos de texto
                    campoNome.setText("");
                    campoSobrenome.setText("");
                } else {
                    JOptionPane.showMessageDialog(Autor.this, "Limite de 1000 autores atingido.");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Autor tela = new Autor();
                tela.setVisible(true);
            }
        });
    }
}

