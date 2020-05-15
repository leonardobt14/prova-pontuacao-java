import java.util.Locale;
import java.util.Scanner;

public class Projeto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int compras, atraso, pontuacaocompra;
		double ticketmedio, volumecompras;
		char formapagamento;

		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO ÚLTIMO ANO");
		System.out.println();
		System.out.print("Quantas compras o cliente fez no último ano? ");
		compras = sc.nextInt();
		System.out.print("Qual o ticket médio? ");
		ticketmedio = sc.nextDouble();
		
		System.out.println();
		System.out.print("Quantas vezes o cliente atrasou o pagamento? ");
		atraso = sc.nextInt();
		System.out.print("A maioria das compras foi em dinheiro, cartão, ou boleto (D/C/B)? ");
		formapagamento = sc.next().charAt(0);
		
		volumecompras = compras * ticketmedio;
		
		if (volumecompras > 3000) {
			pontuacaocompra = 60;
		} 
		else if (volumecompras <= 3000 && compras > 2) {
			pontuacaocompra = 40;
		}
		else if (volumecompras <= 3000) {
			pontuacaocompra = 20;
		}
		else {
			pontuacaocompra = 0;
		}
		
		System.out.println();
		System.out.println("Score de volume de compras = " + pontuacaocompra + " pontos");
		
		
		sc.close();
	}

}

	