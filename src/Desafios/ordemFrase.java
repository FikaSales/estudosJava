package Desafios;
import java.util.Scanner;

public class ordemFrase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("Digite a frase:");
	String frase = scanner.nextLine();
	String fraseInvertida = inverterPalavras(frase);
	System.out.println("Frase com as palavras invertidas:");
	System.out.println(fraseInvertida);
	scanner.close();
	}

	public static String inverterPalavras(String frase) {
		String[] palavras = frase.split(" ");
		StringBuilder resultado = new StringBuilder();

		for (int i = palavras.length - 1; i >= 0; i--) {
			resultado.append(palavras[i]);
		    if (i != 0) {
		    	resultado.append(" ");
		    }
		}
        return resultado.toString();
	}
}
