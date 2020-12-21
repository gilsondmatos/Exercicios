import java.util.Locale;
import java.util.Scanner;

public class AreasFormas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		
		double c = 0.00, a = 0.00, b = 0.00; 
		double pi = 3.14159;
		double areaTriangulo = 0.00, areaCirculo = 0.00, areaTrapezio = 0.00;
		double areaQuadrado = 0.00, areaRetangulo = 0.00;

		//ENTRADAS
		System.out.println("[CALCULADORA DE AREAS]");

		System.out.print("Digite valor de A: ");
		a = leia.nextDouble();

		System.out.print("Digite valor de B: ");
		b = leia.nextDouble();
		
		System.out.print("Digite valor de C: ");
		c = leia.nextDouble();
		
		//PROCESSAMENTO
		areaTriangulo = a * c / 2;
		areaCirculo = Math.pow(c, 2)*pi;
		areaTrapezio = ((a+b)*c)/2;
		areaQuadrado = Math.pow(b,2);
		areaRetangulo = a*b;
		
		//SAIDAS
		System.out.println();
		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
		
		
		leia.close();

	}

}
