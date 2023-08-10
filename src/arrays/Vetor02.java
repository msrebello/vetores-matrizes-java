package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Vetor02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int N = scan.nextInt();

		float[] vect = new float[N];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = scan.nextFloat();
		}

		System.out.print("\nVALORES = ");

		for (int i = 0; i < vect.length; i++) {

			System.out.print(vect[i] + " ");

		}

		double sum = 0.0;
		int cont = 0;
		
		for (int i = 0; i < vect.length; i++) {
			cont++;
			sum += vect[i];

		}
		
		double avg = sum / cont;
		
		System.out.println("\nSOMA = " + String.format("%.2f", sum));
		System.out.println("MEDIA = " + String.format("%.2f", avg));

		scan.close();
	}

}
