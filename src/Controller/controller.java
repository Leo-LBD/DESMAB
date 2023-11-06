package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.Action;

import DAO.Dao;
import view.View;

import entidades.*;

public class controller {

	Dao model;
	View view;
    private Editora publishers;
    private Autor authors;
    private Livro books;
    private LivroAutor booksauthors;

    public controller(Dao model, View view){
        this.model = model;
        this.view = view;
    }
    
    public void init() {
    	view.addActionListenerAdicionarLivro(new AcaoIncluirLivro());
    	view.addActionListenerDeletarLivro(new AcaoDeletarLivro());
    	view.addActionListenerAtualizarLivro(new AcaoAtualizarLivro());
    	view.addActionListenerListarLivro(new AcaoListarLivro());
    	view.addActionListenerBuscarLivro(new AcaoBuscarLivro());
    	view.addActionListenerSelecaoLivro(new AcaoSelecaoLivro());
    	
    	view.addActionListenerAdicionarAutor(new AcaoAtualizarAutor());
    	view.addActionListenerDeletarAutor(new AcaoDeletarAutor());
    	view.addActionListenerAtualizarAutor(new AcaoAtualizarAutor());
    	view.addActionListenerListarAutor(new AcaoListarAutor());
    	view.addActionListenerBuscarAutor(new AcaoBuscarAutor());
    	view.addActionListenerSelecaoAutor(new AcaoSelecaoAutor());
    	
    	view.addActionListenerAdicionarEditora(new AcaoAtualizarEditora());
    	view.addActionListenerDeletarEditora(new AcaoDeletarEditora());
    	view.addActionListenerAtualizarEditora(new AcaoAtualizarEditora());
    	view.addActionListenerListarEditora(new AcaoListarEditora());
    	view.addActionListenerBuscarEditora(new AcaoBuscarEditora());
    	view.addActionListenerSelecaoEditora(new AcaoSelecaoEditora());
    }
    
    class AcaoIncluirLivro implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Livro livro = view.addLivro();
			model.addLivro(livro);
			
		}
    	
    }
    
    class AcaoDeletarLivro implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String isbn = view.delLivro();
			model.delLivro(isbn);
			
		}
    	
    }
    
    class AcaoAtualizarLivro implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Livro livro = view.updateLivro();
			model.updateLivro(livro);
			
		}
    	
    }
    
    class AcaoListarLivro implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			List<Livro>livros;
			livros = model.getLivro();
			view.getLivro(livros);
		}
    	
    }
    
    class AcaoBuscarLivro implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String titulo = view.getKeyBuscaLivro();
			List<Livro>livros = model.getLivro();
			livros = model.buscaLivro(titulo);
			view.buscaLivro(livros);
		}
    	
    }

    class AcaoSelecaoLivro implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			List<Livro>livros;
			livros = model.getLivro();
			view.selecaoLivro(livros);
		}
    	
    }
    
    //------------------------------------------------//
    
    class AcaoAdicionarAutor implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Autor autor = view.addAutor();
			model.addAutor(autor);
			
		}
    	
    }
    
    class AcaoDeletarAutor implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			int author_id = view.delAutor();
			model.delAutor(author_id);
			
		}
    	
    }

    class AcaoAtualizarAutor implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Autor autor = view.updateAuthors();
			model.updateAuthors(autor);
			
		}
    	
    }
	
    class AcaoListarAutor implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			List<Autor>autor;
			autor = model.getAutor();
			view.getAutor(autor);
		}
    	
    }
    
    class AcaoBuscarAutor implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String nome = view.getKeyBuscaAutor();
			String sobrenome = view.getKeyBuscaAutor2();
			List<Autor>autor = model.getAutor();
			autor = model.buscaAutor(nome, sobrenome);
			view.buscaAutor(autor);
		}
    	
    }
   
    class AcaoSelecaoAutor implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			List<Autor>autor;
			autor = model.getAutor();
			view.selecaoAutor(autor);
		}
    	
    }

    //-----------------------------------------------//
    
    class AcaoAdicionarEditora implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Editora editora = view.addEditora();
			model.addEditora(editora);
			
		}
    	
    }
    
    class AcaoDeletarEditora implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			int publisher_id = view.delEditora();
			model.delEditora(publisher_id);
			
		}
    	
    }

    class AcaoAtualizarEditora implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Editora editora = view.updateEditora();
			model.updateEditora(editora);
			
		}
    	
    }
	
    class AcaoListarEditora implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			List<Editora>editora;
			editora = model.getEditora();
			view.getEditora(editora);
		}
    	
    }
    
    class AcaoBuscarEditora implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String nome = view.getKeyBuscaEditora();
			List<Editora>editora = model.getEditora();
			editora = model.buscaEditora(nome);
			view.buscaEditora(editora);
		}
    	
    }
    
    class AcaoSelecaoEditora implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			List<Editora>editora;
			editora = model.getEditora();
			view.selecaoEditora(editora);
		}
    	
    }
}
