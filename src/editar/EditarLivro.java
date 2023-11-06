package editar;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EditarLivro extends JFrame {

	JMenuBar menubar;
	JMenu home_menu;
	JMenu inserir_menu;
	JMenu buscar_menu;
	JMenu editar_menu;
	JMenu deletar_menu;
	
	JMenuItem InserirLivro_item;
	JMenuItem InserirAutor_item;
	JMenuItem InserirEditora_item;
	
	JMenuItem BuscaLivro_item;
	JMenuItem BuscaAutor_item;
	JMenuItem BuscaEditora_item;
	
	JMenuItem EditarLivro_item;
	JMenuItem EditarAutor_item;
	JMenuItem EditarEditora_item;
	
	JMenuItem DeletarLivro_item;
	JMenuItem DeletarAutor_item;
	JMenuItem DeletarEditora_item;
	private JTextField EditarLivroISBNTextField;
	private JTextField EditarTituloLivroTextField;
	private JTextField EditarLivroPrecoTextField;
	private JTextField EditarAutorIdTextField;
	private JTextField EditarNomeAutorTextField;
	private JTextField EditarSobrenomeAutorTextField;
	private JLabel EditarNomeEditoraLabel;
	private JTextField EditarNomeEditoraTextField;
	private JLabel EditarUrlEditoraLabel;
	private JTextField EditarUrlEditoraTextField;
	private JButton EditarBtnEditora;
	private JScrollPane scrollPane_2;
	private JLabel lblEditarEditora;
	private JLabel lblNewLabel_4;
	private JTextField EditarEditoraIdTextField;
	
	
		public EditarLivro() {

			JFrame frame = new JFrame();
			setTitle("Frame title");
			setSize(800, 600);
			setLocationRelativeTo(null);
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			menubar = new JMenuBar();
			
			home_menu = new JMenu("Home");
			inserir_menu = new JMenu("Inserir");
			buscar_menu = new JMenu("Buscar");
			editar_menu = new JMenu("Editar");
			deletar_menu = new JMenu("Deletar");
			
			InserirLivro_item = new JMenuItem("Livro");
			InserirAutor_item = new JMenuItem("Autor");
			InserirEditora_item = new JMenuItem("Editora");
			
			BuscaLivro_item = new JMenuItem("Livro");
			BuscaAutor_item = new JMenuItem("Autor");
			BuscaEditora_item = new JMenuItem("Editora");
			
			EditarLivro_item = new JMenuItem("Livro");
			EditarAutor_item = new JMenuItem("Autor");
			EditarEditora_item = new JMenuItem("Editora");
			
			DeletarLivro_item = new JMenuItem("Livro");
			DeletarAutor_item = new JMenuItem("Autor");
			DeletarEditora_item = new JMenuItem("Editora");
			
			this.setJMenuBar(menubar);
			
			menubar.add(home_menu);
			menubar.add(inserir_menu);
			menubar.add(buscar_menu);
			menubar.add(editar_menu);
			menubar.add(deletar_menu);
			
			inserir_menu.add(InserirLivro_item);
			inserir_menu.add(InserirAutor_item);
			inserir_menu.add(InserirEditora_item);
			
			buscar_menu.add(BuscaLivro_item);
			buscar_menu.add(BuscaAutor_item);
			buscar_menu.add(BuscaEditora_item);
			
			editar_menu.add(EditarLivro_item);
			editar_menu.add(EditarAutor_item);
			editar_menu.add(EditarEditora_item);
			
			deletar_menu.add(DeletarLivro_item);
			deletar_menu.add(DeletarAutor_item);
			deletar_menu.add(DeletarEditora_item);
			getContentPane().setLayout(new BorderLayout(0, 0));
			
			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			getContentPane().add(tabbedPane, BorderLayout.CENTER);
			
			JPanel EditarLivro = new JPanel();
			tabbedPane.addTab("Livro", null, EditarLivro, null);
			EditarLivro.setLayout(null);
			
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
			
			EditarLivroPrecoTextField = new JTextField();
			EditarLivroPrecoTextField.setColumns(10);
			EditarLivroPrecoTextField.setBounds(62, 149, 171, 19);
			EditarLivro.add(EditarLivroPrecoTextField);
			
			JButton EditarBtnLivro = new JButton("Atualizar");
			EditarBtnLivro.setFont(new Font("Arial", Font.PLAIN, 11));
			EditarBtnLivro.setBounds(686, 267, 85, 21);
			EditarLivro.add(EditarBtnLivro);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 298, 761, 195);
			EditarLivro.add(scrollPane);
			
			JLabel lblNewLabel = new JLabel("Editar Livro");
			lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 22));
			lblNewLabel.setBounds(24, 10, 121, 40);
			EditarLivro.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("________________________________________________________________________________________________________________________________________________________");
			lblNewLabel_1.setBounds(10, 49, 896, 13);
			EditarLivro.add(lblNewLabel_1);
			
			JLabel EditarLivroEditoraLabel = new JLabel("Editora");
			EditarLivroEditoraLabel.setFont(new Font("Arial", Font.PLAIN, 13));
			EditarLivroEditoraLabel.setBounds(24, 187, 45, 13);
			EditarLivro.add(EditarLivroEditoraLabel);
			
			JComboBox EditarLivroEditoraComboBox = new JComboBox();
			EditarLivroEditoraComboBox.setBounds(72, 183, 144, 21);
			EditarLivro.add(EditarLivroEditoraComboBox);
			
			JLabel EditarLivroAutorLabel = new JLabel("Autor");
			EditarLivroAutorLabel.setFont(new Font("Arial", Font.PLAIN, 13));
			EditarLivroAutorLabel.setBounds(24, 220, 45, 13);
			EditarLivro.add(EditarLivroAutorLabel);
			
			JComboBox EditarLivroAutorComboBox = new JComboBox();
			EditarLivroAutorComboBox.setBounds(72, 216, 144, 21);
			EditarLivro.add(EditarLivroAutorComboBox);
			
			JPanel EditarAutor = new JPanel();
			tabbedPane.addTab("Autor", null, EditarAutor, null);
			EditarAutor.setLayout(null);
			
			JLabel EditarAutorIdLabel = new JLabel("ID");
			EditarAutorIdLabel.setFont(new Font("Arial", Font.PLAIN, 13));
			EditarAutorIdLabel.setBounds(24, 95, 60, 13);
			EditarAutor.add(EditarAutorIdLabel);
			
			EditarAutorIdTextField = new JTextField();
			EditarAutorIdTextField.setColumns(10);
			EditarAutorIdTextField.setBounds(47, 92, 66, 19);
			EditarAutor.add(EditarAutorIdTextField);
			
			JLabel EditarNomeAutorLabel = new JLabel("Nome");
			EditarNomeAutorLabel.setFont(new Font("Arial", Font.PLAIN, 13));
			EditarNomeAutorLabel.setBounds(24, 128, 60, 13);
			EditarAutor.add(EditarNomeAutorLabel);
			
			EditarNomeAutorTextField = new JTextField();
			EditarNomeAutorTextField.setColumns(10);
			EditarNomeAutorTextField.setBounds(71, 125, 162, 19);
			EditarAutor.add(EditarNomeAutorTextField);
			
			JLabel EditarSobrenomeAutorLabel = new JLabel("Sobrenome");
			EditarSobrenomeAutorLabel.setFont(new Font("Arial", Font.PLAIN, 13));
			EditarSobrenomeAutorLabel.setBounds(24, 170, 85, 13);
			EditarAutor.add(EditarSobrenomeAutorLabel);
			
			EditarSobrenomeAutorTextField = new JTextField();
			EditarSobrenomeAutorTextField.setColumns(10);
			EditarSobrenomeAutorTextField.setBounds(92, 167, 141, 19);
			EditarAutor.add(EditarSobrenomeAutorTextField);
			
			JButton EditarBtnAutor_1 = new JButton("Atualizar");
			EditarBtnAutor_1.setFont(new Font("Arial", Font.PLAIN, 11));
			EditarBtnAutor_1.setBounds(686, 278, 85, 21);
			EditarAutor.add(EditarBtnAutor_1);
			
			JScrollPane scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(10, 309, 761, 195);
			EditarAutor.add(scrollPane_1);
			
			JLabel EditarAutorTitulo = new JLabel("Editar Autor");
			EditarAutorTitulo.setFont(new Font("Arial", Font.PLAIN, 22));
			EditarAutorTitulo.setBounds(24, 21, 121, 40);
			EditarAutor.add(EditarAutorTitulo);
			
			JLabel lblNewLabel_1_1 = new JLabel("________________________________________________________________________________________________________________________________________________________");
			lblNewLabel_1_1.setBounds(10, 60, 896, 13);
			EditarAutor.add(lblNewLabel_1_1);
			
			JPanel EditarEditora = new JPanel();
			tabbedPane.addTab("Editora", null, EditarEditora, null);
			EditarEditora.setLayout(null);
			
			EditarNomeEditoraLabel = new JLabel("Nome");
			EditarNomeEditoraLabel.setBounds(10, 97, 34, 16);
			EditarNomeEditoraLabel.setFont(new Font("Arial", Font.PLAIN, 13));
			EditarEditora.add(EditarNomeEditoraLabel);
			
			EditarNomeEditoraTextField = new JTextField();
			EditarNomeEditoraTextField.setBounds(49, 95, 128, 19);
			EditarNomeEditoraTextField.setColumns(10);
			EditarEditora.add(EditarNomeEditoraTextField);
			
			EditarUrlEditoraLabel = new JLabel("Url");
			EditarUrlEditoraLabel.setBounds(10, 127, 66, 16);
			EditarUrlEditoraLabel.setFont(new Font("Arial", Font.PLAIN, 13));
			EditarEditora.add(EditarUrlEditoraLabel);
			
			EditarUrlEditoraTextField = new JTextField();
			EditarUrlEditoraTextField.setBounds(38, 125, 139, 19);
			EditarUrlEditoraTextField.setColumns(10);
			EditarEditora.add(EditarUrlEditoraTextField);
			
			EditarBtnEditora = new JButton("Atualizar");
			EditarBtnEditora.setBounds(696, 248, 75, 21);
			EditarBtnEditora.setFont(new Font("Arial", Font.PLAIN, 11));
			EditarEditora.add(EditarBtnEditora);
			
			scrollPane_2 = new JScrollPane();
			scrollPane_2.setBounds(10, 279, 761, 225);
			EditarEditora.add(scrollPane_2);
			
			lblEditarEditora = new JLabel("Editar Editora");
			lblEditarEditora.setBounds(22, 10, 155, 26);
			lblEditarEditora.setFont(new Font("Arial", Font.PLAIN, 22));
			EditarEditora.add(lblEditarEditora);
			
			lblNewLabel_4 = new JLabel("________________________________________________________________________________________________________________________________________________________");
			lblNewLabel_4.setBounds(10, 41, 851, 13);
			EditarEditora.add(lblNewLabel_4);
			
			JLabel EditarIdEditoraLabel = new JLabel("ID");
			EditarIdEditoraLabel.setFont(new Font("Arial", Font.PLAIN, 13));
			EditarIdEditoraLabel.setBounds(10, 66, 34, 16);
			EditarEditora.add(EditarIdEditoraLabel);
			
			EditarEditoraIdTextField = new JTextField();
			EditarEditoraIdTextField.setColumns(10);
			EditarEditoraIdTextField.setBounds(32, 64, 113, 19);
			EditarEditora.add(EditarEditoraIdTextField);

			setVisible(true);

		}
}
