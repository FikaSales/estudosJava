package Condicionais;

public class lista02e11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  a, b, x;
	    String X;

	    a = 8;
	    b = 7;
	    X = "4";
	    // 1- soma 2- subtração 3- multiplicação 4- divisão
	    
	    if(X=="1"){
	    x = a+b;
	    }//if 1
	    else{
	        if(X=="2"){
	        x = a-b;
	    } // if 2
	        else{
	            if(X=="3"){
	            x = a*b;
	            }// if 3
	            else{
	                x=a/b;
	                } // if 4
	            } // else 3
	            } // else 2
	    
	    System.out.println("O resultado da operação é: " +x);
	}

}
