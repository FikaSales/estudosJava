package Repeticao;

public class MathPG {

	public static void main(String[] args) {
	    double pg=1, soma=0;

	    	for(int x=1; x<=64; x++){
			    soma= soma + pg;
			    pg=2*pg;
			    //System.out.println(soma);
	    	}    
	    System.out.println(soma);
	}

}
