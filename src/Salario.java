import java.util.Locale;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		float horaTrab;
		float valorHora;
		
		System.out.print("digite quanto voc� ganha por hora: ");
		horaTrab = sc.nextFloat();
		
		System.out.println();
		
		System.out.print("Digite o n�mero de horas trabalhadas no m�s: ");
		valorHora = sc.nextFloat();
		
		sc.close();
		
		System.out.println();
		
		float resultado = horaTrab * valorHora;
		
		System.out.println("Seu sal�rio deste m�s �: " + resultado);
	}

}
