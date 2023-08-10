/*

Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.

 */

package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Vetor07 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int N = sc.nextInt();

		double[] vect = new double[N];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}

		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {

			sum += vect[i];
		}

		double avg = sum / vect.length;
		System.out.println("\nMEDIA DO VETOR = " + String.format("%.3f", avg));

		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for (int i = 0; i < vect.length; i++) {

			if (vect[i] < avg) {
				System.out.println(vect[i]);
			}
		}

		sc.close();
	}

}
