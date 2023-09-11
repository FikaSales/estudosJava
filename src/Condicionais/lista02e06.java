package Condicionais;

public class lista02e06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario, vendas, sTotal;

	    salario = 1200;
	    vendas = 1600;

	    if(vendas<=1500){
	        sTotal = salario + (vendas*0.03);
	    }    
	        else{
	            sTotal = salario + (vendas*0.05);
	        }
	    System.out.println("O salário total é: R$" + sTotal);
	}

}
