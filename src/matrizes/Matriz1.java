/*
 
Fazer um programa para ler um número inteiro N e uma matriz de
ordem N contendo números inteiros. Em seguida, mostrar a diagonal
principal e a quantidade de valores negativos da matriz.
 
 */

package matrizes;

import java.util.Scanner;

public class Matriz1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("==== Program - Matrix 01 ====\n");

		// PART 1 - READING DATA:

		System.out.print("Enter an integer to form a matrix: ");
		int N = sc.nextInt();

		// PART 2 - CREATING MATRIX:

		int[][] matrix = new int[N][N];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		// PART 2 - SHOWING DIAGONAL:

		System.out.println("\nMain diagonal:");

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				if (i == j) {
					System.out.print(matrix[i][j] + " ");
				}
			}
		}

		System.out.println();

		// PART 2 - SHOWING NEGATIVE NUMBERS:

		int negative = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				if (matrix[i][j] < 0) {
					negative++;
				}
			}
		}

		System.out.print("Negative numbers = " + negative);

		sc.close();
	}

}
