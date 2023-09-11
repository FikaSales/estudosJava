package Repeticao;
import java.util.Scanner;

public class Exec02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num=0, tabuada;
		
		System.out.println("Digite um número: ");
		num = ler.nextInt();
		
		for(int x=1; x<=10; x++) {
			tabuada= num*x;
			System.out.println(tabuada);
		}
	}

}
