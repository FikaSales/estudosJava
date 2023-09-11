package Repeticao;

public class uniruy {

	public static void main(String[] args) {
		long tempoInicial = System.currentTimeMillis();
		
		System.out.println("Olá Mundo");
//        for(int x=1; x<=100; x++) {
//            System.out.println(x);
//        }

		long tempoFinal = System.currentTimeMillis();

		System.out.printf("%.10f ms%n", (tempoFinal - tempoInicial)/1000d);
	}

}
