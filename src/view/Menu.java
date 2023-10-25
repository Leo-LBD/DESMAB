package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.border.Border;

import telas.*;

public class Menu extends JFrame implements ActionListener{
	
	JMenuBar menubar;
	JMenu home_menu;
	JMenu about_menu;
	JMenu blog_menu;
	JMenu contact_menu;
	
	JMenuItem livro_item;
	JMenuItem autor_item;
	JMenuItem editora_item;
	
	JMenuItem podcast_item;
	JMenuItem article_item;
	JMenuItem message_item;
	JMenuItem donate_item;
	
	public Menu() {

		JFrame frame = new JFrame();
		setTitle("Frame title");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		/*Border label_border = BorderFactory.createLineBorder(Color.red, 2);
		
		JLabel label = new JLabel();
		label.setText("Bem vindo a livraria do Seu Quincas");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		//label.setBackground(Color.black);
		label.setOpaque(true);
		label.setBounds(30, 200 ,500,150);

		add(label);		
		*/
		
		menubar = new JMenuBar();
		
		home_menu = new JMenu("Home");
		about_menu = new JMenu("Inserir");
		blog_menu = new JMenu("Our blog");
		contact_menu = new JMenu("Contact us");
		
		livro_item = new JMenuItem("Livro");
		autor_item = new JMenuItem("Autor");
		editora_item = new JMenuItem("Editora");
		
		podcast_item = new JMenuItem("Podcast");
		article_item = new JMenuItem("Artigo");
		message_item = new JMenuItem("Mensagem");
		donate_item = new JMenuItem("Doações");
		
		this.setJMenuBar(menubar);
		
		menubar.add(home_menu);
		menubar.add(about_menu);
		menubar.add(blog_menu);
		menubar.add(contact_menu);
		
		about_menu.add(livro_item);
		about_menu.add(autor_item);
		about_menu.add(editora_item);
		
		blog_menu.add(podcast_item);
		blog_menu.add(article_item);
		contact_menu.add(message_item);
		contact_menu.add(donate_item);
		
		home_menu.addMenuListener(new MenuListener() {

			@Override
			public void menuSelected(MenuEvent e) {}

			@Override
			public void menuDeselected(MenuEvent e) {}

			@Override
			public void menuCanceled(MenuEvent e) {}});
		
		about_menu.addActionListener(this);
		blog_menu.addActionListener(this);
		contact_menu.addActionListener(this);
		livro_item.addActionListener(this);
		autor_item.addActionListener(this);
		editora_item.addActionListener(this);
		podcast_item.addActionListener(this);
		article_item.addActionListener(this);
		message_item.addActionListener(this);
		donate_item.addActionListener(this);

		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent d) {
		// TODO Auto-generated method stub
		
		if(d.getSource()==home_menu) {
			System.out.println("Você clicou na guia inicial");
		}else if(d.getSource()==about_menu) {
			System.out.println("Você clicou na guia sobre");
		}else if(d.getSource()==blog_menu) {
			System.out.println("Você clicou na guia blog");
		}else if(d.getSource()==contact_menu) {
			System.out.println("Você clicou na guia contato");
		}else if(d.getSource()==livro_item) {
			new Livro();
		}else if(d.getSource()==autor_item) {
			new Autor();
		}else if(d.getSource()==editora_item) {
			new Editora();
		}else if(d.getSource()==message_item) {
			System.out.println("Você clicou na guia mensagem");
		}else if(d.getSource()==donate_item) {
			System.out.println("Você clicou na guia doação");
		}
		
	}

	private JTextField campoNome;
    private JTextField campoSobrenome;
    private JButton botaoInserir;
    private DefaultListModel<String> listaModel;
    private JList<String> listaNomes;

    public void TelaComGBL() {
        setTitle("Tela com GBL e Lista");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

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
                String nomeCompleto = nome + " " + sobrenome;
                listaModel.addElement(nomeCompleto);
                campoNome.setText("");
                campoSobrenome.setText("");
            }
        });
    }

}
