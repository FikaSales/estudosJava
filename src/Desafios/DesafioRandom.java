package Desafios;

import java.util.Random;
import java.util.Scanner;
// Sorteio: Gerar NR aleatório e informar se Par ou Ímpar.
public class DesafioRandom {

	public static String jogador() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite par ou impar");
		return ler.next();
	}
	
	public static int numeroAleatorio() {
		Random aleatorio = new Random();
		int nr = aleatorio.nextInt(10);
		return nr;
	}
	
	public static void resultado(int  nr, String escolha) {
		if(nr%2 == 0) {
		System.out.print("O número gerado foi PAR "+ nr);
			if(escolha=="par") {
				System.out.println("Parabéns, vôce Ganhou!");
			}else { System.out.println("Você Perdeu");}
		}else {
			System.out.print("O número gerado foi ÍMPAR "+ nr);
			if(escolha=="impar") {
				System.out.println("Parabéns, vôce Ganhou!");
			}else { System.out.println("Você Perdeu");}
		}
	}
	public static void main(String[] args) {
		String escolha = jogador();
		int nr = numeroAleatorio();
		resultado(nr, escolha);
		}
}
