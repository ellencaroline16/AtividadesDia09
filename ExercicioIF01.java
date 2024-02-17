package dia09;
 // importar a biblioteca p/ ele permitir a mudança no console
import java.util.Scanner;

public class ExercicioIF01 {
		
	public static void main(String[] args) {
		
		//Declarar as variáveis - receita do bolo (ingredientes)
		String nomeDoador;
		int idadeDoador;
		boolean primeiraDoacao;
		Scanner ler = new Scanner (System.in);
		
		// Lógica do exercício + valores (quantidades)
		
		System.out.println("Digitar nome: ");
		nomeDoador = ler.next();
		System.out.println("Digitar idade: ");
		idadeDoador = ler.nextInt();
		System.out.println("É a primeira vez que doa sangue? Digite 'true' para se caso sim e 'false' para se caso não: ");
		primeiraDoacao = ler.nextBoolean();
		
		// a Bia me deu a dica se de fazer as partes separadas
		// if (se) 
		
		if ((idadeDoador >= 18 && idadeDoador <= 69)&& ((!(primeiraDoacao)) || idadeDoador < 60 )) {
			// idade conforme solicitado no exercício && é/e - || é/ou - ! inverte o boolean 
			System.out.println(nomeDoador + " está apto a doar sangue.");
			
		} else {
			// else - outra/mas
			System.out.println(nomeDoador + " não está apto a doar sangue.");
		}
		}
} 
		