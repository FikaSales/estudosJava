package Condicionais;

public class lista02e03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double altura, peso;
		String sexo;
		
		peso = 0;
		altura = 1.82;
		sexo = "Masculino";
		
		if(sexo == "Masculino") {
			peso = (72.7*altura) - 58;
		}
		else if(sexo == "Feminino") {
			peso = (62.1*altura) - 44.7;
		}
		System.out.println("O seu sexo é: " + sexo + " e seu Peso Ideal é: " + peso);
	}

}