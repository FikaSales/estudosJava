package Desafios;

public class Bolha {

	public static void main(String[] args) {
		int[] num = {1,5,18,3,11,2};
		int aux;
		
		for(int i=0; i<num.length; i++) {
			for (int j=i+1; j<num.length; j++) {
				if(num[i]>num[j]) {
					aux=num[i];
					num[i]=num[j];
					num[j]=aux;
				}
			}
		}
		for(int i=0; i<num.length; i++) {

		System.out.println("Está é a ordem crescente do array " + num[i]);
		}
	}

}
