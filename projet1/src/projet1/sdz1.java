package projet1;
import java.util.Scanner;

public class sdz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  char response = ' ';
		  System.out.println("Choisissez le type de convertion : (f pour fahrenhiet / c pour celsius)");	 
		  response = sc.nextLine().charAt(0);
		  double temperature;
		  double convertit;
		  char retry = ' ';
		  
		  do {
			  if(response == 'f' || response == 'c') {
				  System.out.println("Entrez la temperature que vous souhaitez convertir");
				  
				  temperature =  sc.nextDouble();
				  
				  if(response == 'f') {
					  convertit = (temperature - 32.0) * 5.0 / 9.0;
					  convertit = arrondi(convertit,1);
					  System.out.println(temperature + "�F correspond a : " + convertit + "�Celsius");
					  System.out.println("Souhaitez vous entrer une autre temperature ?(o/n)");
					  sc.nextLine();
					  retry = sc.nextLine().charAt(0);
				  }
				  if(response == 'c') {
					  convertit = 9.0 / 5.0 * temperature +32.0;
					  convertit = arrondi(convertit,1);
					  System.out.println(temperature + "�C correspond a : " + convertit + "�Fahrenhiet");
					  System.out.println("Souhaitez vous entrer une autre temperature ?(o/n)");
					  sc.nextLine();
					  retry = sc.nextLine().charAt(0);
				  }
				  
			  } else {
				  System.out.println("Choisissez une option valide");
			  }
		  
		  }while(retry == 'o' || retry == 'O');
		  
		  System.out.println("Fin de l'application au revoir");
		
	}
	public static double arrondi(double A, int B) {
		  return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
		}

}
