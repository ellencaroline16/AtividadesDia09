package dia09;

import java.util.Scanner;

public class ExercicioSwitch01 {

	public static void main(String[] args) {
		// Variáveis
		int codigoProduto = 0;
		float valorProduto = 0.00f;
		int quantidadeProduto = 0;
		float total;
		Scanner ler = new Scanner(System.in);

		// tabela de produtos
		System.out.println("-- Cardápio --");
		System.out.println("-- 1 - Cachorro quente --");
		System.out.println("-- 2 - X - Salada --");
		System.out.println("-- 3 - X - Bacon --");
		System.out.println("-- 4 - Bauru --");
		System.out.println("-- 5 - Refrigerante --");
		System.out.println("-- 6 - Suco de laranja --");
		System.out.println("-- Código do produto:  --");

		codigoProduto = ler.nextInt(); // Lê o código digitado pelo usuário
		
		// Criando casos para as opções:
		switch (codigoProduto) {

		case 1: // Case 1 - O usuário digitou 1
			System.out.println("Produto: Cachorro quente"); // exibindo na tela
			valorProduto = 10.00f;
			System.out.println("Quantidade: ");
			quantidadeProduto = ler.nextInt();
			
			break; // Fecha caso a opção tenho sido essa

		case 2: // Case 2 - O usuário digitou 2
			System.out.println("Produto: X - salada"); 
			valorProduto = 15.00f;
			System.out.println("Quantidade: ");
			quantidadeProduto = ler.nextInt();

			break;

		case 3: // Case 3 - O usuário digitou 3
			System.out.println("Produto: X - Bacon"); 
			valorProduto = 18.00f;
			System.out.println("Quantidade: ");
			quantidadeProduto = ler.nextInt();

			break;

		case 4: // Case 4 - O usuário digitou 4
			System.out.println("Produto: Bauru"); 
			valorProduto = 12.00f;
			System.out.println("Quantidade: ");
			quantidadeProduto = ler.nextInt();

			break;

		case 5: // Case 5 - O usuário digitou 5
			System.out.println("Produto: Refrigerante"); 
			valorProduto = 8.00f;
			System.out.println("Quantidade: ");
			quantidadeProduto = ler.nextInt();

			break;

		case 6: // Case 6 - O usuário digitou 6
			System.out.println("Produto: Suco de laranja"); 
			valorProduto = 13.00f;
			System.out.println("Quantidade: ");
			quantidadeProduto = ler.nextInt();

			break;

		}
		// soma o total
		total = valorProduto * quantidadeProduto;
		System.out.printf(" Valor total: R$ %.2f" , total);
	}
}
