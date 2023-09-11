package Arrays;
import java.util.Scanner;
// Vetores
public class classEx01 {

	public static void main(String[] args) {
		String[] animais;
		
		animais = new String[5];
		
		animais[0]= "cachorro";
		animais[1]= "gato";
		animais[2]= "coelhao";
		animais[3]= "vaca";
		animais[4]= "cavalo";
		
		for(int i=0; i < 5; i ++) {
			System.out.println(animais[i]);
		}
	}

}

/*public class classEx01 {

	public static void main(String[] args) {
		String[] pais;
		pais = new String[5];
		Scanner ler = new Scanner(System.in);
		
		for(int i=0; i < 5; i ++) {
			System.out.println("País[" + i + ":]");
			pais[i] = ler.next();
		}
		for(int i=0; i<5; i++) {
			System.out.println(pais[i]);
		}
	}

}*/
