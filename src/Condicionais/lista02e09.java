package Condicionais;

public class lista02e09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor, real;
	    String moeda;
	    
	    moeda = "L";
	    valor = 10; 
	    // Euro = 3.33 Dolar = 3.17 Libra = 3.85
	    
	    if(moeda=="E"){
	       real = valor*3.33; 
	    }
	    else{
	        if(moeda=="D"){
	            real = valor*3.17;
	        }
	        else{
	            real = valor*3.85;
	        }
	    }
	    
	    System.out.println("O valor de compra em Reais é: R$" +real);
	}

}
