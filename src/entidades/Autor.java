package entidades;

public class Autor {

	int author_id;
	String name;
	String fname;
	
	public Autor(int aAuthor_id, String aName, String aFname) {
		this.author_id = aAuthor_id;
		this.name = aName;
		this.fname = aFname;
	}
	
	public int getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	@Override
	public String toString() {
		String res = "classe" + this.getClass() + "\n";
		res += "Autor Id: " + this.author_id + "\n";
		res += "Nome: " + this.name + "\n";
		res += "Sobrenome: " + this.fname + "\n";
		
		return res;
	}
	
	
}
