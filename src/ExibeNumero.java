import java.util.Scanner;

public class ExibeNumero {

	public static void main(String[] args) {
		
		System.out.println("Insira um n�mero: ");
		
		Scanner sc = new Scanner(System.in);
		
		int mostraNumero = sc.nextInt();
		
		sc.close();
		
		System.out.println("O n�mero informado foi: " + mostraNumero);
	}

}
