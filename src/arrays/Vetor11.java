/*

Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.

 */
package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Vetor11 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int N = sc.nextInt();

		String[] Nome = new String[N];
		double[] nota1 = new double[N];
		double[] nota2 = new double[N];

		for (int i = 0; i < N; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno: ");
	
			sc.nextLine();
			Nome[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();

		}

		System.out.println("\nAlunos aprovados:");
		for (int i = 0; i < N; i++) {
			
			double media = (nota1[i] + nota2[i]) / 2;
			if (media >= 6.0) {
				System.out.println(Nome[i]);
			}
		}
		sc.close();
	}

}
