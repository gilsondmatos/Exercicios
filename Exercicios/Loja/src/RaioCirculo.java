import java.util.Locale;
import java.util.Scanner;

public class RaioCirculo {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
//		double R, A, pi = 3.14159;
//	    R = sc.nextDouble();
//	    A = pi * R * R;
		
		double valor = leia.nextDouble();
	
		double valorDePi = 3.14159;
		
		double raio = Math.pow(valor, 2)*valorDePi;
		
		System.out.printf("A = %.4f%n", raio);

		
		leia.close();
	}

}
