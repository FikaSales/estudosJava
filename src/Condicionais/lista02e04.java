package Condicionais;

public class lista02e04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int gol1, gol2;
	        String time1, time2;
	        
	        time1 = "Bahia";
	        time2 = "Vitoria";
	        gol1 = 3;
	        gol2 = 2;
	        
	        if(gol1>gol2){
	            System.out.println("O resulto foi vitória do: " + time1);
	            }
	        else{
	            if(gol1<gol2){
	                System.out.println("O resulto foi vitória do: " + time2);
	                }
	            else{
	                System.out.println("O resulto foi Empate");
	                }
	            }
	}

}
