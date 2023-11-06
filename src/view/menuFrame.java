package view;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.event.MenuListener;

import entidades.Autor;
import entidades.Editora;
import entidades.Livro;
import entidades.LivroAutor;

import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;

public class menuFrame implements View{
	private JTextField ISBNTextArea;
	private JTextField TituloTextArea;
	private JTextField PrecoTextArea;
	private javax.swing.JButton btnIncluirLivro;
	private javax.swing.JButton btnIncluirAutor;
	private javax.swing.JButton btnIncluirEditora;
	private JTextField NomeTextArea;
	private JTextField SobrenomeTextArea;
	private JTextField NomeETextArea;
	private JTextField UrlTextArea;
	private JTextField BuscarTituloTextArea;
	private JTextField BuscarAutorNomeTextField;
	private JTextField BuscarAutorSobrenomeTextField;
	private JTextField BuscarEditoraNomeTetField;
	private JTextField DeletarLivroISBNTextArea;
	private JTextField DeletarAutorIdTextField;
	private JTextField DeletarIdEditoraTetField;
	private JTabbedPane tabbedPane;
	private JTabbedPane Incluir;
	private JTabbedPane Buscar;
	private JTabbedPane Editar;
	private JTabbedPane Deletar;
	private JComboBox comboBoxIncluirLivro;
	
	
	JMenuBar menubar;
	JMenu home_menu;
	JMenu inserir_menu;
	JMenu buscar_menu;
	JMenu editar_menu;
	JMenu deletar_menu;
	
	JMenuItem Livro_item;
	JMenuItem Autor_item;
	JMenuItem Editora_item;
	
	JMenuItem BuscaEditora_item;
	JMenuItem BuscaLivro_item;
	JMenuItem BuscaAutor_item;
	
	JMenuItem EditarLivro_item;
	JMenuItem EditarAutor_item;
	JMenuItem EditarEditora_item;
	
	JMenuItem DeletarLivro_item;
	JMenuItem DeletarAutor_item;
	JMenuItem DeletarEditora_item;
	
	DefaultComboBoxModel<Editora> selecaoEditora = new DefaultComboBoxModel<Editora>();
	DefaultComboBoxModel<Livro> selecaoLivro = new DefaultComboBoxModel<Livro>();
	DefaultComboBoxModel<Autor> selecaoAutor = new DefaultComboBoxModel<Autor>();

