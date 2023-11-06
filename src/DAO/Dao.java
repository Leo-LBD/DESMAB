package DAO;

import java.util.List;

import entidades.Autor;
import entidades.Livro;
import entidades.LivroAutor;
import entidades.Editora;

public interface Dao {

    public void addEditora(Editora editora);
    public void delEditora(int id);
    public void updateEditora(Editora editora);
    public List<Editora> getEditora();
    public List<Editora> buscaEditora(String nomeKey);

    public void addAutor(Autor autor);
    public void delAutor(int authors_id);
    public void updateAuthors(Autor autor);
    public List<Autor> getAutor();
    public List<Autor> buscaAutor(String name, String fname);

    public void addLivro(Livro books);
    public void delLivro(String isbn);
    public void updateLivro(Livro books);
    public List<Livro> getLivro();
    public List<Livro> buscaLivro(String titleKey);

	public void addLivroAutor(LivroAutor booksauthors);
	public void delLivroAutor(int id);
	public void updateLivroAutor(LivroAutor booksauthors);
	public List<LivroAutor> getLivroAutor();
	public List<LivroAutor> buscaLivroAutor(String isbnKey);


}