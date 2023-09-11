package Desafios;
import java.util.Scanner;

public class numPrimo{
	
	public static void main (String[] args) {
	
		int nr;
		
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o um Número");
		nr=ler.nextInt();
				
		if(primo(nr)) {
			System.out.println("SIM. O número "+ nr + " é Primo");
		}else { 		System.out.println("O número "+ nr + " NÃO é Primo"); }
		ler.close();
	}
	
	
	public static boolean primo(int nr) {
		int resto;
			
		if(nr<2) { return false; }
		for(int i=2; i<=Math.sqrt(nr); i++) {
			resto = nr%i;
			if(resto==0) {
				return false;
			}
		}
		return true;
	}
}