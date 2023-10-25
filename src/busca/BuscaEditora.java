package busca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BuscaEditora extends JFrame {
    private JTextField campoNomeEditora;
    private JFormattedTextField campoData;
    private JButton botaoBuscar;
    private JLabel resultadoBusca;

    public BuscaEditora() {
    	setTitle("Tela de Busca de Editora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);

        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        // Configurações do campo de busca por nome de editora
        JLabel labelNomeEditora = new JLabel("Nome da Editora:");
        campoNomeEditora = new JTextField(20);

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(5, 5, 5, 5);
        add(labelNomeEditora, constraints);

        constraints.gridx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add(campoNomeEditora, constraints);

        // Configurações do campo de seleção de data
        JLabel labelData = new JLabel("Data:");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        campoData = new JFormattedTextField(dateFormat);
        campoData.setColumns(10);

        constraints.gridx = 0;
        constraints.gridy = 1;
        add(labelData, constraints);

        constraints.gridx = 1;
        add(campoData, constraints);

        // Configurações do botão de busca
        botaoBuscar = new JButton("Buscar");

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.CENTER;
        add(botaoBuscar, constraints);

        // Configurações do campo de resultado da pesquisa
        resultadoBusca = new JLabel("Resultado da Busca:");

        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add(resultadoBusca, constraints);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                BuscaEditora tela = new BuscaEditora();
                tela.setVisible(true);
            }
        });
    }
}
