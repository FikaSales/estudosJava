package Condicionais;

public class lista02e12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int  idade;

		    idade = 21;

		    if(5<=idade && idade<= 7){
		        System.out.println("Sua classificação é: Infantil A");
		    }//if Infantil A
		    else{
		        if(8<=idade && idade<=11){
		         System.out.println("Sua classificação é: Infantil B");
		    } // if Infantil B
		        else{
		        if(12<=idade && idade<=13){
		         System.out.println("Sua classificação é: Juvenil A");
		            }// if Juvenil A
		            else{
		                    if(14<=idade && idade<=17){
		                     System.out.println("Sua classificação é: Juvenil B");
		                } // if 4
		                else{
		                     System.out.println("Sua classificação é: Adulto");
		                } // else Adulto
		            } // else Juvenil B
		            } // else Juvenil A
		    } //  else Infantil B
	}

}
