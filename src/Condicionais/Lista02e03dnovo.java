package Condicionais;

public class Lista02e03dnovo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		
		x = 10;
				
		switch (x) {
		case 0:
		case 1:
		case 2:
		    System.out.println("Seu conceito é:  Sem Conceito");
		    break;
		case 3:
		case 4:
		case 5:
		    System.out.println("Seu conceito é: Regular" );
		    break;
		case 6:
		case 7:
		case 8:
		    System.out.println("Seu conceito é: Bom");
		    break;
		case 9:
		case 10:
		    System.out.println("Seu conceito é: Muito Bom" );
		    break;
		default:
		    System.out.println("Essa nota não é válida" );
		}
	}

}
