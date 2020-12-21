import java.util.Locale;
import java.util.Scanner;

public class PecasValores {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int codigoPecaI = 0, codigoPecaII = 0;
		double quantidadePecasI = 0, quantidadePecasII = 0;
		double valorPecaI = 0.00, valorPecaII = 0.00;
		double valorCompra = 0.00;
		
		//ENTRADAS 
		
		System.out.print("Digite o código da peça: ");
		codigoPecaI = leia.nextInt();
		
		System.out.print("Quantas peças deseja comprar: ");
		quantidadePecasI = leia.nextInt();
		
		System.out.print("Valor Unitário: ");
		valorPecaI = leia.nextDouble();
		
		System.out.print("Digite o código da peça: ");
		codigoPecaII = leia.nextInt();
		
		System.out.print("Quantas peças deseja comprar: ");
		quantidadePecasII = leia.nextInt();
		
		System.out.print("Valor Unitário: ");
		valorPecaII = leia.nextDouble();
		
		//PROCESSAMENTO
		valorCompra = (quantidadePecasI*valorPecaI) + (quantidadePecasII*valorPecaII);
		
		//SAIDA
		System.out.printf("VALOR A PAGAR: R$  %.2f", valorCompra);
		
		leia.close();
		

//Outra forma de ser realizada		

		//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//
//		int cod1, cod2, qte1, qte2;
//	    double preco1, preco2, total;
//
//	    cod1 = sc.nextInt();
//	    qte1 = sc.nextInt();
//	    preco1 = sc.nextDouble();
//	    
//	    cod2 = sc.nextInt();
//	    qte2 = sc.nextInt();
//	    preco2 = sc.nextDouble();
//
//	    total = preco1 * qte1 + preco2 * qte2;
//
//	    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
//		
//		sc.close();
		
		
	}

}
