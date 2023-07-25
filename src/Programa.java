import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String resposta = "s";
		
		List<Pessoa> pessoas = new ArrayList<>();
		Map<String, String> masculino = new HashMap<>();
		Map<String, String> feminino = new HashMap<>();
		Pessoa p = new Pessoa();
		
		while(resposta.equals("s")) {
			System.out.println("Digite o nome:");
			String nome = ler.next();
			
			System.out.println("Digite o sexo:");
			String sexo = ler.next();
			
			p.setNome(nome);
			p.setSexo(sexo);
			
			pessoas.add(new Pessoa(p.getNome(), p.getSexo()));
		
			p = new Pessoa();
			
			System.out.println("Deseja adicionar uma pessoa:");
			resposta = ler.next();
			
		}
		
		for (Pessoa pess : pessoas){
			if(pess.getSexo().equals("m"))	{
				masculino.put(pess.getNome(), pess.getSexo());
			}else {
				feminino.put(pess.getNome(), pess.getSexo());
			}
		}
		
		System.out.println("Lista masculino: " +masculino.keySet());
		System.out.println("Lista feminino: " +feminino.keySet());


	}

}
