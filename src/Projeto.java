import java.util.Locale;
import java.util.Scanner;

public class Projeto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int compras;
		double ticketmedio;

		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO �LTIMO ANO");
		System.out.println();
		System.out.print("Quantas compras o cliente fez no �ltimo ano? ");
		compras = sc.nextInt();
		System.out.print("Qual o ticket m�dio? ");
		ticketmedio = sc.nextDouble();
		
		
		
		sc.close();
	}

}

	