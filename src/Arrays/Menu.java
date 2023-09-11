package Arrays;
import java.util.Scanner;

public class Menu {

	public static int TelaMenu() {
		Scanner ler = new Scanner(System.in);
		System.out.println("###########  MENU  ##########");
		System.out.println("1 - EXIBIR OI  ");
		System.out.println("2 - CONTINUAR NO MENU");
		System.out.println("3 - SAIR ");
		System.out.println();
		System.out.println("OPÇÃO: ");
		return ler.nextInt();
		
	}
	
/*	public static void imprimiroi() {
		System.out.println("#############################");
		System.out.println("##                         ##");
		System.out.println("##    ||||||||||||   ||    ##");
		System.out.println("##    ||        ||   ||    ##");
		System.out.println("##    ||        ||   ||    ##");
		System.out.println("##    ||        ||   ||    ##");
		System.out.println("##    ||        ||   ||    ##");
		System.out.println("##    ||||||||||||   ||    ##");
		System.out.println("##                         ##");
		System.out.println("#############################");
	}*/
	
	public static void main(String[] args) {
		int opcao;
		opcao = TelaMenu();
		while(opcao!=3) {
			switch(opcao) {
			case 1:
				imprimiroi();
				opcao = TelaMenu();
				break;
			case 2:
				System.out.println("CONTINUAR NO MENU");
				opcao = TelaMenu();
				break;
			case 3:
				System.out.println("SAIR DO PROGRAMA"); // como nao entra no WHILE ele nao roda.
				break;
			default:
				System.out.println("OPCAO INVALIDA");
				opcao = TelaMenu();
			}
		}
		System.out.println("FIM DO PROGRAMA");
	}
} 
