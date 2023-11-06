package entidades;

public class Editora {

	
	int publisher_id;
	String name;
	String url;
	
	public Editora(int aPublisher_id, String aName, String aUrl) {
		this.publisher_id =  aPublisher_id;
		this.name = aName;
		this.url = aUrl;
	}

	public int getPublisher_id() {
		return publisher_id;
	}


	public void setPublisher_id(int publisher_id) {
		this.publisher_id = publisher_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	@Override
	public String toString() {
		String res = "classe" + this.getClass() + "\n";
		res += "Publisher Id: " + this.publisher_id + "\n";
		res += "Nome: " + this.name + "\n";
		res += "Url: " + this.url;
		
		return res;
	}
}
