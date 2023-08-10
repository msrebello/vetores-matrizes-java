/* 
 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
 * tela todos os números pares, e também a quantidade de números pares.
*/

package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Vetor04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();

		int[] vect = new int[N];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}

		int cont = 0;
		System.out.println("\nNUMEROS PARES:");
		for (int i = 0; i < vect.length; i++) {

			if (vect[i] % 2 == 0) {
				System.out.print(vect[i] + " ");
				cont++;
			}

		}
		
		System.out.println("QUANTIDADE DE PARES = " + cont);

		sc.close();
	}

}
