import java.util.ArrayList;

public class Buscas {

	
	//pesquisas lineares
	//pesquisa sequencial O(n) - 3n + 2
	//pesquisa sequencial com sentinela/dummy 2n + 4
	//pesquisa sequencial com transposição - tornar buscas subsequentes O(1)
	//pesquisa sequencial em lista ordenada teta(n/2)
	
	//pesquisa binária (sequências ordenadas) - O(log n)
	public static int buscar(int[] vetor, int valor) {
		int i = 0;
		int f = vetor.length-1;
		
		while (i<=f) {
			
			int meio = (i+f)/2;
			
			if (valor == vetor[meio])
				return meio;
			
			if (valor < vetor[meio]) {
				f = meio - 1;
			} else { // valor > vetor[meio]
				i = meio + 1;
			}
		}
		
		return -1;
	}
	
	
	
	public static void main(String[] args) {
		int[] numeros = {10, 20, 30, 40, 50, 60};
		int numero = 60;
		
		int pos = buscar(numeros, numero);
		
		if (pos == -1)
			System.out.println("O número não existe");
		else
			System.out.println("O número está no índice " + pos);
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.forEach(s -> System.out.println(s));
	}
}
