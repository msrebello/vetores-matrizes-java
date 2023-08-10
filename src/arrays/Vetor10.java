/*

Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.

 */
package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Vetor10 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int N = sc.nextInt();

		char[] genero = new char[N];
		double[] altura = new double[N];

		for (int i = 0; i < N; i++) {
			
			System.out.print("Altura da " + (i + 1) + "a pessoa:  ");
			altura[i] = sc.nextDouble();
			
			System.out.print("Genero da " + (i + 1) + "a pessoa:  ");
			genero[i] = sc.next().charAt(0);

		}
		
		double menorAltura = altura[0];
		double maiorAltura = altura[0];
		double sumF = 0.0;
		int F = 0;
		int M = 0;
		
		for (int i = 0; i < altura.length; i++) {
			
			if (altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
			
			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
			
			if (genero[i] == 'F') {
				sumF += altura[i];
				F++;
			}
			
			if (genero[i] == 'M') {
				M++;
			}
		}
		
		double mediaF = sumF / F;
		
		System.out.println();
		System.out.println("Menor altura = " + String.format("%.2f",  menorAltura));
		System.out.println("Maior altura = " + String.format("%.2f",  maiorAltura));
		System.out.println("Media das alturas das mulheres = " + String.format("%.2f",  mediaF));
		System.out.println("Numero de homens = " + M);
		
		sc.close();
	}

}
