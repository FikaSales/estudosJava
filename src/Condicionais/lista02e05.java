package Condicionais;

public class lista02e05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double P, M, E;
	    
	    P = 59;
	    E = P - 50;
	    M = E * 12;
	    
	    if(P>50){
	        System.out.println("O excesso de peso foi " + E + "kg A multa a ser paga é: R$" + M);
	    }    
	        else{
	            E = 0;
	            M = 0;
	            System.out.println("O peso foi: " + P + "kg O excesso foi: " + E + "kg A multa foi: R$" + M);
	        }
	}

}
