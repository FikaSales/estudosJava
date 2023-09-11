package Condicionais;

public class Exerc08dnovo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double troco;
		 int cedulas, valor;
				    
		 valor = 18;
		 cedulas = (valor/5) + 1;
		 troco = (cedulas*5) - valor;

		 System.out.println("Serão nescessárias: " + cedulas + " Cédulas E o troco será: R$" + troco);
	}

}