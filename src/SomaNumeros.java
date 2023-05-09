import java.util.Scanner;

public class SomaNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Insira um numero: ");
		
		int numero1 = sc.nextInt();
		
		System.out.println("insira outro numero: ");
		
		int numero2 = sc.nextInt();
		
		sc.close();
		
		int resultado = numero1 + numero2;
		
		System.out.println("A soma dos números é igual a: " + resultado);

	}

}
