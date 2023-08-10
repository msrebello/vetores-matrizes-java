/* 

Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).

 */
package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Vetor05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();

		double[] vect = new double[N];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}

		double maior = vect[0];
		int posicaoMaior = 0;
		for (int i = 0; i < vect.length; i++) {

			if (vect[i] >  maior) {
				maior = vect[i];
				posicaoMaior = i;
			}

		}
		
		System.out.println("MAIOR VALOR = " + maior);
		System.out.println("POSICAO DO MAIOR VALOR = " + posicaoMaior);

		sc.close();
	}

}
