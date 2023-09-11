package Arrays;
import java.util.Scanner;
// Vetores -> Recebe nome e idade. Retorna +18 com Nome e Soma das Idades.
public class classEx03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] idade = new int[5];
		String[] pessoa = new String[5];
		int soma=0;
		
		for(int i=0; i<5; i++) {
			System.out.println("Nome: [" + i + "]");
			pessoa[i] = ler.next();
			System.out.println("Idade: [" + i + "]");
			idade[i]= ler.nextInt();
			}
		for(int i=0; i<pessoa.length; i++) {// .length -> retorna no tamonho do vetor.
			if(idade[i]>18) {
				soma = soma + idade[i];
				System.out.println(pessoa[i] +"  "+ idade[i]);
			}
		}
		System.out.println("Soma das idades: " +soma);
	}

}
