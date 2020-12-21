import java.util.Scanner;

public class SomaDoisNumeros {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int num1 = leia.nextInt();
		int num2 = leia.nextInt();

		int soma = num1 + num2;

		System.out.println("A Soma dos valores é " + soma);

		leia.close();

	}

}
