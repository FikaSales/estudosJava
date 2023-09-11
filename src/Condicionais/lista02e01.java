package Condicionais;

public class lista02e01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  nome;
		double salarioI, debito, credito, saldoA;
		nome = "Felipe";
		salarioI = 1200.13;
		debito = 1000.00;
		credito = 100.00;
		
		saldoA = salarioI-debito+credito;
		
		if(saldoA>=0) {
			System.out.println(nome + "-> Saldo Positivo");
		}
		else {
			System.out.println( nome + "-> Saldo Negativo");
		}
	}

}
