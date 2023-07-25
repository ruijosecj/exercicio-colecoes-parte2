import java.util.Scanner;

public class NomesPessoas {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite nomes de pessoas separados por virgula:");
		String listaPessoas = ler.next();

		String[] vetNomes = listaPessoas.split(",");
		
		System.out.println("###VETOR DESORDENADO###");
		for(String nome : vetNomes) {
			System.out.println(nome);
		}

		for (int i = 0; i < vetNomes.length; i++) {
			for (int j = i + 1; j < vetNomes.length; j++) {

				if (vetNomes[i].compareTo(vetNomes[j]) > 0) {
					// swapping
					String temp = vetNomes[i];
					vetNomes[i] = vetNomes[j];
					vetNomes[j] = temp;
				}
			}
		}
		
		System.out.println("###VETOR ORDENADO###");
		for(String nome : vetNomes) {
			System.out.println(nome);
		}
	}
}
