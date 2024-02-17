package dia09;

import java.util.Scanner;

public class ExercicioCalculadoraSwitch02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1º declarar as variáveis

		float numero1;
		float numero2;
		int codigoOperacao;
		float resultado;
		Scanner ler = new Scanner(System.in);

		// exibindo as opções da calculadora
		System.out.println("-- Calculadora --");
		System.out.println("-- 1 - Soma --");
		System.out.println("-- 2 - Subtração --");
		System.out.println("-- 3 - Multiplicação --");
		System.out.println("-- 4 - Divisão --");

		codigoOperacao = ler.nextInt();

		switch (codigoOperacao) {
		case 1: {
			System.out.println("Digite o 1º número: "); // exibindo na tela
			numero1 = ler.nextFloat();

			System.out.println("Digite o 2º número: ");
			numero2 = ler.nextFloat();

			System.out.println("Operação: " + codigoOperacao);
			resultado = numero1 + numero2;
			System.out.println(numero1 + " + " + numero2 + " = " + resultado);

			break;
		}

		case 2: {
			System.out.println("Digite o 1º número: "); // exibindo na tela
			numero1 = ler.nextFloat();

			System.out.println("Digite o 2º número: ");
			numero2 = ler.nextFloat();

			System.out.println("Operação: " + codigoOperacao);
			resultado = numero1 - numero2;
			System.out.println(numero1 + " - " + numero2 + " = " + resultado);

			break;

		}
		case 3: {

			System.out.println("Digite o 1º número: "); // exibindo na tela
			numero1 = ler.nextFloat();

			System.out.println("Digite o 2º número: ");
			numero2 = ler.nextFloat();

			System.out.println("Operação: " + codigoOperacao);
			resultado = numero1 * numero2;
			System.out.println(numero1 + " * " + numero2 + " = " + resultado);

			break;

		}
		case 4: {

			System.out.println("Digite o 1º número: "); // exibindo na tela
			numero1 = ler.nextFloat();

			System.out.println("Digite o 2º número: ");
			numero2 = ler.nextFloat();

			System.out.println("Operação: " + codigoOperacao);
			resultado = numero1 / numero2;
			System.out.println(numero1 + " / " + numero2 + " = " + resultado);

			break;
		}
		
		// Default: o que sai fora do esperado
		default: System.out.println(" Operação Inválida!");
		}
	}

}
