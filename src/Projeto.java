import java.util.Locale;
import java.util.Scanner;

public class Projeto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int compras, atraso, pontuacaocompra, pontuacaoinadiplencia, pontuacaoformapag, pontuacaototal;
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
		
		if (atraso == 0 && compras > 0) {
			pontuacaoinadiplencia = 30;
		}
		else if (atraso >= 1 && compras > 0) {
			pontuacaoinadiplencia = 15;
		} 
		else {
			pontuacaoinadiplencia = 0;
		}
		
		pontuacaoformapag = 0;
		
		if (compras > 0 && formapagamento == 'D' || formapagamento == 'd' ) {
			pontuacaoformapag = 5;
		}
		if (compras > 0 && formapagamento == 'C' || formapagamento == 'c' || formapagamento == 'B' || formapagamento == 'b') {
			pontuacaoformapag = 10;
		}
		
		System.out.println();
		System.out.println("Score de inadimplência = " + pontuacaoinadiplencia + " pontos");
		System.out.println("Score de forma de pagamento = " + pontuacaoformapag);
		
		pontuacaototal = pontuacaocompra + pontuacaoinadiplencia + pontuacaoformapag;
		
		System.out.println();
		if (pontuacaototal >= 0 && pontuacaototal <= 25) {
			System.out.println("Classificação final = CLIENTE BRONZE");
		} 
		else if (pontuacaototal > 25 && pontuacaototal <= 75) {
			System.out.println("Classificação final = CLIENTE PRATA");
		}
		else {
			System.out.println("Classificação final = CLIENTE OURO");
		}
			
		sc.close();
	}

}

	