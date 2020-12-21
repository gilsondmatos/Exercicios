import java.util.Scanner;

public class DiferencaNumeros {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		int a = 0,b = 0,c = 0,d = 0;
		
		double diferenca; 
		
		System.out.print("Digite Valor de A: ");
		a = leia.nextInt();
		
		System.out.print("Digite Valor de B: ");
		b = leia.nextInt();
		
		System.out.print("Digite Valor de C: ");
		c = leia.nextInt();
		
		System.out.print("Digite Valor de D: ");
		d = leia.nextInt();
		
		diferenca = a*b - c*d;
		
		System.out.println("A diferença é: " + diferenca );
		
		leia.close();
		
		
		

	}

}
