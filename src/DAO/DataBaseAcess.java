package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import entidades.Autor;
import entidades.Livro;
import entidades.LivroAutor;
import entidades.Editora;

public class DataBaseAcess implements Dao{
	
	static private String USER = "root";
	static private String PASS = "root";
	static private String DATABASE = "livraria";
	static private String URL = "jdbc:mysql://localhost:3306/" + DATABASE;
	
	public static void valConexao() {
		try(Connection c = DriverManager.getConnection(URL, USER, PASS)) {
			System.out.println("Conectado com êxito");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//------------Editora-------------------//
	@Override
	public void addEditora(Editora editora) {
		final String query = "INSERT INTO publishers VALUES(?,?,?)";
		
		try(Connection c = DriverManager.getConnection(URL, USER, PASS)){
			PreparedStatement psEditora = c.prepareStatement(query);
			
			psEditora.setInt(1, editora.getPublisher_id());
			psEditora.setString(2, editora.getName());
			psEditora.setString(3, editora.getUrl());
			
			int results = psEditora.executeUpdate();
			
			System.out.println("Editora cadastrada com sucesso");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Override
	public void delEditora(int publisher_id) {
				
		final String query = "DELETE FROM publishers WHERE publisher_id = (?)";
		
		try(Connection c = DriverManager.getConnection(URL, USER, PASS)){
			PreparedStatement psEditora = c.prepareStatement(query);
			
			psEditora.setInt(1, publisher_id);
			
			
			int results = psEditora.executeUpdate();
			
			System.out.println("Editora excluída com sucesso");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	@Override
	public void updateEditora(Editora editora) {
		final String query = "UPDATE publishers set name=(?), url=(?) WHERE publisher_id = (?)";
		
		try(Connection c = DriverManager.getConnection(URL, USER, PASS)){
			PreparedStatement psEditora = c.prepareStatement(query);
			
			psEditora.setString(1, editora.getName());
			psEditora.setString(2, editora.getUrl());
			psEditora.setInt(3, editora.getPublisher_id());
			
			
			int results = psEditora.executeUpdate();
			
			System.out.println("Editora atualizada com sucesso");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	@Override
	public List<Editora> getEditora() {
		
		List<Editora> listaEditora = new ArrayList<>();
		final String query = "SELECT * FROM publishers;";
		
		try(Connection c = DriverManager.getConnection(URL, USER, PASS)){
			PreparedStatement psEditora = c.prepareStatement(query);
			
			ResultSet res = psEditora.executeQuery(query);
			
			while (res.next()) {
				
				int publisher_id = res.getInt("publisher_id");
				String name = res.getString("name");
				String url = res.getString("url");
				
				Editora oEditora = new Editora(publisher_id, name, url);
				listaEditora.add(oEditora);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return listaEditora;
	}
	
	@Override
	public List<Editora> buscaEditora(String nomeKey) {
		List<Editora> publishers = new ArrayList<>();

        final String query = "SELECT * FROM publishers WHERE LOWER(name) LIKE LOWER(?);";
        try (Connection c = DriverManager.getConnection(URL, USER, PASS)){

            PreparedStatement psEditora = c.prepareStatement(query);

            psEditora.setString(1, "%" + nomeKey + "%");

            ResultSet rs = psEditora.executeQuery();

            while(rs.next()) {
                int publishers_id = rs.getInt("publisher_id");
                String nome = rs.getString("name");
                String URL = rs.getString("URL");
                Editora publisher = new Editora(publishers_id, nome, URL);
                publishers.add(publisher);
            }



        }catch(Exception e) {
            e.printStackTrace();
        }

        return publishers;
    
	}
	//-------------END_Editora--------------//
	
	@Override
	public void addAutor(Autor autor) {
		final String query = "INSERT INTO authors VALUES(?,?,?);";
		
		try(Connection c = DriverManager.getConnection(URL, USER, PASS)){
			PreparedStatement psAutor = c.prepareStatement(query);
			
			psAutor.setInt(1, autor.getAuthor_id());
			psAutor.setString(2, autor.getName());
			psAutor.setString(3, autor.getFname());
			
			int results = psAutor.executeUpdate();
			
			System.out.println("Autor cadastrado com sucesso");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void delAutor(int authors_id) {
		
		//Se eu excluir o autor os livros também devem ser apagados
		final String query = "DELETE FROM authors WHERE author_id = (?);";
		
		try(Connection c = DriverManager.getConnection(URL, USER, PASS)){
			PreparedStatement psAutor = c.prepareStatement(query);
			
			psAutor.setInt(1, authors_id);
			
			
			int results = psAutor.executeUpdate();
			
			System.out.println("Autor excluído com sucesso");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void updateAuthors(Autor autor) {
		
		final String query = "UPDATE authors SET name=(?),fname=(?) WHERE author_id = (?)";
		
		try(Connection c = DriverManager.getConnection(URL, USER, PASS)){
			PreparedStatement psAutor = c.prepareStatement(query);
			
			psAutor.setString(1, autor.getName());
			psAutor.setString(2, autor.getFname());
			psAutor.setInt(3, autor.getAuthor_id());
			
			
			int results = psAutor.executeUpdate();
			
			System.out.println("Cadastro atualizado");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Autor> getAutor() {
		
		List<Autor> listaAutor = new ArrayList<>();
		final String query = "SELECT * FROM authors;";
		
		try(Connection c = DriverManager.getConnection(URL, USER, PASS)){
			PreparedStatement psAutor = c.prepareStatement(query);
			
			ResultSet res = psAutor.executeQuery(query);
			
			while (res.next()) {
				
				int author_id = res.getInt("author_id");
				String name = res.getString("name");
				String fname = res.getString("fname");
				
				Autor oAutor = new Autor(author_id, name, fname);
				listaAutor.add(oAutor);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return listaAutor;
		
	}
	
	@Override
	public List<Autor> buscaAutor(String name, String fname) {
		List<Autor> listaAutor = new ArrayList<>();
		final String query = "SELECT * FROM authors WHERE LOWER(name) LIKE LOWER(?) AND LOWER(fname) LIKE LOWER(?);";
		
		try(Connection c = DriverManager.getConnection(URL, USER, PASS)){
			PreparedStatement psAutor = c.prepareStatement(query);
			
			psAutor.setString(1, "%" + name + "%");
			psAutor.setString(2, "%" + fname + "%");
			
			ResultSet res = psAutor.executeQuery();
			
			while (res.next()) {
				
				int author_id = res.getInt("author_id");
				String nome = res.getString("name");
				String f1name = res.getString("fname");
				
				Autor oAutor = new Autor(author_id, nome, f1name);
				listaAutor.add(oAutor);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return listaAutor;
	}
	//-------------END_Autor--------------//
	
	//--------------Livro------------------//
	@Override
	public void addLivro(Livro livros) {
		final String query = "INSERT INTO books VALUES(?,?,?,?);";
		
		try(Connection c = DriverManager.getConnection(URL, USER, PASS)){
			PreparedStatement psLivro = c.prepareStatement(query);
			
			psLivro.setString(1, livros.getTitle());
			psLivro.setString(2, livros.getIsbn());
			psLivro.setInt(3, livros.getPublisher_id());
			psLivro.setDouble(4, livros.getPrice());
			
			int results = psLivro.executeUpdate();
			
			System.out.println("Livro adicionado com êxito");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void delLivro(String isbn) {
		final String query = "DELETE FROM books WHERE isbn = (?);";
		
		try(Connection c = DriverManager.getConnection(URL, USER, PASS)){
			PreparedStatement psLivro = c.prepareStatement(query);
			
			psLivro.setString(1, isbn);
			
			
			int results = psLivro.executeUpdate();
			
			System.out.println("Livro deletado com êxito");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void updateLivro(Livro books) {
		final String query = "UPDATE books set title=(?), price=(?) WHERE isbn = (?);";
		
		try(Connection c = DriverManager.getConnection(URL, USER, PASS)){
			PreparedStatement psLivro = c.prepareStatement(query);
			
			psLivro.setString(1, books.getTitle());
			psLivro.setDouble(2, books.getPrice());
			psLivro.setString(3, books.getIsbn());
			
			
			int results = psLivro.executeUpdate();
			
			System.out.println("Cadastro atualizado!");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	@Override
	public List<Livro> getLivro() {
		List<Livro> listaLivro = new ArrayList<>();
		final String query = "SELECT * FROM books;";
		
		try(Connection c = DriverManager.getConnection(URL, USER, PASS)){
			PreparedStatement psLivro = c.prepareStatement(query);
			
			ResultSet res = psLivro.executeQuery(query);
			
			while (res.next()) {
				
				String title = res.getString("title");
				String isbn = res.getString("isbn");
				int publisher_id = res.getInt("publisher_id");
				int price = res.getInt("price");
				
				Livro oLivro = new Livro(title, isbn, publisher_id, price);
				listaLivro.add(oLivro);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return listaLivro;
	}
	
	@Override
	public List<Livro> buscaLivro(String titleKey) {
		List<Livro> listaLivro = new ArrayList<>();
		final String query = "SELECT * FROM books WHERE LOWER(title) LIKE LOWER (?);";
		
		try(Connection c = DriverManager.getConnection(URL, USER, PASS)){
			PreparedStatement psLivro = c.prepareStatement(query);
			
			psLivro.setString(1, "%" + titleKey + "%");
			
			ResultSet res = psLivro.executeQuery();
			
			while (res.next()) {
				
				String title = res.getString("title");
				String isbn = res.getString("isbn");
				int publisher_id = res.getInt("publisher_id");
				int price = res.getInt("price");
				
				Livro oLivro = new Livro(title, isbn, publisher_id, price);
				listaLivro.add(oLivro);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return listaLivro;
	}
	//-------------END_Livro--------------//
	
	@Override
	public void addLivroAutor(LivroAutor booksauthors) {
		final String query = "INSERT INTO BooksAuthors VALUES(?,?,?);";
		
		try(Connection c = DriverManager.getConnection(URL, USER, PASS)){
			PreparedStatement psLivroAutor = c.prepareStatement(query);
			
			psLivroAutor.setString(1, booksauthors.getIsbn());
			psLivroAutor.setInt(2, booksauthors.getAuthor_id());
			psLivroAutor.setInt(3, booksauthors.getSeq_no());
			
			int results = psLivroAutor.executeUpdate();
			
			System.out.println("Cadastro feito com sucesso");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void delLivroAutor(int author_id) {
		final String query = "DELETE FROM BooksAuthors WHERE author_id = (?);";
		
		try(Connection c = DriverManager.getConnection(URL, USER, PASS)){
			PreparedStatement psLivro = c.prepareStatement(query);
			
			psLivro.setInt(1, author_id);
			
			
			int results = psLivro.executeUpdate();
			
			System.out.println("Livro deletado com êxito");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Override
	public void updateLivroAutor(LivroAutor booksauthors) {
		final String query = "UPDATE BooksAuthors set author_id=(?), seq_no=(?) WHERE isbn = (?);";
		
		try(Connection c = DriverManager.getConnection(URL, USER, PASS)){
			PreparedStatement psLivroAutor = c.prepareStatement(query);
			
			psLivroAutor.setInt(1, booksauthors.getAuthor_id());
			psLivroAutor.setInt(2, booksauthors.getSeq_no());
			psLivroAutor.setString(3, booksauthors.getIsbn());
			
			
			int results = psLivroAutor.executeUpdate();
			
			System.out.println("Cadastro atualizado!");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	@Override
	public List<LivroAutor> getLivroAutor() {
		List<LivroAutor> listaLivroAutor = new ArrayList<>();
		final String query = "SELECT * FROM BooksAuthors;";
		
		try(Connection c = DriverManager.getConnection(URL, USER, PASS)){
			PreparedStatement psLivroAutor = c.prepareStatement(query);
			
			ResultSet res = psLivroAutor.executeQuery(query);
			
			while (res.next()) {
				
				String isbn = res.getString("isbn");
				int author_id = res.getInt("author_id");
				int seq_no = res.getInt("seq_no");
				
				LivroAutor oLivroAutor = new LivroAutor(isbn, author_id, seq_no);
				listaLivroAutor.add(oLivroAutor);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return listaLivroAutor;
	}
	
	@Override
	public List<LivroAutor> buscaLivroAutor(String isbnKey) {
		List<LivroAutor> listaLivroAutor = new ArrayList<>();
		final String query = "SELECT * FROM BooksAuthors WHERE LOWER(isbn) LIKE LOWER (?);";
		
		try(Connection c = DriverManager.getConnection(URL, USER, PASS)){
			PreparedStatement psLivroAutor = c.prepareStatement(query);
			
			psLivroAutor.setString(1, "%" + isbnKey + "%");
			
			ResultSet res = psLivroAutor.executeQuery(query);
			
			while (res.next()) {
				
				String isbn = res.getString("isbn");
				int author_id = res.getInt("author_id");
				int seq_no = res.getInt("seq_no");
				
				LivroAutor oLivroAutor = new LivroAutor(isbn, author_id, seq_no);
				listaLivroAutor.add(oLivroAutor);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return listaLivroAutor;
	}
	
}
