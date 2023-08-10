/*

Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.

 */
package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Vetor09 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int N = sc.nextInt();

		String[] vectNome = new String[N];
		int[] vectIdade = new int[N];

		for (int i = 0; i < N; i++) {
			System.out.printf("Dados da %da pessoa: \n", i + 1);

			System.out.print("Nome: ");
			sc.nextLine();
			vectNome[i] = sc.nextLine();

			System.out.print("Idade: ");
			vectIdade[i] = sc.nextInt();

		}

		int maiorIdade = vectIdade[0];
		int posMaior = 0;
		for (int i = 0; i < vectIdade.length; i++) {

			if (vectIdade[i] > maiorIdade) {
				maiorIdade = vectIdade[i];
				posMaior = i;
			}
		}

		System.out.println("PESSOA MAIS VELHA: " + vectNome[posMaior]);
		sc.close();
	}

}
