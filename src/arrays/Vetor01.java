package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Vetor01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int N = scan.nextInt();
		
		int[] vect = new int[N];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = scan.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		
		for (int i = 0; i < vect.length; i++) {
			
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}				
				
		scan.close();
	}

}
