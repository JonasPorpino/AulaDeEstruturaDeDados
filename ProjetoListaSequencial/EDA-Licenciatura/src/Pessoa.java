

public class Pessoa implements Identificavel{

	private String nome;
	private long id;
	
	public Pessoa(String nome) {
		this.nome = nome;
		id = System.currentTimeMillis();
	}

	public long getId() {
		return id;
	}
	
	public String toString() {
		return nome;
	}
}
