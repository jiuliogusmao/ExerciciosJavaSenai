import java.util.Scanner;

public class ExibeNumero {

	public static void main(String[] args) {
		
		System.out.println("Insira um número: ");
		
		Scanner sc = new Scanner(System.in);
		
		int mostraNumero = sc.nextInt();
		
		sc.close();
		
		System.out.println("O número informado foi: " + mostraNumero);
	}

}
