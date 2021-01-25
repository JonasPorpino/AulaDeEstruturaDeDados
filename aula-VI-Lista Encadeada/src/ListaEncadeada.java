
public class ListaEncadeada implements TLista{

	private No inicio;
	
	public void inserir(Identificavel obj, int pos) throws Exception {
		No novo = new No(obj);
		
		int totalDeElementos = quantidade();
		
		if (pos <= 0 || pos > totalDeElementos+1)
			throw new Exception("Não posso inserir nessa posição, pq ela não é válida");
		
		if (pos == 1) {//inserção no começo
			novo.proximo = inicio;
			inicio = novo;
		} else if (pos == totalDeElementos+1) {//inserção no final
			No auxiliar = inicio;
			
			while (auxiliar.proximo != null) {
				auxiliar = auxiliar.proximo;
			}
			
			auxiliar.proximo = novo;
			
		} else {//inserção numa posição intermediário
			
			No auxiliar = inicio;
			
			for(int i = 1; i < pos - 1; i++)
				auxiliar = auxiliar.proximo;
			
			novo.proximo = auxiliar.proximo;
			auxiliar.proximo = novo;
		}
		
		
	}

	/**
	 * @author alunos
	 */
	public Identificavel removerPorId(long id) throws Exception {
		return null;
	}

	/**
	 * @author alunos
	 */
	public Identificavel removerPorPos(int pos) throws Exception {
		return null;
	}

	/**
	 * @author alunos
	 */
	public Identificavel buscar(long id) throws Exception {
		return null;
	}

	public Identificavel antecessor(Identificavel obj) throws Exception {
		return null;
	}

	public Identificavel sucessor(Identificavel obj) throws Exception {
		return null;
	}

	public int posicao(Identificavel obj) throws Exception {
		return 0;
	}

	public Identificavel elemento(int pos) throws Exception {
		return null;
	}

	public boolean existe(long id) throws Exception {
		return false;
	}

	public Identificavel primeiro() throws Exception {
		if (isVazia())
			throw new Exception("Não há elementos na lista");
		
		return inicio.dado;
	}

	public Identificavel ultimo() throws Exception {
		if (isVazia())
			throw new Exception("Não há elementos na lista");
		
		No auxiliar = inicio;
		
		while (auxiliar.proximo != null) {
			auxiliar = auxiliar.proximo;
		}
		
		return auxiliar.dado;
	}

	public boolean isVazia() {
		if (inicio == null)
			return true;
		else 
			return false;
	}

	public boolean isCheia() {
		return false;
	}

	public int quantidade() {
		
		int qtd = 0;
		
		No auxiliar = inicio;
		
		while (auxiliar != null) {
			qtd++;
			auxiliar = auxiliar.proximo;
		}
		
		return qtd;
	}

	public void imprimir() {
		
		System.out.print("INICIO -> ");
		No auxiliar = inicio;
		
		while (auxiliar != null) {
			System.out.print(auxiliar.dado+ " -> ");
			auxiliar = auxiliar.proximo;
		}
		
		System.out.println("Null");
	}

}
