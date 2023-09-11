package Condicionais;

public class lista02e10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double total, valor, frete;
		    String regiao;
		    
		    regiao = "CO";
		    valor = 20; 
		    
		    if(regiao=="NE"){
		       total = valor*200; 
		    }//if do NE
		    else{
		        if(regiao=="S"){
		       total = valor*150; 
		        } // if do S
		        else{
		            if(regiao=="SE"){
		                       total = valor*85; 
		            }// if do SE
		            else{
		                if(regiao=="N"){
		                           total = valor*250; 
		                } // if do N
		                else{
		                           total = valor*180; 
		                } // else do CO
		            } // else do N
		            } // else do SE
		    } // else do NE
		    
		    System.out.println("O custo total da mercadoria é: R$" +total);
	}

}
