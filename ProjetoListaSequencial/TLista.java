

public interface TLista {

	public void inserir(Identificavel obj, int pos) throws Exception;
	
	public Identificavel removerPorId(long id) throws Exception;

	public Identificavel removerPorPos(int pos) throws Exception;
	
	public Identificavel buscar(long id) throws Exception;

	public Identificavel antecessor(Identificavel obj) throws Exception;

	public Identificavel sucessor(Identificavel obj) throws Exception;
	
	public int posicao(Identificavel obj) throws Exception;

	public Identificavel elemento(int pos) throws Exception;

	public boolean existe(long id) throws Exception;
	
	public Identificavel primeiro() throws Exception;

	public Identificavel ultimo() throws Exception;

	public boolean isVazia();
	
	public boolean isCheia();
	
	public int quantidade();
	
	public void imprimir(); 
	
	default void algo() {
		
	}
	
	
}
