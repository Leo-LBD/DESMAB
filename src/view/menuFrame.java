package view;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
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
import javax.swing.table.DefaultTableModel;

import entidades.Autor;
import entidades.Editora;
import entidades.Livro;
import entidades.LivroAutor;

import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class menuFrame implements View{
	private JTextField ISBNTextArea;
	private JTextField SeqTextArea;
	private JTextField TituloTextArea;
	private JTextField PrecoTextArea;
	private javax.swing.JButton btnIncluirLivro;
	private javax.swing.JButton btnIncluirAutor;
	private javax.swing.JButton btnIncluirEditora;
	private javax.swing.JButton btnBuscarLivro;
	private javax.swing.JButton btnBuscarAutor;
	private javax.swing.JButton btnBuscarEditora;
	private javax.swing.JButton btnDeletarLivro;
	private javax.swing.JButton btnDeletarEditora;
	private javax.swing.JButton btnDeletarAutor;
	private javax.swing.JButton btnEditarLivro;
	private javax.swing.JButton btnEditarAutor;
	private javax.swing.JButton btnEditarEditora;
	private javax.swing.JButton btnIncluirIncluir;
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
	
	DefaultTableModel modelEditora = new DefaultTableModel(new Object[] {"ID", "Nome", "URL"}, 0);
	DefaultTableModel modelLivro = new DefaultTableModel(new Object[] {"Titulo", "ISBN", "Editora","Preço"}, 0);
	DefaultTableModel modelAutor = new DefaultTableModel(new Object[] {"ID", "Nome", "Sobrenome"}, 0);
	private JTable tabelaLivro;
	private JTable tabelaAutor;
	private JTable tabelaEditora;
	private JTabbedPane tabbedPane;
	private JTabbedPane Incluir;
	private JTabbedPane Buscar;
	private JTabbedPane Editar;
	private JTabbedPane Deletar;
	private JComboBox comboBoxIncluirLivro;
	private JComboBox comboBoxIncluirLivroAutor;
	private JComboBox EditarLivroEditoraComboBox;
	private JComboBox EditarLivroAutorComboBox;
	
	
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
	
	private JTextField EditarLivroISBNTextField;
	private JTextField EditarTituloLivroTextField;
	private JTextField EditarPrecoLivroTextField;
	private JTextField EditarAutorSobrenomeTextField;
	private JTextField EditarAutorNomeTextField;
	private JTextField EditarAutorIdTextField;
	private JTextField EditarIdEditoraTextField;
	private JTextField EditarNomeEditoraTextField;
	private JTextField EditarUrlEditoraTextField;

	public menuFrame() {
		JFrame frame = new JFrame();
		frame.setTitle("Livraria Amazônia");
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
		
		tabbedPane.setBounds(-11, -11, 972, 552);
		panel.add(tabbedPane);
		
		Incluir = new JTabbedPane(JTabbedPane.BOTTOM);
		tabbedPane.addTab("Incluir", null, Incluir, null);
		
		Incluir.setVisible(false);
		
		//-----------Inicio_Incluir-------------//
		JPanel IncluirAutor = new JPanel();
		Incluir.addTab("Autor", null, IncluirAutor, null);
		IncluirAutor.setLayout(null);
		
		JLabel JanelaAutorIncluir = new JLabel("Cadastrar Autor");
		JanelaAutorIncluir.setFont(new Font("Arial", Font.BOLD, 20));
		JanelaAutorIncluir.setBounds(20, 11, 172, 40);
		IncluirAutor.add(JanelaAutorIncluir);
		
		JLabel DivisoriaIncluirAutor = new JLabel("________________________________________________________________________________________________________________________________");
		DivisoriaIncluirAutor.setBounds(10, 50, 783, 14);
		IncluirAutor.add(DivisoriaIncluirAutor);
		
		JLabel IncluirAutorLabel = new JLabel("Nome");
		IncluirAutorLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		IncluirAutorLabel.setBounds(20, 92, 40, 14);
		IncluirAutor.add(IncluirAutorLabel);
		
		NomeTextArea = new JTextField();
		NomeTextArea.setBounds(58, 89, 186, 20);
		IncluirAutor.add(NomeTextArea);
		NomeTextArea.setColumns(10);
		
		JLabel IncluirAutorSobrenome = new JLabel("Sobrenome");
		IncluirAutorSobrenome.setFont(new Font("Arial", Font.PLAIN, 13));
		IncluirAutorSobrenome.setBounds(20, 117, 67, 14);
		IncluirAutor.add(IncluirAutorSobrenome);
		
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
		
		JScrollPane scrollPaneIncluirAutor = new JScrollPane();
		scrollPaneIncluirAutor.setBounds(20, 225, 773, 272);
		IncluirAutor.add(scrollPaneIncluirAutor);
		
		JPanel IncluirEditora = new JPanel();
		Incluir.addTab("Editora", null, IncluirEditora, null);
		IncluirEditora.setLayout(null);
		
		JLabel JanelaEditoraIncluir = new JLabel("Cadastrar Editora");
		JanelaEditoraIncluir.setFont(new Font("Arial", Font.BOLD, 20));
		JanelaEditoraIncluir.setBounds(20, 11, 175, 40);
		IncluirEditora.add(JanelaEditoraIncluir);
		
		JLabel DivisoriaIncluirEditora = new JLabel("________________________________________________________________________________________________________________________________");
		DivisoriaIncluirEditora.setBounds(10, 50, 780, 14);
		IncluirEditora.add(DivisoriaIncluirEditora);
		
		JLabel IncluirEditoraNomeLabel = new JLabel("Nome");
		IncluirEditoraNomeLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		IncluirEditoraNomeLabel.setBounds(20, 83, 39, 14);
		IncluirEditora.add(IncluirEditoraNomeLabel);
		
		NomeETextArea = new JTextField();
		NomeETextArea.setBounds(60, 80, 202, 20);
		IncluirEditora.add(NomeETextArea);
		NomeETextArea.setColumns(10);
		
		JLabel IncluirEditoraUrlLabel = new JLabel("Url");
		IncluirEditoraUrlLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		IncluirEditoraUrlLabel.setBounds(20, 117, 29, 14);
		IncluirEditora.add(IncluirEditoraUrlLabel);
		
		UrlTextArea = new JTextField();
		UrlTextArea.setBounds(45, 114, 217, 20);
		IncluirEditora.add(UrlTextArea);
		UrlTextArea.setColumns(10);
		
		btnIncluirEditora = new JButton("Incluir");
		btnIncluirEditora.setBounds(701, 201, 89, 23);
		IncluirEditora.add(btnIncluirEditora);
		
		JScrollPane scrollPaneIncluirEditora = new JScrollPane();
		scrollPaneIncluirEditora.setBounds(20, 231, 770, 264);
		IncluirEditora.add(scrollPaneIncluirEditora);
		
		JPanel IncluirLivro = new JPanel();
		Incluir.addTab("Livro", null, IncluirLivro, null);
		IncluirLivro.setLayout(null);
		
		JLabel JanelaLivroIncluir = new JLabel("Cadastrar Livro");
		JanelaLivroIncluir.setFont(new Font("Arial", Font.BOLD, 20));
		JanelaLivroIncluir.setBounds(20, 11, 170, 40);
		IncluirLivro.add(JanelaLivroIncluir);
		
		JLabel isbn = new JLabel("ISBN");
		isbn.setFont(new Font("Arial", Font.PLAIN, 13));
		isbn.setBounds(20, 75, 34, 14);
		IncluirLivro.add(isbn);
		
		JLabel seq = new JLabel("Seq");
		seq.setFont(new Font("Arial", Font.PLAIN, 13));
		seq.setBounds(200, 75, 34, 14);
		IncluirLivro.add(seq);
		
		SeqTextArea = new JTextField();
		SeqTextArea.setBounds(230, 72, 79, 20);
		IncluirLivro.add(SeqTextArea);
		SeqTextArea.setColumns(10);
		
		JLabel DivisoriaIncluirLivro = new JLabel("________________________________________________________________________________________________________________________________");
		DivisoriaIncluirLivro.setBounds(10, 50, 783, 14);
		IncluirLivro.add(DivisoriaIncluirLivro);
		
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
		
		JLabel author = new JLabel("Autor");
		author.setFont(new Font("Arial", Font.PLAIN, 13));
		author.setBounds(20, 205, 46, 14);
		IncluirLivro.add(author);
		
		comboBoxIncluirLivroAutor = new JComboBox();
		comboBoxIncluirLivroAutor.setBounds(76, 200, 147, 22);
		IncluirLivro.add(comboBoxIncluirLivroAutor);
		comboBoxIncluirLivroAutor.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Autor autor = (Autor) comboBoxIncluirLivroAutor.getSelectedItem();
				
			}
			
		});
		
		comboBoxIncluirLivroAutor.setModel(selecaoAutor);
		comboBoxIncluirLivroAutor.setRenderer(new AutorRenderer());
		
		
		JScrollPane scrollPaneIncluirLivro = new JScrollPane();
		scrollPaneIncluirLivro.setBounds(20, 231, 773, 266);
		IncluirLivro.add(scrollPaneIncluirLivro);
		
		btnIncluirLivro = new JButton("Incluir");
		btnIncluirLivro.setBounds(704, 197, 89, 23);
		btnIncluirLivro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {	
				}
			});
		IncluirLivro.add(btnIncluirLivro);
		
		btnIncluirIncluir = new JButton("Adicionar Autor");
		btnIncluirIncluir.setBounds(570, 197, 125, 23);
		btnIncluirIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
			}
		});
		IncluirLivro.add(btnIncluirIncluir);
		
		//------------End_Incluir------------//
		
		//------------Inicio_Buscar---------//
		
		Buscar = new JTabbedPane(JTabbedPane.BOTTOM);
		tabbedPane.addTab("Buscar", null, Buscar, null);
		
		JPanel BuscaLivro = new JPanel();
		Buscar.addTab("Livro", null, BuscaLivro, null);
		BuscaLivro.setLayout(null);
		
		JLabel lblBuscarLivro = new JLabel("Buscar Livro");
		lblBuscarLivro.setFont(new Font("Arial", Font.BOLD, 20));
		lblBuscarLivro.setBounds(20, 11, 147, 40);
		BuscaLivro.add(lblBuscarLivro);
		
		JLabel DivisoriaBuscaLivro = new JLabel("________________________________________________________________________________________________________________________________________");
		DivisoriaBuscaLivro.setBounds(20, 49, 771, 14);
		BuscaLivro.add(DivisoriaBuscaLivro);
		
		JLabel BuscarLivroTituloLabel = new JLabel("Titulo");
		BuscarLivroTituloLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		BuscarLivroTituloLabel.setBounds(20, 84, 46, 14);
		BuscaLivro.add(BuscarLivroTituloLabel);
		
		BuscarTituloTextArea = new JTextField();
		BuscarTituloTextArea.setBounds(58, 81, 159, 20);
		BuscaLivro.add(BuscarTituloTextArea);
		BuscarTituloTextArea.setColumns(10);
		
		btnBuscarLivro = new JButton("Buscar");
		btnBuscarLivro.setBounds(689, 196, 89, 23);
		BuscaLivro.add(btnBuscarLivro);
		
		JScrollPane scrollPaneBuscaLivro = new JScrollPane();
		scrollPaneBuscaLivro.setBounds(20, 230, 771, 262);
		BuscaLivro.add(scrollPaneBuscaLivro);
		
		tabelaLivro = new JTable(modelLivro);
        tabelaLivro.setModel(modelLivro);
        scrollPaneBuscaLivro.setViewportView(tabelaLivro);
		
		
		JPanel BuscaAutor = new JPanel();
		Buscar.addTab("Autor", null, BuscaAutor, null);
		BuscaAutor.setLayout(null);
		
		JLabel DivisoriaBuscaAutor = new JLabel("__________________________________________________________________________________________________________________________");
		DivisoriaBuscaAutor.setBounds(10, 50, 739, 14);
		BuscaAutor.add(DivisoriaBuscaAutor);
		
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
		
		btnBuscarAutor = new JButton("Buscar");
		btnBuscarAutor.setBounds(675, 197, 89, 23);
		BuscaAutor.add(btnBuscarAutor);
		
		JScrollPane scrollPaneBuscaAutor = new JScrollPane();
		scrollPaneBuscaAutor.setBounds(10, 231, 754, 252);
		BuscaAutor.add(scrollPaneBuscaAutor);
		
		tabelaAutor = new JTable(modelAutor);
        tabelaAutor.setModel(modelAutor);
        scrollPaneBuscaAutor.setViewportView(tabelaAutor);
		
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
		
		JLabel DivisoriaBuscaEditora = new JLabel("__________________________________________________________________________________________________________________________");
		DivisoriaBuscaEditora.setBounds(10, 50, 739, 14);
		BuscaEditora.add(DivisoriaBuscaEditora);
		
		JLabel BuscarEditoraNome = new JLabel("Nome");
		BuscarEditoraNome.setFont(new Font("Arial", Font.PLAIN, 13));
		BuscarEditoraNome.setBounds(20, 84, 46, 14);
		BuscaEditora.add(BuscarEditoraNome);
		
		BuscarEditoraNomeTetField = new JTextField();
		BuscarEditoraNomeTetField.setColumns(10);
		BuscarEditoraNomeTetField.setBounds(58, 81, 159, 20);
		BuscaEditora.add(BuscarEditoraNomeTetField);
		
		btnBuscarEditora = new JButton("Buscar");
		btnBuscarEditora.setBounds(675, 197, 89, 23);
		BuscaEditora.add(btnBuscarEditora);
		
		JScrollPane scrollPaneBuscaEditora = new JScrollPane();
		scrollPaneBuscaEditora.setBounds(10, 231, 754, 252);
		BuscaEditora.add(scrollPaneBuscaEditora);
		
		tabelaEditora = new JTable(modelEditora);
        tabelaEditora.setModel(modelEditora);
        scrollPaneBuscaEditora.setViewportView(tabelaEditora);
		
		//---------------End_Busca---------------//
		
		//---------------Inicio_Deletar----------//		
		Deletar = new JTabbedPane(JTabbedPane.BOTTOM);
		tabbedPane.addTab("Deletar", null, Deletar, null);
		
		JPanel DeletarLivro = new JPanel();
		Deletar.addTab("Livro", null, DeletarLivro, null);
		DeletarLivro.setLayout(null);
		
		JLabel lblDeletarLivro = new JLabel("Deletar Livro");
		lblDeletarLivro.setFont(new Font("Arial", Font.BOLD, 20));
		lblDeletarLivro.setBounds(20, 11, 175, 40);
		DeletarLivro.add(lblDeletarLivro);
		
		JLabel DivisoriaDeletarLivro = new JLabel("_____________________________________________________________________________________________________________________________________________________");
		DivisoriaDeletarLivro.setBounds(20, 45, 924, 14);
		DeletarLivro.add(DivisoriaDeletarLivro);
		
		JScrollPane scrollPaneDeletarLivro = new JScrollPane();
		scrollPaneDeletarLivro.setBounds(20, 234, 769, 252);
		DeletarLivro.add(scrollPaneDeletarLivro);
		
		btnDeletarLivro = new JButton("Deletar");
		btnDeletarLivro.setBounds(700, 201, 89, 23);
		DeletarLivro.add(btnDeletarLivro);
		
		JLabel DeletarLivroISBN = new JLabel("ISBN");
		DeletarLivroISBN.setFont(new Font("Arial", Font.PLAIN, 13));
		DeletarLivroISBN.setBounds(30, 80, 46, 14);
		DeletarLivro.add(DeletarLivroISBN);
		
		DeletarLivroISBNTextArea = new JTextField();
		DeletarLivroISBNTextArea.setBounds(76, 77, 129, 20);
		DeletarLivro.add(DeletarLivroISBNTextArea);
		DeletarLivroISBNTextArea.setColumns(10);
		
		JPanel DeletarAutor = new JPanel();
		Deletar.addTab("Autor", null, DeletarAutor, null);
		DeletarAutor.setLayout(null);
		
		JLabel lblDeletarAutor = new JLabel("Deletar Autor");
		lblDeletarAutor.setFont(new Font("Arial", Font.BOLD, 20));
		lblDeletarAutor.setBounds(20, 11, 175, 40);
		DeletarAutor.add(lblDeletarAutor);
		
		DeletarAutorIdTextField = new JTextField();
		DeletarAutorIdTextField.setColumns(10);
		DeletarAutorIdTextField.setBounds(45, 81, 186, 20);
		DeletarAutor.add(DeletarAutorIdTextField);
		
		JLabel DeletarAutorNome = new JLabel("ID");
		DeletarAutorNome.setFont(new Font("Arial", Font.PLAIN, 13));
		DeletarAutorNome.setBounds(25, 84, 46, 14);
		DeletarAutor.add(DeletarAutorNome);
		
		JScrollPane scrollPaneDeletarAutor = new JScrollPane();
		scrollPaneDeletarAutor.setBounds(25, 233, 762, 252);
		DeletarAutor.add(scrollPaneDeletarAutor);
		
		btnDeletarAutor = new JButton("Deletar");
		btnDeletarAutor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDeletarAutor.setBounds(698, 200, 89, 23);
		DeletarAutor.add(btnDeletarAutor);
		
		JLabel DivisoriaDeletarAutor = new JLabel("_____________________________________________________________________________________________________________________________________________________");
		DivisoriaDeletarAutor.setBounds(20, 46, 924, 14);
		DeletarAutor.add(DivisoriaDeletarAutor);
		
		JPanel DeletarEditora = new JPanel();
		Deletar.addTab("Editora", null, DeletarEditora, null);
		DeletarEditora.setLayout(null);
		
		JLabel lblDeletarEditora = new JLabel("Deletar Editora");
		lblDeletarEditora.setFont(new Font("Arial", Font.BOLD, 20));
		lblDeletarEditora.setBounds(20, 11, 175, 40);
		DeletarEditora.add(lblDeletarEditora);
		
		DeletarIdEditoraTetField = new JTextField();
		DeletarIdEditoraTetField.setColumns(10);
		DeletarIdEditoraTetField.setBounds(66, 82, 129, 20);
		DeletarEditora.add(DeletarIdEditoraTetField);
		
		JLabel IdEditoraDeletar = new JLabel("Id");
		IdEditoraDeletar.setFont(new Font("Arial", Font.PLAIN, 13));
		IdEditoraDeletar.setBounds(20, 85, 46, 14);
		DeletarEditora.add(IdEditoraDeletar);
		
		JScrollPane scrollPaneDeletarEditora = new JScrollPane();
		scrollPaneDeletarEditora.setBounds(20, 234, 770, 264);
		DeletarEditora.add(scrollPaneDeletarEditora);
		
		btnDeletarEditora = new JButton("Deletar");
		btnDeletarEditora.setBounds(701, 201, 89, 23);
		DeletarEditora.add(btnDeletarEditora);
		
		JLabel DivisóriaDeletarEditora = new JLabel("___________________________________________________________________________________________________________________________________________");
		DivisóriaDeletarEditora.setBounds(20, 37, 924, 14);
		DeletarEditora.add(DivisóriaDeletarEditora);
		
		//------------End_Deletar--------------//
		
		//------------Inicio_Editar------------//
		
		Editar = new JTabbedPane(JTabbedPane.BOTTOM);
		tabbedPane.addTab("New tab", null, Editar, null);
		
		JPanel EditarLivro = new JPanel();
		Editar.addTab("New tab", null, EditarLivro, null);
		EditarLivro.setLayout(null);
		
		JLabel lblEditarLivro = new JLabel("Editar Livro");
		lblEditarLivro.setFont(new Font("Arial", Font.BOLD, 20));
		lblEditarLivro.setBounds(24, 10, 121, 40);
		EditarLivro.add(lblEditarLivro);
		
		JLabel DivisoriaEditarLivro = new JLabel("________________________________________________________________________________________________________________________________________________________");
		DivisoriaEditarLivro.setBounds(10, 49, 896, 13);
		EditarLivro.add(DivisoriaEditarLivro);
		
		JLabel EditarLivroISBNLabel = new JLabel("ISBN");
		EditarLivroISBNLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		EditarLivroISBNLabel.setBounds(24, 84, 60, 13);
		EditarLivro.add(EditarLivroISBNLabel);
		
		EditarLivroISBNTextField = new JTextField();
		EditarLivroISBNTextField.setColumns(10);
		EditarLivroISBNTextField.setBounds(62, 81, 83, 19);
		EditarLivro.add(EditarLivroISBNTextField);
		
		JLabel EditarTituloLivroLabel = new JLabel("Titulo");
		EditarTituloLivroLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		EditarTituloLivroLabel.setBounds(24, 117, 60, 13);
		EditarLivro.add(EditarTituloLivroLabel);
		
		EditarTituloLivroTextField = new JTextField();
		EditarTituloLivroTextField.setColumns(10);
		EditarTituloLivroTextField.setBounds(62, 114, 171, 19);
		EditarLivro.add(EditarTituloLivroTextField);
		
		JLabel EditarPrecoLivroLabel = new JLabel("Preco");
		EditarPrecoLivroLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		EditarPrecoLivroLabel.setBounds(24, 152, 85, 13);
		EditarLivro.add(EditarPrecoLivroLabel);
		
		EditarPrecoLivroTextField = new JTextField();
		EditarPrecoLivroTextField.setColumns(10);
		EditarPrecoLivroTextField.setBounds(62, 149, 171, 19);
		EditarLivro.add(EditarPrecoLivroTextField);
		
		JLabel EditarLivroEditoraLabel = new JLabel("Editora");
		EditarLivroEditoraLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		EditarLivroEditoraLabel.setBounds(24, 187, 45, 13);
		EditarLivro.add(EditarLivroEditoraLabel);
		
		EditarLivroEditoraComboBox = new JComboBox();
		EditarLivroEditoraComboBox.setBounds(72, 183, 144, 21);
		EditarLivro.add(EditarLivroEditoraComboBox);
		EditarLivroEditoraComboBox.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Editora editora = (Editora) EditarLivroEditoraComboBox.getSelectedItem();
				
			}
			
		});
		
		EditarLivroEditoraComboBox.setModel(selecaoEditora);
		EditarLivroEditoraComboBox.setRenderer(new EditoraRenderer());
		
		JLabel EditarLivroAutorLabel = new JLabel("Autor");
		EditarLivroAutorLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		EditarLivroAutorLabel.setBounds(24, 220, 45, 13);
		EditarLivro.add(EditarLivroAutorLabel);
		
		EditarLivroAutorComboBox = new JComboBox();
		EditarLivroAutorComboBox.setBounds(72, 216, 144, 21);
		EditarLivro.add(EditarLivroAutorComboBox);
		EditarLivroAutorComboBox.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Autor autor = (Autor) EditarLivroAutorComboBox.getSelectedItem();
				
			}
			
		});
		
		EditarLivroAutorComboBox.setModel(selecaoAutor);
		EditarLivroAutorComboBox.setRenderer(new AutorRenderer());
		
		JScrollPane scrollPaneEditarLivro = new JScrollPane();
		scrollPaneEditarLivro.setBounds(24, 298, 766, 195);
		EditarLivro.add(scrollPaneEditarLivro);
		
		btnEditarLivro = new JButton("Atualizar");
		btnEditarLivro.setFont(new Font("Arial", Font.PLAIN, 11));
		btnEditarLivro.setBounds(704, 270, 85, 21);
		EditarLivro.add(btnEditarLivro);
		
		JPanel EditarAutor = new JPanel();
		Editar.addTab("New tab", null, EditarAutor, null);
		EditarAutor.setLayout(null);
		
		btnEditarAutor = new JButton("Atualizar");
		btnEditarAutor.setFont(new Font("Arial", Font.PLAIN, 11));
		btnEditarAutor.setBounds(704, 267, 85, 21);
		EditarAutor.add(btnEditarAutor);
		
		EditarAutorSobrenomeTextField = new JTextField();
		EditarAutorSobrenomeTextField.setColumns(10);
		EditarAutorSobrenomeTextField.setBounds(92, 156, 141, 19);
		EditarAutor.add(EditarAutorSobrenomeTextField);
		
		JLabel EditarSobrenomeAutorLabel = new JLabel("Sobrenome");
		EditarSobrenomeAutorLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		EditarSobrenomeAutorLabel.setBounds(24, 159, 85, 13);
		EditarAutor.add(EditarSobrenomeAutorLabel);
		
		EditarAutorNomeTextField = new JTextField();
		EditarAutorNomeTextField.setColumns(10);
		EditarAutorNomeTextField.setBounds(71, 114, 162, 19);
		EditarAutor.add(EditarAutorNomeTextField);
		
		JLabel EditarNomeAutorLabel = new JLabel("Nome");
		EditarNomeAutorLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		EditarNomeAutorLabel.setBounds(24, 117, 60, 13);
		EditarAutor.add(EditarNomeAutorLabel);
		
		JLabel EditarAutorIdLabel = new JLabel("ID");
		EditarAutorIdLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		EditarAutorIdLabel.setBounds(24, 84, 60, 13);
		EditarAutor.add(EditarAutorIdLabel);
		
		EditarAutorIdTextField = new JTextField();
		EditarAutorIdTextField.setColumns(10);
		EditarAutorIdTextField.setBounds(47, 81, 66, 19);
		EditarAutor.add(EditarAutorIdTextField);
		
		JLabel DivisoriaEditarAutor = new JLabel("________________________________________________________________________________________________________________________________________________________");
		DivisoriaEditarAutor.setBounds(10, 49, 896, 13);
		EditarAutor.add(DivisoriaEditarAutor);
		
		JLabel EditarAutorTitulo = new JLabel("Editar Autor");
		EditarAutorTitulo.setFont(new Font("Arial", Font.PLAIN, 22));
		EditarAutorTitulo.setBounds(24, 10, 121, 40);
		EditarAutor.add(EditarAutorTitulo);
		
		JScrollPane scrollPaneEditarAutor = new JScrollPane();
		scrollPaneEditarAutor.setBounds(24, 298, 765, 195);
		EditarAutor.add(scrollPaneEditarAutor);
		
		JPanel EditarEditora = new JPanel();
		Editar.addTab("New tab", null, EditarEditora, null);
		EditarEditora.setLayout(null);
		
		JLabel lblEditarEditora = new JLabel("Editar Editora");
		lblEditarEditora.setFont(new Font("Arial", Font.BOLD, 20));
		lblEditarEditora.setBounds(32, 21, 155, 26);
		EditarEditora.add(lblEditarEditora);
		
		JLabel DivisoriaEditarEditora = new JLabel("________________________________________________________________________________________________________________________________________________________");
		DivisoriaEditarEditora.setBounds(22, 42, 851, 13);
		EditarEditora.add(DivisoriaEditarEditora);
		
		EditarIdEditoraTextField = new JTextField();
		EditarIdEditoraTextField.setColumns(10);
		EditarIdEditoraTextField.setBounds(42, 65, 113, 19);
		EditarEditora.add(EditarIdEditoraTextField);
		
		JLabel EditarIdEditoraLabel = new JLabel("ID");
		EditarIdEditoraLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		EditarIdEditoraLabel.setBounds(20, 67, 34, 16);
		EditarEditora.add(EditarIdEditoraLabel);
		
		EditarNomeEditoraTextField = new JTextField();
		EditarNomeEditoraTextField.setColumns(10);
		EditarNomeEditoraTextField.setBounds(59, 96, 128, 19);
		EditarEditora.add(EditarNomeEditoraTextField);
		
		JLabel EditarNomeEditoraLabel = new JLabel("Nome");
		EditarNomeEditoraLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		EditarNomeEditoraLabel.setBounds(20, 98, 34, 16);
		EditarEditora.add(EditarNomeEditoraLabel);
		
		JLabel EditarUrlEditoraLabel = new JLabel("Url");
		EditarUrlEditoraLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		EditarUrlEditoraLabel.setBounds(20, 128, 66, 16);
		EditarEditora.add(EditarUrlEditoraLabel);
		
		EditarUrlEditoraTextField = new JTextField();
		EditarUrlEditoraTextField.setColumns(10);
		EditarUrlEditoraTextField.setBounds(48, 126, 139, 19);
		EditarEditora.add(EditarUrlEditoraTextField);
		
		JScrollPane scrollPaneEditarEditora = new JScrollPane();
		scrollPaneEditarEditora.setBounds(22, 279, 768, 225);
		EditarEditora.add(scrollPaneEditarEditora);
		
		btnEditarEditora = new JButton("Atualizar");
		btnEditarEditora.setFont(new Font("Arial", Font.PLAIN, 11));
		btnEditarEditora.setBounds(715, 248, 75, 21);
		EditarEditora.add(btnEditarEditora);
		//--------------End_Editar------------//

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
		int publisher_id = Integer.parseInt(DeletarIdEditoraTetField.getText());
		return publisher_id;
	}

	@Override
	public void addActionListenerDeletarEditora(ActionListener al) {
		btnDeletarEditora.addActionListener(al);
		
	}

	@Override
	public Editora updateEditora() {
		int publisher_id = Integer.parseInt(EditarIdEditoraTextField.getText());
		String name = EditarNomeEditoraTextField.getText();
		String url = EditarUrlEditoraTextField.getText();
		
		return new Editora(publisher_id,name,url);
	}

	@Override
	public void addActionListenerAtualizarEditora(ActionListener al) {
		btnEditarEditora.addActionListener(al);
		
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
		modelEditora.setRowCount(0);
        for(Editora p: editora) {
            modelEditora.addRow(new Object[] {p.getPublisher_id(), p.getName(), p.getUrl()});
            System.out.println(p.getPublisher_id() +" " + p.getName()+" " + p.getUrl());
        }
		
	}

	@Override
	public void addActionListenerBuscarEditora(ActionListener al) {
		btnBuscarEditora.addActionListener(al);
		
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
	public void addActionListenerSelecaoEditora(ActionListener al) {
		Livro_item.addActionListener(al);
		EditarLivro_item.addActionListener(al);
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
		int author_id = Integer.parseInt(DeletarAutorIdTextField.getText());
		return author_id;
	}

	@Override
	public void addActionListenerDeletarAutor(ActionListener al) {
		btnDeletarAutor.addActionListener(al);
		
	}

	@Override
	public Autor updateAuthors() {
		int author_id = Integer.parseInt(EditarAutorIdTextField.getText());
		String name = EditarAutorNomeTextField.getText();
		String fname = EditarAutorSobrenomeTextField.getText();
		
		return new Autor(author_id,name,fname);
	}

	@Override
	public void addActionListenerAtualizarAutor(ActionListener al) {
		btnEditarAutor.addActionListener(al);
		
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
		modelAutor.setRowCount(0);
        for(Autor p: autor) {
            modelAutor.addRow(new Object[] {p.getAuthor_id(), p.getName(), p.getFname()});
            System.out.println(p.getAuthor_id() +" " + p.getName()+" " + p.getFname());
        }
		
	}

	@Override
	public void addActionListenerBuscarAutor(ActionListener al) {
		btnBuscarAutor.addActionListener(al);
		
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
		String isbn = DeletarLivroISBNTextArea.getText();
		return isbn;
	}

	@Override
	public void addActionListenerDeletarLivro(ActionListener al) {
		btnDeletarLivro.addActionListener(al);
		
	}

	@Override
	public Livro updateLivro() {
		
		Editora publisher = (Editora) EditarLivroEditoraComboBox.getSelectedItem();
		String isbn = EditarLivroISBNTextField.getText();
		String title = EditarTituloLivroTextField.getText();
		double price = Double.parseDouble(EditarPrecoLivroTextField.getText());
		int id = publisher.getPublisher_id();
		
		return new Livro(title,isbn,id,price);
		
	}

	@Override
	public void addActionListenerAtualizarLivro(ActionListener al) {
		btnEditarLivro.addActionListener(al);
		
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
		modelLivro.setRowCount(0);
        for(Livro p: livro) {
            modelLivro.addRow(new Object[] {p.getTitle(), p.getIsbn(), p.getPublisher_id(), p.getPrice()});
            System.out.println(p.getTitle() +" " + p.getIsbn()+" " + p.getPublisher_id()+" "+ p.getPrice());
        }
		
	}

	@Override
	public void addActionListenerBuscarLivro(ActionListener al) {
		btnBuscarLivro.addActionListener(al);
		
	}

	@Override
	public LivroAutor addLivroAutor() {
		Autor author = (Autor) comboBoxIncluirLivroAutor.getSelectedItem();
		String isbn = ISBNTextArea.getText();
		int id = author.getAuthor_id();
		int seq = Integer.parseInt(SeqTextArea.getText());
		
		return new LivroAutor(isbn,id,seq);
	}

	@Override
	public void addActionListenerAdicionarLivroAutor(ActionListener al) {
		btnIncluirIncluir.addActionListener(al);
		
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
		return BuscarEditoraNomeTetField.getText();
	}

	@Override
	public String getKeyBuscaAutor() {
		// TODO Auto-generated method stub
		return BuscarAutorNomeTextField.getText();
	}

	@Override
	public String getKeyBuscaAutor2() {
		// TODO Auto-generated method stub
		return BuscarAutorSobrenomeTextField.getText();
	}

	@Override
	public String getKeyBuscaLivro() {
		// TODO Auto-generated method stub
		return BuscarTituloTextArea.getText();
	}

	@Override
	public String getKeyBuscaLivroAutor() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public void addActionListenerSelecaoAutor(ActionListener al) {
		Livro_item.addActionListener(al);
		EditarLivro_item.addActionListener(al);
	}

	@Override
	public void selecaoAutor(List<Autor> autor) {
		for (Autor e: autor) {
			selecaoAutor.addElement(e);		//metodos para baixar os dados da combo box	
		}
		
	}
	
	private class AutorRenderer extends DefaultListCellRenderer{
		@Override
		public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
                boolean cellHasFocus) {
            if(value instanceof Autor) {
                Autor p = (Autor) value;
                value = p.getName();
            }
            return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus); //design de como vai aparecer a combo box
        }
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