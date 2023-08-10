/*

Fazer um programa para ler dois números inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo números inteiros,
podendo haver repetições. Em seguida, ler um número inteiro X que
pertence à matriz. Para cada ocorrência de X, mostrar os valores à
esquerda, acima, à direita e abaixo de X, quando houver, conforme
exemplo.

 */

package matrizes;

import java.util.Scanner;

public class Matriz2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("==== Program - Matrix 02 ====\n");

		// PART 1 - READING DATA:

		System.out.print("Enter two integers (M and N) to form a matrix: ");
		int M = sc.nextInt();
		int N = sc.nextInt();

		// PART 2 - CREATING MATRIX:

		int[][] matrix = new int[M][N];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		// PART 3 - CHOSING AN ELEMENT:

		System.out.print("Enter an integer X that is in the array: ");
		int X = sc.nextInt();
		System.out.println();

		// PART 4 - SHOWING ELEMENT'S POSITION:

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				if (matrix[i][j] == X) {
					System.out.println("Position = " + i + "," + j);

					if (j > 0) {
						System.out.println("Left: " + matrix[i][j - 1]);
					}

					if (j + 1 < matrix[i].length) {
						System.out.println("Right: " + matrix[i][j + 1]);
					}

					if (i > 0) {
						System.out.println("Up: " + matrix[i - 1][j]);
					}

					if (i + 1 < matrix.length) {
						System.out.println("Down: " + matrix[i + 1][j]);
					}
				}
			}
		}

		sc.close();
	}

}
