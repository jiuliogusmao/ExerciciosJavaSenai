import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);

		double nota1;
		double nota2;
		double nota3;
		double nota4;

		System.out.print("Nota 1� bimestre: ");

		nota1 = sc.nextDouble();
		
		System.out.println();

		System.out.print("Nota 2� bimestre: ");

		nota2 = sc.nextDouble();
		
		System.out.println();
		
		System.out.print("Nota 3� bimestre: ");

		nota3 = sc.nextDouble();
		
		System.out.println();
		
		System.out.print("Nota 4� bimestre: ");

		nota4 = sc.nextDouble();
		
		System.out.println();
		
		sc.close();
		
		double resultado = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A m�dia final �: " + resultado);

	}

}
