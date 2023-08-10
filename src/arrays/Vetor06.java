/*

Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.

 */


package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Vetor06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();

		int[] A = new int[N];
		int[] B = new int[N];
		int[] C = new int[N];
		
		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < A.length; i++) {
			
			A[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < B.length; i++) {

			B[i] = sc.nextInt();
		}		
		
		System.out.println("VETOR RESULTANTE:");		
		for (int i = 0; i < C.length; i++) {

			C[i] =  A[i] + B[i];
			System.out.println(C[i]);
		}		
		
	

		sc.close();
	}

}
