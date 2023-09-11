package Arrays;
// Recebe valor da Compra, calcula desconto e retorna o Toral
import java.util.Scanner;

public class Compras {

	public static void main(String[] args) {
		double valorCompra, desconto;
		int nova=1;
		Scanner ler = new Scanner(System.in);
		
		while(nova==1) {
		valorCompra = lerCompra();
		desconto = calculoDesconto(valorCompra);
		System.out.println("O VALOR DO PRODUTO: " + valorCompra);
		System.out.println("O VALOR DO DESCONTO É: " + desconto);
		System.out.println("O VALOR TOTAL DO PROTUDO É: " + (valorCompra-desconto));
		System.out.println("Digite 1 para uma nova compra! ");
		nova = ler.nextInt();
		}
	}
	
	public static double lerCompra() {
		Scanner ler = new Scanner(System.in);
		System.out.println("VALOR DA COMPRA: ");
		return ler.nextDouble();
	}
	
	public static double calculoDesconto(double compra) {
		double desc=0;
				if(compra<=500) {
			desc = compra * 0.05;	
		}else {
			desc = compra * 0.075;
		}
		return desc;
	}
}