	public menuFrame() {
		JFrame frame = new JFrame();
		frame.setTitle("BorderPane");
		frame.setSize(812, 562);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		menubar = new JMenuBar();
		
		home_menu = new JMenu("Home");
		inserir_menu = new JMenu("Inserir");
		buscar_menu = new JMenu("Buscar");
		deletar_menu = new JMenu("Deletar");
		editar_menu = new JMenu("Editar");
		
		Livro_item = new JMenuItem("Livro");
		Livro_item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
				Incluir.setSelectedIndex(2);
			}
		});
		
		Autor_item = new JMenuItem("Autor");
		Autor_item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
				Incluir.setSelectedIndex(0);
			}
		});
		
		Editora_item = new JMenuItem("Editora");
		Editora_item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
				Incluir.setSelectedIndex(1);
			}
		});
		
		BuscaLivro_item = new JMenuItem("Livro");
		BuscaLivro_item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
				Buscar.setSelectedIndex(0);
			}
		});
		
		BuscaAutor_item = new JMenuItem("Autor");
		BuscaAutor_item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
				Buscar.setSelectedIndex(1);
			}
		});
		
		BuscaEditora_item = new JMenuItem("Editora");
		BuscaEditora_item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
				Buscar.setSelectedIndex(2);
			}
		});
		
		DeletarLivro_item = new JMenuItem("Livro");
		DeletarLivro_item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
				Deletar.setSelectedIndex(0);
			}
		});
		
		DeletarAutor_item = new JMenuItem("Autor");
		DeletarAutor_item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
				Deletar.setSelectedIndex(1);
			}
		});
		DeletarEditora_item = new JMenuItem("Editora");
		DeletarEditora_item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
				Deletar.setSelectedIndex(2);
			}
		});
		EditarLivro_item = new JMenuItem("Livro");
		EditarLivro_item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
				Editar.setSelectedIndex(0);
			}
		});
		
		EditarAutor_item = new JMenuItem("Autor");
		EditarAutor_item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
				Editar.setSelectedIndex(1);
			}
		});
		EditarEditora_item = new JMenuItem("Editora");
		EditarEditora_item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
				Editar.setSelectedIndex(2);
			}
		});
		
		
		frame.setJMenuBar(menubar);
		
		menubar.add(home_menu);
		menubar.add(inserir_menu);
		menubar.add(buscar_menu);
		menubar.add(editar_menu);
		menubar.add(deletar_menu);
		
		inserir_menu.add(Livro_item);
		inserir_menu.add(Autor_item);
		inserir_menu.add(Editora_item);
		
		buscar_menu.add(BuscaLivro_item);
		buscar_menu.add(BuscaAutor_item);
		buscar_menu.add(BuscaEditora_item);
		
		editar_menu.add(EditarLivro_item);
		editar_menu.add(EditarAutor_item);
		editar_menu.add(EditarEditora_item);
		
		deletar_menu.add(DeletarLivro_item);
		deletar_menu.add(DeletarAutor_item);
		deletar_menu.add(DeletarEditora_item);
	
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.RIGHT);
		
		tabbedPane.setBounds(-11, -11, 875, 552);
		panel.add(tabbedPane);
		
		Incluir = new JTabbedPane(JTabbedPane.BOTTOM);
		tabbedPane.addTab("Incluir", null, Incluir, null);
		
		Incluir.setVisible(false);
		
		JPanel IncluirAutor = new JPanel();
		Incluir.addTab("Autor", null, IncluirAutor, null);
		IncluirAutor.setLayout(null);
		
		JLabel JanelaAutorIncluir = new JLabel("Cadastrar Autor");
		JanelaAutorIncluir.setFont(new Font("Arial", Font.BOLD, 20));
		JanelaAutorIncluir.setBounds(20, 11, 172, 40);
		IncluirAutor.add(JanelaAutorIncluir);
		
		JLabel lblNewLabel_2_1 = new JLabel("________________________________________________________________________________________________________________________________");
		lblNewLabel_2_1.setBounds(10, 50, 783, 14);
		IncluirAutor.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_7 = new JLabel("Nome");
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(20, 92, 40, 14);
		IncluirAutor.add(lblNewLabel_7);
		
		NomeTextArea = new JTextField();
		NomeTextArea.setBounds(58, 89, 186, 20);
		IncluirAutor.add(NomeTextArea);
		NomeTextArea.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Sobrenome");
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_8.setBounds(20, 117, 67, 14);
		IncluirAutor.add(lblNewLabel_8);
		
		SobrenomeTextArea = new JTextField();
		SobrenomeTextArea.setBounds(97, 114, 147, 20);
		IncluirAutor.add(SobrenomeTextArea);
		SobrenomeTextArea.setColumns(10);
		
		btnIncluirAutor = new JButton("Incluir");
		btnIncluirAutor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIncluirAutor.setFont(new Font("Arial", Font.PLAIN, 11));
		btnIncluirAutor.setBounds(704, 192, 89, 23);
		IncluirAutor.add(btnIncluirAutor);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(20, 225, 773, 272);
		IncluirAutor.add(scrollPane_1);
		
		JPanel IncluirEditora = new JPanel();
		Incluir.addTab("Editora", null, IncluirEditora, null);
		IncluirEditora.setLayout(null);
		
		JLabel JanelaEditoraIncluir = new JLabel("Cadastrar Editora");
		JanelaEditoraIncluir.setFont(new Font("Arial", Font.BOLD, 20));
		JanelaEditoraIncluir.setBounds(20, 11, 175, 40);
		IncluirEditora.add(JanelaEditoraIncluir);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("________________________________________________________________________________________________________________________________");
		lblNewLabel_2_1_1.setBounds(10, 50, 780, 14);
		IncluirEditora.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_9 = new JLabel("Nome");
		lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_9.setBounds(20, 83, 39, 14);
		IncluirEditora.add(lblNewLabel_9);
		
		NomeETextArea = new JTextField();
		NomeETextArea.setBounds(60, 80, 202, 20);
		IncluirEditora.add(NomeETextArea);
		NomeETextArea.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Url");
		lblNewLabel_10.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_10.setBounds(20, 117, 29, 14);
		IncluirEditora.add(lblNewLabel_10);
		
		UrlTextArea = new JTextField();
		UrlTextArea.setBounds(45, 114, 217, 20);
		IncluirEditora.add(UrlTextArea);
		UrlTextArea.setColumns(10);
		
		btnIncluirEditora = new JButton("Incluir");
		btnIncluirEditora.setBounds(701, 201, 89, 23);
		IncluirEditora.add(btnIncluirEditora);
		
		JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setBounds(20, 231, 770, 264);
		IncluirEditora.add(scrollPane_1_1);
		
		JPanel IncluirLivro = new JPanel();
		Incluir.addTab("Livro", null, IncluirLivro, null);
		IncluirLivro.setLayout(null);
		
		JLabel JanelaLivroIncluir = new JLabel("Cadastrar Livro");
		JanelaLivroIncluir.setFont(new Font("Arial", Font.BOLD, 20));
		JanelaLivroIncluir.setBounds(20, 11, 147, 40);
		IncluirLivro.add(JanelaLivroIncluir);
		
		JLabel isbn = new JLabel("ISBN");
		isbn.setFont(new Font("Arial", Font.PLAIN, 13));
		isbn.setBounds(20, 75, 34, 14);
		IncluirLivro.add(isbn);
		
		JLabel lblNewLabel_2 = new JLabel("________________________________________________________________________________________________________________________________");
		lblNewLabel_2.setBounds(10, 50, 783, 14);
		IncluirLivro.add(lblNewLabel_2);
		
		ISBNTextArea = new JTextField();
		ISBNTextArea.setBounds(59, 72, 79, 20);
		IncluirLivro.add(ISBNTextArea);
		ISBNTextArea.setColumns(10);
		
		JLabel title = new JLabel("Titulo");
		title.setFont(new Font("Arial", Font.PLAIN, 13));
		title.setBounds(20, 107, 46, 14);
		IncluirLivro.add(title);
		
		TituloTextArea = new JTextField();
		TituloTextArea.setBounds(59, 103, 158, 20);
		IncluirLivro.add(TituloTextArea);
		TituloTextArea.setColumns(10);
		
		JLabel price = new JLabel("Preço");
		price.setFont(new Font("Arial", Font.PLAIN, 13));
		price.setBounds(20, 139, 46, 14);
		IncluirLivro.add(price);
		
		PrecoTextArea = new JTextField();
		PrecoTextArea.setBounds(59, 134, 108, 20);
		IncluirLivro.add(PrecoTextArea);
		PrecoTextArea.setColumns(10);
		
		JLabel publisher = new JLabel("Editora");
		publisher.setFont(new Font("Arial", Font.PLAIN, 13));
		publisher.setBounds(20, 174, 46, 14);
		IncluirLivro.add(publisher);
		
		comboBoxIncluirLivro = new JComboBox();
		comboBoxIncluirLivro.setBounds(76, 170, 147, 22);
		IncluirLivro.add(comboBoxIncluirLivro);
		comboBoxIncluirLivro.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Editora editora = (Editora) comboBoxIncluirLivro.getSelectedItem();
				
			}
			
		});
		
		comboBoxIncluirLivro.setModel(selecaoEditora);
		comboBoxIncluirLivro.setRenderer(new EditoraRenderer());
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 231, 773, 266);
		IncluirLivro.add(scrollPane);
		
		btnIncluirLivro = new JButton("Incluir");
		btnIncluirLivro.setBounds(704, 197, 89, 23);
		btnIncluirLivro.addActionListener(new ActionListener() {
			
				public void actionPerformed(ActionEvent e) {
					btnIncluirActionPerformed(e);
				}
			});
		IncluirLivro.add(btnIncluirLivro);
		
		Buscar = new JTabbedPane(JTabbedPane.BOTTOM);
		tabbedPane.addTab("Buscar", null, Buscar, null);
		
		JPanel BuscaLivro = new JPanel();
		Buscar.addTab("Livro", null, BuscaLivro, null);
		BuscaLivro.setLayout(null);
		
		JLabel lblBuscarLivro = new JLabel("Buscar Livro");
		lblBuscarLivro.setFont(new Font("Arial", Font.BOLD, 20));
		lblBuscarLivro.setBounds(20, 11, 147, 40);
		BuscaLivro.add(lblBuscarLivro);
		
		JLabel lblNewLabel_2_2 = new JLabel("__________________________________________________________________________________________________________________________");
		lblNewLabel_2_2.setBounds(10, 50, 739, 14);
		BuscaLivro.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel = new JLabel("Titulo");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel.setBounds(20, 84, 46, 14);
		BuscaLivro.add(lblNewLabel);
		
		BuscarTituloTextArea = new JTextField();
		BuscarTituloTextArea.setBounds(58, 81, 159, 20);
		BuscaLivro.add(BuscarTituloTextArea);
		BuscarTituloTextArea.setColumns(10);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 231, 754, 252);
		BuscaLivro.add(scrollPane_2);
		
		JButton btnBuscarLivro = new JButton("Buscar");
		btnBuscarLivro.setBounds(675, 197, 89, 23);
		BuscaLivro.add(btnBuscarLivro);
		
		JPanel BuscaAutor = new JPanel();
		Buscar.addTab("Autor", null, BuscaAutor, null);
		BuscaAutor.setLayout(null);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("__________________________________________________________________________________________________________________________");
		lblNewLabel_2_2_1.setBounds(10, 50, 739, 14);
		BuscaAutor.add(lblNewLabel_2_2_1);
		
		JLabel lblBuscarAutor = new JLabel("Buscar Autor");
		lblBuscarAutor.setFont(new Font("Arial", Font.BOLD, 20));
		lblBuscarAutor.setBounds(20, 11, 147, 40);
		BuscaAutor.add(lblBuscarAutor);
		
		JLabel BuscarNomeAutor = new JLabel("Nome");
		BuscarNomeAutor.setFont(new Font("Arial", Font.PLAIN, 13));
		BuscarNomeAutor.setBounds(20, 84, 46, 14);
		BuscaAutor.add(BuscarNomeAutor);
		
		BuscarAutorNomeTextField = new JTextField();
		BuscarAutorNomeTextField.setColumns(10);
		BuscarAutorNomeTextField.setBounds(58, 81, 182, 20);
		BuscaAutor.add(BuscarAutorNomeTextField);
		
		JButton btnBuscarAutor = new JButton("Buscar");
		btnBuscarAutor.setBounds(675, 197, 89, 23);
		BuscaAutor.add(btnBuscarAutor);
		
		JScrollPane scrollPane_2_1 = new JScrollPane();
		scrollPane_2_1.setBounds(10, 231, 754, 252);
		BuscaAutor.add(scrollPane_2_1);
		
		JLabel BuscarSobrenomeAutor = new JLabel("Sobrenome");
		BuscarSobrenomeAutor.setFont(new Font("Arial", Font.PLAIN, 13));
		BuscarSobrenomeAutor.setBounds(20, 115, 72, 14);
		BuscaAutor.add(BuscarSobrenomeAutor);
		
		BuscarAutorSobrenomeTextField = new JTextField();
		BuscarAutorSobrenomeTextField.setBounds(102, 112, 138, 20);
		BuscaAutor.add(BuscarAutorSobrenomeTextField);
		BuscarAutorSobrenomeTextField.setColumns(10);
		
		JPanel BuscaEditora = new JPanel();
		Buscar.addTab("Editora", null, BuscaEditora, null);
		BuscaEditora.setLayout(null);
		
		JLabel lblBuscarEditora = new JLabel("Buscar Editora");
		lblBuscarEditora.setFont(new Font("Arial", Font.BOLD, 20));
		lblBuscarEditora.setBounds(20, 11, 147, 40);
		BuscaEditora.add(lblBuscarEditora);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("__________________________________________________________________________________________________________________________");
		lblNewLabel_2_2_2.setBounds(10, 50, 739, 14);
		BuscaEditora.add(lblNewLabel_2_2_2);
		
		JLabel BuscarEditoraNome = new JLabel("Nome");
		BuscarEditoraNome.setFont(new Font("Arial", Font.PLAIN, 13));
		BuscarEditoraNome.setBounds(20, 84, 46, 14);
		BuscaEditora.add(BuscarEditoraNome);
		
		BuscarEditoraNomeTetField = new JTextField();
		BuscarEditoraNomeTetField.setColumns(10);
		BuscarEditoraNomeTetField.setBounds(58, 81, 159, 20);
		BuscaEditora.add(BuscarEditoraNomeTetField);
		
		JButton btnBuscarEditora = new JButton("Buscar");
		btnBuscarEditora.setBounds(675, 197, 89, 23);
		BuscaEditora.add(btnBuscarEditora);
		
		JScrollPane scrollPane_2_2 = new JScrollPane();
		scrollPane_2_2.setBounds(10, 231, 754, 252);
		BuscaEditora.add(scrollPane_2_2);
		
		Deletar = new JTabbedPane(JTabbedPane.BOTTOM);
		tabbedPane.addTab("Deletar", null, Deletar, null);
		
		JPanel DeletarLivro = new JPanel();
		Deletar.addTab("Livro", null, DeletarLivro, null);
		DeletarLivro.setLayout(null);
		
		JLabel lblDeletarLivro = new JLabel("Deletar Livro");
		lblDeletarLivro.setFont(new Font("Arial", Font.BOLD, 20));
		lblDeletarLivro.setBounds(20, 11, 175, 40);
		DeletarLivro.add(lblDeletarLivro);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("__________________________________________________________________________________________________________________________");
		lblNewLabel_2_1_1_1.setBounds(10, 50, 739, 14);
		DeletarLivro.add(lblNewLabel_2_1_1_1);
		
		JScrollPane scrollPane_1_1_1 = new JScrollPane();
		scrollPane_1_1_1.setBounds(10, 231, 754, 252);
		DeletarLivro.add(scrollPane_1_1_1);
		
		JButton btnDeletarLivro = new JButton("Deletar");
		btnDeletarLivro.setBounds(675, 201, 89, 23);
		DeletarLivro.add(btnDeletarLivro);
		
		JLabel DeletarLivroISBN = new JLabel("ISBN");
		DeletarLivroISBN.setFont(new Font("Arial", Font.PLAIN, 13));
		DeletarLivroISBN.setBounds(20, 82, 46, 14);
		DeletarLivro.add(DeletarLivroISBN);
		
		DeletarLivroISBNTextArea = new JTextField();
		DeletarLivroISBNTextArea.setBounds(66, 79, 129, 20);
		DeletarLivro.add(DeletarLivroISBNTextArea);
		DeletarLivroISBNTextArea.setColumns(10);
		
		JPanel DeletarAutor = new JPanel();
		Deletar.addTab("Autor", null, DeletarAutor, null);
		DeletarAutor.setLayout(null);
		
		JLabel lblDeletarAutor = new JLabel("Deletar Autor");
		lblDeletarAutor.setFont(new Font("Arial", Font.BOLD, 20));
		lblDeletarAutor.setBounds(20, 11, 175, 40);
		DeletarAutor.add(lblDeletarAutor);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("__________________________________________________________________________________________________________________________");
		lblNewLabel_2_1_1_1_1.setBounds(10, 50, 739, 14);
		DeletarAutor.add(lblNewLabel_2_1_1_1_1);
		
		DeletarAutorIdTextField = new JTextField();
		DeletarAutorIdTextField.setColumns(10);
		DeletarAutorIdTextField.setBounds(40, 79, 186, 20);
		DeletarAutor.add(DeletarAutorIdTextField);
		
		JLabel DeletarAutorNome = new JLabel("ID");
		DeletarAutorNome.setFont(new Font("Arial", Font.PLAIN, 13));
		DeletarAutorNome.setBounds(20, 82, 46, 14);
		DeletarAutor.add(DeletarAutorNome);
		
		JScrollPane scrollPane_1_1_1_1 = new JScrollPane();
		scrollPane_1_1_1_1.setBounds(10, 231, 754, 252);
		DeletarAutor.add(scrollPane_1_1_1_1);
		
		JButton btnDeletarAutor = new JButton("Deletar");
		btnDeletarAutor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDeletarAutor.setBounds(675, 201, 89, 23);
		DeletarAutor.add(btnDeletarAutor);
		
		JPanel DeletarEditora = new JPanel();
		Deletar.addTab("Editora", null, DeletarEditora, null);
		DeletarEditora.setLayout(null);
		
		JLabel lblDeletarEditora = new JLabel("Deletar Editora");
		lblDeletarEditora.setFont(new Font("Arial", Font.BOLD, 20));
		lblDeletarEditora.setBounds(20, 11, 175, 40);
		DeletarEditora.add(lblDeletarEditora);
		
		JLabel lblNewLabel_2_1_1_1_2 = new JLabel("__________________________________________________________________________________________________________________________");
		lblNewLabel_2_1_1_1_2.setBounds(10, 50, 739, 14);
		DeletarEditora.add(lblNewLabel_2_1_1_1_2);
		
		DeletarIdEditoraTetField = new JTextField();
		DeletarIdEditoraTetField.setColumns(10);
		DeletarIdEditoraTetField.setBounds(66, 79, 129, 20);
		DeletarEditora.add(DeletarIdEditoraTetField);
		
		JLabel IdEditoraDeletar = new JLabel("Nome");
		IdEditoraDeletar.setFont(new Font("Arial", Font.PLAIN, 13));
		IdEditoraDeletar.setBounds(20, 82, 46, 14);
		DeletarEditora.add(IdEditoraDeletar);
		
		JScrollPane scrollPane_1_1_1_2 = new JScrollPane();
		scrollPane_1_1_1_2.setBounds(10, 231, 754, 252);
		DeletarEditora.add(scrollPane_1_1_1_2);
		
		JButton btnDeletarLivro_2 = new JButton("Deletar");
		btnDeletarLivro_2.setBounds(675, 201, 89, 23);
		DeletarEditora.add(btnDeletarLivro_2);
		
		Editar = new JTabbedPane(JTabbedPane.BOTTOM);
		tabbedPane.addTab("New tab", null, Editar, null);
		
		JPanel EditarLivro = new JPanel();
		Editar.addTab("New tab", null, EditarLivro, null);
		
		JPanel EditarAutor = new JPanel();
		Editar.addTab("New tab", null, EditarAutor, null);
		
		JPanel EditarEditora = new JPanel();
		Editar.addTab("New tab", null, EditarEditora, null);

		frame.setVisible(true);
		
	}
	
	@Override
	public Editora addEditora() {
		int publisher_id = 0;
		String name = NomeETextArea.getText();
		String url = UrlTextArea.getText();
		
		return new Editora(publisher_id,name,url);
	}

	@Override
	public void addActionListenerAdicionarEditora(ActionListener al) {
		btnIncluirEditora.addActionListener(al);
		
	}

	@Override
	public int delEditora() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addActionListenerDeletarEditora(ActionListener al) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Editora updateEditora() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addActionListenerAtualizarEditora(ActionListener al) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getEditora(List<Editora> editora) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addActionListenerListarEditora(ActionListener al) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscaEditora(List<Editora> editora) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addActionListenerBuscarEditora(ActionListener al) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void selecaoEditora(List<Editora> editora) {
		for (Editora e: editora) {
			selecaoEditora.addElement(e);			
		}
		
	}
	
	private class EditoraRenderer extends DefaultListCellRenderer{
		@Override
		public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
                boolean cellHasFocus) {
            if(value instanceof Editora) {
                Editora p = (Editora) value;
                value = p.getName();
            }
            return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        }
	}

	@Override
	public Autor addAutor() {
		
		int author_id = 0;
		String name = NomeTextArea.getText();
		String fname = SobrenomeTextArea.getText();
		
		return new Autor(author_id,name,fname);
	}

	@Override
	public void addActionListenerAdicionarAutor(ActionListener al) {
		btnIncluirAutor.addActionListener(al);
		
	}

	@Override
	public int delAutor() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addActionListenerDeletarAutor(ActionListener al) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Autor updateAuthors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addActionListenerAtualizarAutor(ActionListener al) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAutor(List<Autor> autor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addActionListenerListarAutor(ActionListener al) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscaAutor(List<Autor> autor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addActionListenerBuscarAutor(ActionListener al) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Livro addLivro() {
		
		Editora publisher = (Editora) comboBoxIncluirLivro.getSelectedItem();
		String isbn = ISBNTextArea.getText();
		String title = TituloTextArea.getText();
		double price = Double.parseDouble(PrecoTextArea.getText());
		int id = publisher.getPublisher_id();
		
		return new Livro(title,isbn,id,price);
	}
	

	@Override
	public void addActionListenerAdicionarLivro(ActionListener al) {
		btnIncluirLivro.addActionListener(al);
	}

	
	@Override
	public String delLivro() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addActionListenerDeletarLivro(ActionListener al) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Livro updateLivro() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addActionListenerAtualizarLivro(ActionListener al) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getLivro(List<Livro> livro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addActionListenerListarLivro(ActionListener al) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscaLivro(List<Livro> livro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addActionListenerBuscarLivro(ActionListener al) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LivroAutor addLivroAutor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addActionListenerAdicionarLivroAutor(ActionListener al) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int delLivroAutor() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addActionListenerDeletarLivroAutor(ActionListener al) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LivroAutor updateLivroAutor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addActionListenerAtualizarrLivroAutor(ActionListener al) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getLivroAutor(List<LivroAutor> livroAutor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addActionListenerListarLivroAutor(ActionListener al) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscaLivroAutor(List<LivroAutor> livroAutor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addActionListenerBuscarLivroAutor(ActionListener al) {
		// TODO Auto-generated method stub
		
	}
	
	private static void btnIncluirActionPerformed(java.awt.event.ActionEvent e) {}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getKeyBuscaEditora() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getKeyBuscaAutor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getKeyBuscaAutor2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getKeyBuscaLivro() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getKeyBuscaLivroAutor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addActionListenerSelecaoEditora(ActionListener al) {
		
		Livro_item.addActionListener(al);
		
	}

	

	@Override
	public void addActionListenerSelecaoAutor(ActionListener al) {
		
		
	}

	@Override
	public void selecaoAutor(List<Autor> autor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addActionListenerSelecaoLivro(ActionListener al) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selecaoLivro(List<Livro> livros) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addActionListenerSelecaoLivroAutor(ActionListener al) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selecaoLivroAutor(List<LivroAutor> livroAutor) {
		// TODO Auto-generated method stub
		
	}
	
	
}
