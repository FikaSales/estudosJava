package Arrays;
import java.util.Scanner;
// 
public class classEx02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] nr = new int [6];
		
		for(int i=0; i<6; i++) {
			System.out.println("NR: [" + i + "]");
			nr[i]= ler.nextInt();
		}
		
		for(int i=5; i>=0; i--) {
			System.out.println("NR:[ " + i + "]" + nr[i]);
		}
	}

}
