package dia09;
 // importar a biblioteca p/ ele permitir a mudança no console
import java.util.Scanner;

public class ExercicioIF02 {
		
	public static void main(String[] args) {
		
		//Declarar as variáveis - receita do bolo (ingredientes)
		int valor;
		Scanner ler = new Scanner (System.in);
		
		// Lógica do exercício + valores (quantidades)
		
		System.out.println("Insira um número: ");
		// parte do scanner no console - aonde eu digito no número
		
		valor = ler.nextInt(); // estou pedindo p/ ler o número que será inserido 
		
		//Estrutura do código como a Bia me ensinou
		
		if((valor >= 0) && (valor % 2 == 0)) {
		 // primeiro coloco a condição e a possibilidade conforme o exercício pediu, o if ou else if é a condição e o system... é a possibilidade/resultado
			System.out.println(" O número: " + valor + " é par e positivo.");
		} else if  ( valor >= -2 ) {
		// mas se - e eu também posso já declarar o valor dessa forma que é melhor p/ mim
			System.out.println(" O número:" + valor +  "é par e negativo.");{ 
		
			} 
			
		} else if  ( valor >= -3 ) {
				// mas se 
				System.out.println(" O número:" + valor +  "é ímpar e negativo.");{ 
					
				} } else if  ( valor >= 3 ) {
					// mas se 
					System.out.println(" O número:" + valor +  " é ímpar e positivo.");{ 
			}
	}
}
}

