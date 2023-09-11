package Condicionais;

public class lista02e08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double valor, troco, cedulas;
		    
		    valor = 22;
		    cedulas = Math.ceil(valor/5); // Função que arredonda para o inteiro acima do valor; Math.round -> para o + proximo; Math.floor -> para baixo;
		    troco = (cedulas*5) - valor;
		    
		    
		    System.out.println("Serão nescessárias: " + cedulas + " Cédulas E o troco será: R$" + troco);
	}

}
