package Repeticao;
import java.util.Scanner;
// Loop de NR diferentes de 0 -> Retorno de Soma e Média.
public class Lista03e05 {

	public static void main(String[] args) {
		double nr, contador, soma, media;
		soma = contador = media = 0;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Numero: ");
		nr = ler.nextInt();
		
		while(nr !=0) {
			soma = soma + nr;
			contador++;
			System.out.println("Numero: ");
			nr= ler.nextInt();
		}
		
		System.out.println("Soma: " + soma);
		System.out.println("Contador: " + contador);
		media= soma / contador;
		System.out.println("Média: " + media);
	}

}

