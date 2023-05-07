package calcularacrescimo;

import java.util.Scanner;

public class Produto {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		AcrescimoProduto acrescimo = new AcrescimoProduto();

		System.out.print("Informe o valor do produto: ");
		double valorOriginal = input.nextDouble();

		if (valorOriginal <= 0) {
			System.out.println("Numero invalido, tente novamente.");

		} else {
			double novoValor = acrescimo.acrescimo10(valorOriginal);
			System.out.printf("Novo valor do produto: %.2f%n", novoValor);
		}

		input.close();

	}

}
