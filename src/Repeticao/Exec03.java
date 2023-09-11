package Repeticao;
public class Exec03 {

	public static void main(String[] args) {
		
		for(int x=1; x<=100; x++) {
			System.out.println(x);
			if(0==(x%10)) {
				System.out.println("Múltiplo de 10");
			}
		}
	}

}
