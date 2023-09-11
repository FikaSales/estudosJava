package Arrays;
// Calculadora basica.
import java.util.Scanner;

public class funcoes {

	public static void main (String[] args) {
		int nr1, nr2;
		int usuario =1;
		
		while (usuario==1) {
		nr1 = lerNr();
		nr2 = lerNr();
		System.out.println("A soma é: " + somar( nr1 , nr2));
		System.out.println("A subtração é: " + subtrair( nr1 , nr2));
		System.out.println("A divisão é: " + dividir( nr1 , nr2));
		System.out.println("A multiplicação é: " + multiplicar( nr1 , nr2));
		
		usuario = opcao();
		}
	}
	// Função dos Calculos.
		public static int somar(int n1, int n2) {
			int soma;
			soma = n1 + n2;
			return soma;
		}
		public static double dividir(double n1, double n2) {
			double divisao=0;
			if (n2 != 0) {
				divisao = n1 / n2;
			}else {
				System.out.println("Divisão não é possível. Valor zerado");
				divisao = 0;
			}
			return divisao;
		}
		public static int multiplicar(int n1, int n2) {
			int multiplicacao;
			multiplicacao = n1 * n2;
			return multiplicacao;
		}
		public static int subtrair(int n1, int n2) {
			int subtracao;
			subtracao = n1 - n2;
			return subtracao;
		}
		
		
		// Funcao de novo Calculo.
		public static int opcao() {
			Scanner ler = new Scanner(System.in);
			System.out.println("Deseja novo calculo? 1-SIM 2-NAO");
			return ler.nextInt();
		}
		// Funcao que recebe Numero.
		public static int lerNr() {
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite um número inteiro");
			return ler.nextInt();
		}
		
}
