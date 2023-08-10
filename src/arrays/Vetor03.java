package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Vetor03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int N = scan.nextInt();

		String[] vectNome = new String[N];
		int[] vectIdade = new int[N];
		float[] vectAltura = new float[N];

		// Entrada de dados
		for (int i = 0; i < N; i++) {
			System.out.printf("Dados da %da pessoa: \n", i + 1);
			scan.nextLine();
			System.out.print("Nome: ");
			vectNome[i] = scan.nextLine();
			System.out.print("Idade: ");
			vectIdade[i] = scan.nextInt();
			System.out.print("Altura: ");
			vectAltura[i] = scan.nextFloat();
		}

		// Media das alturas
		double soma = 0.0;
		int contIdade = 0;
		for (int i = 0; i < N; i++) {
			soma += vectAltura[i];

			if (vectIdade[i] < 16) {
				contIdade++;
			}
		}

		// Operações
		double avg = soma / N;
		double porcentagem16 = (double) contIdade / N * 100;

		System.out.println("Altura média: " + String.format("%.2f", avg));
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagem16);
		// Idade < 16
		for (int i = 0; i < vectAltura.length; i++) {

			if (vectIdade[i] < 16) {
				System.out.println(vectNome[i]);
			}
		}

		scan.close();
	}

}
