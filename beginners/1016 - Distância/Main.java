import java.util.Scanner;
public class Main {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int distanciaKm = Integer.parseInt(scan.nextLine());
		
		int tempo = distanciaKm * 2;
		
		System.out.println(tempo + " minutos");
	}
}
