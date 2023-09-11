package Condicionais;

public class Exerc09dnovo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor, real;
	    String moeda;
	    
	    real = 0;
	    moeda = "d";
	    valor = 10; 
	    // Euro = 3.33 Dolar = 3.17 Libra = 3.85
	    
	    switch (moeda) {
	    case "L":
	    case "l":
	    	real = valor*3.85;
	    	break;
	    case "D":
	    case "d":
	    	real = valor*3.17;
	    	break;
	    case "E":
	    case "e":
	    	real = valor*3.33;
	    	break;
	    }
	    System.out.println("O valor de compra em Reais é: R$" +real);
	}

}
