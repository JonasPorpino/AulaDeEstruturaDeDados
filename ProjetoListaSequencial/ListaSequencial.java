public class ListaSequencial implements TLista{

	private Identificavel[] lista;
	private int qtd;
	
	public ListaSequencial(int tam) {
		lista = new Identificavel[tam];
		qtd = 0;
	}
	
	public void inserir(Identificavel obj, int pos) throws Exception {
		if (pos <= 0 || pos > (qtd + 1)) {
			throw new Exception("Essa posição não é válida");
		}
		
		if (isCheia()) {
			throw new Exception("Não há espaços vazios");
		}
		int indice = pos - 1;
		
		for(int i = qtd; i > indice; i--)
			lista[i] = lista[i-1];
		
		lista[indice] = obj;
		qtd++;
	}

	public Identificavel removerPorId(long id) throws Exception {
		for(int i = 0; i < qtd; i++) {
			if (id == lista[i].getId()) {
				Identificavel lixo = lista[i];
				

				for(int j = i; j < qtd - 1; j++)
					lista[j]=lista[j+1];
				
				qtd--;
				
				return lixo;
			}
		}
		
		throw new Exception("Elemento não encontrado");
	}

	public Identificavel removerPorPos(int pos) throws Exception {
		return null;
	}

	public Identificavel buscar(long id) throws Exception {
		for(int i = 0; i < qtd; i++) {
			if (lista[i].getId() == id)
				return lista[i];
		}
		
		throw new Exception("Elemento não encontrado");
	}

	public int posicao(Identificavel obj) throws Exception {
		return 0;
	}

	public boolean existe(long id) throws Exception {
		try {
			buscar(id);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	public Identificavel primeiro() throws Exception {
		return null;
	}

	public Identificavel ultimo() throws Exception {
		return null;
	}

	public boolean isVazia() {
		return qtd == 0;
	}

	public boolean isCheia() {
		return qtd == lista.length;
	}

	public int quantidade() {
		return qtd;
	}

	public void imprimir() {
		
		if (isVazia()) {
			System.out.println("[]");
			return;
		}
		
		System.out.print("[");
		for(int i= 0; i < qtd; i++) {
			System.out.print(lista[i].toString()+", ");
		}
		System.out.println("]");
	}

	public Identificavel antecessor(Identificavel obj) throws Exception {
		return null;
	}

	public Identificavel sucessor(Identificavel obj) throws Exception {
		return null;
	}

	public Identificavel elemento(int pos) throws Exception {
		return null;
	}

}