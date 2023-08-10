/*

Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"

 */
package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Vetor08 {

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
		int cont = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				sum += vect[i];
				cont++;
			}
		}
		
		if (cont != 0) {
			double avg = sum / cont;
			System.out.println("\nMEDIA DOS PARES = " + String.format("%.1f", avg));
		}
		
		else {
			System.out.println("\nNENHUM NUMERO PAR");
		}
		sc.close();
	}

}
