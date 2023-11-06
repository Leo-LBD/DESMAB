package view;

import java.awt.event.ActionListener;
import java.util.List;

import entidades.Autor;
import entidades.Editora;
import entidades.Livro;
import entidades.LivroAutor;

public interface View {

	Editora addEditora();
	public void addActionListenerAdicionarEditora(ActionListener al);
	
	int delEditora();
	public void addActionListenerDeletarEditora(ActionListener al);
	
	Editora updateEditora();
	public void addActionListenerAtualizarEditora(ActionListener al);
	
	void getEditora(List<Editora> editora);
	public void addActionListenerListarEditora(ActionListener al);
	
	void buscaEditora(List<Editora> editora);
	public void addActionListenerBuscarEditora(ActionListener al);
	
	public String getKeyBuscaEditora();
	
	public void addActionListenerSelecaoEditora(ActionListener al);
	public void selecaoEditora(List<Editora> editora);
	
	
	Autor addAutor();
	public void addActionListenerAdicionarAutor(ActionListener al);
	
    int delAutor();
    public void addActionListenerDeletarAutor(ActionListener al);
    
    Autor updateAuthors();
    public void addActionListenerAtualizarAutor(ActionListener al);
    
    void getAutor(List<Autor> autor);
    public void addActionListenerListarAutor(ActionListener al);
    
    void buscaAutor(List<Autor> autor);
    public void addActionListenerBuscarAutor(ActionListener al);
    
    public String getKeyBuscaAutor();
    public String getKeyBuscaAutor2();
    
    public void addActionListenerSelecaoAutor(ActionListener al);
	public void selecaoAutor(List<Autor> autor);

    Livro addLivro();
    public void addActionListenerAdicionarLivro(ActionListener al);
    
    String delLivro();
    public void addActionListenerDeletarLivro(ActionListener al);
    
    Livro updateLivro();
    public void addActionListenerAtualizarLivro(ActionListener al);
    
    void getLivro(List<Livro> livro);
    public void addActionListenerListarLivro(ActionListener al);
    
    void buscaLivro(List<Livro> livro);
    
    public void addActionListenerBuscarLivro(ActionListener al);
    public String getKeyBuscaLivro();
    
    public void addActionListenerSelecaoLivro(ActionListener al);
  	public void selecaoLivro(List<Livro> livros);
    
	LivroAutor addLivroAutor();
	public void addActionListenerAdicionarLivroAutor(ActionListener al);
	
	int delLivroAutor();
	public void addActionListenerDeletarLivroAutor(ActionListener al);
	
	LivroAutor updateLivroAutor();
	public void addActionListenerAtualizarrLivroAutor(ActionListener al);
	
	void getLivroAutor(List<LivroAutor> livroAutor);
	public void addActionListenerListarLivroAutor(ActionListener al);
	
	void buscaLivroAutor(List<LivroAutor> livroAutor);
	
	public void addActionListenerBuscarLivroAutor(ActionListener al);
	public String getKeyBuscaLivroAutor();
	
	public void addActionListenerSelecaoLivroAutor(ActionListener al);
	public void selecaoLivroAutor(List<LivroAutor> livroAutor);
	
}
