package entidades;

public class LivroAutor {

	String isbn;
	int author_id;
	int seq_no;
	
	public LivroAutor(String aIsbn, int aAuthor_id, int aSeq_no) {
		this.isbn = aIsbn;
		this.author_id = aAuthor_id;
		this.seq_no = aSeq_no;
	}
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}

	public int getSeq_no() {
		return seq_no;
	}

	public void setSeq_no(int seq_no) {
		this.seq_no = seq_no;
	}

	@Override
	public String toString() {
		String res = "classe" + this.getClass() + "\n";
		res += "Isbn: " + this.isbn + "\n";
		res += "Autor Id: " + this.author_id + "\n";
		res += "Seq: " + this.seq_no + "\n";
		
		return res;
	}
	
	
}
