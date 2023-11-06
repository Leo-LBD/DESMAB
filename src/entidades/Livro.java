package entidades;

public class Livro {

	String title;
	String isbn;
	int publisher_id;
	double price;
	
	
	public Livro(String aTitle, String aIsbn, int aPublisher_id, double price) {
		this.title = aTitle;
		this.isbn = aIsbn;
		this.publisher_id = aPublisher_id;
		this.price = price;
	}
	
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPublisher_id() {
		return publisher_id;
	}

	public void setPublisher_id(int publisher_id) {
		this.publisher_id = publisher_id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		String res = "classe" + this.getClass() + "\n";
		res += "Title: " + this.title + "\n";
		res += "Isbn: " + this.isbn+ "\n";
		res += "Publisher Id: " + this.publisher_id + "\n";
		res += "Preço: " + this.price + "\n";
		
		return res;
	}
	
	
	
	
}
