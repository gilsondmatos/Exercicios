import java.util.Locale;
import java.util.Scanner;

public class HorasTrabalhadas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner leia = new Scanner(System.in);

		int numeroFuncionario = 0;
		double valorHora = 0.00;
		double horasTrabalhadas = 0.00;
		double salario = 0.00;

		System.out.print("Digite o número do funcionário: ");
		numeroFuncionario = leia.nextInt();

		System.out.print("Valor da hora trabalhada: ");
		valorHora = leia.nextDouble();

		System.out.print("Digite a quantidade de horas trabalhadas:");
		horasTrabalhadas = leia.nextDouble();

		salario = valorHora * horasTrabalhadas;

		System.out.printf("número = %d%n", numeroFuncionario);
		System.out.printf("Salário R$ %.2f", salario);

		leia.close();
		
// Outra forma de realizar o mesmo exercício 		

//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//
//		int numero, horas;
//	    double valorHora, salario;
//
//	    numero = sc.nextInt();
//	    horas = sc.nextInt();
//	    valorHora = sc.nextDouble();
//
//	    salario = valorHora * horas;
//
//	    System.out.println("NUMBER = " + numero);
//	    System.out.printf("SALARY = U$ %.2f%n", salario);
//		
//		sc.close();


	}

}
