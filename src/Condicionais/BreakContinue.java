package Condicionais;

public class BreakContinue {

	public static void main(String[] args) {
		int numeros[] = {1, 2, 3, 4, 5};
		
		for(int numero: numeros) {
			if(numero == 3) {
				break;
			}
			System.out.println(numero);
		}
		for(int numero: numeros) {
			if(numero == 3) {
				continue;
			}
			System.out.println(numero);
		}
		
	}

}
