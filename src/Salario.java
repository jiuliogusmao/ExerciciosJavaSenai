import java.util.Locale;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		float horaTrab;
		float valorHora;
		
		System.out.print("digite quanto você ganha por hora: ");
		horaTrab = sc.nextFloat();
		
		System.out.println();
		
		System.out.print("Digite o número de horas trabalhadas no mês: ");
		valorHora = sc.nextFloat();
		
		sc.close();
		
		System.out.println();
		
		float resultado = horaTrab * valorHora;
		
		System.out.println("Seu salário deste mês é: " + resultado);
	}

}
