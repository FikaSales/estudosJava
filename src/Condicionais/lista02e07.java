package Condicionais;

public class lista02e07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double horas, salario, Excesso; 
	    
	    horas = 40;
	    
	    if(horas>44){
	    Excesso = (horas-44)*50;
	    salario = (44*35);
	    }    
	        else{
	        Excesso = 0;
	        salario = (horas*35);
	        }
	    System.out.println("O salário total é: R$" + salario + " O salário excedente é: R$" +Excesso);
	}

}
