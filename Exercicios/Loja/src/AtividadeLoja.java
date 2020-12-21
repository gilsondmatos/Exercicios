import java.util.Locale;

public class AtividadeLoja {

	public static void main(String[] args) {
		
		
		String produto1 = "Computador";
		String produto2 = "Notebook";
		
		int idade = 30;
		int codigo = 5100;
		char genero = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Produtos: ");
		System.out.printf("%s custa R$ %.2f%n", produto1,price1);
		System.out.printf("%s custa R$ %.2f%n%n", produto2, price2);
		System.out.printf("Record: %d anos de idade, code %d e gênero: %s%n%n",idade,codigo,genero);
		Locale.setDefault(Locale.US);
		System.out.println("Measue with eight decimal palces:" + measure);
		System.out.printf("Rouded (three decimal places: %.3f%n",measure);
		System.out.printf("US decimal point: %.2f", measure);
		
		}

}

