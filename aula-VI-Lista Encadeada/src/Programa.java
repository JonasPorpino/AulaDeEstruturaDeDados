import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws Exception {
		TLista lista = new ListaEncadeada();
		Scanner leitor = new Scanner(System.in);
		
		while (true) {
			System.out.print("Novo elemento: ");
			String nome = leitor.nextLine();
			System.out.print("Posição: ");
			int pos = Integer.parseInt(leitor.nextLine());
			lista.inserir(new Pessoa(nome), pos);
			lista.imprimir();
			System.out.println("Desejar continuar (s/n)?");
			String resposta = leitor.nextLine();
			if (resposta.equals("n"))
				break;
		}
		leitor.close();
	}

}
