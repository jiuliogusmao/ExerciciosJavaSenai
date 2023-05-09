import java.util.Locale;
import java.util.Scanner;

public class ConversorDeTemp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		double F = 0;
		
		System.out.print("Temperatura em Fahrenheit: ");
		
		F = sc.nextDouble();
		
		sc.close();
		double C = 5 * ((F - 32) / 9);
		
		System.out.print("A temperatura em graus Celsius é: " + C);
		
		
	}

}
