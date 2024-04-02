import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		Room[] quart = new Room[10];
		int contador = 1;
		System.out.println("How many rooms will be rented: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i= 0; i<n;i++) {
		System.out.println("Rent #"+ contador);
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Email: ");
		String email = sc.nextLine();
		System.out.println("Room:");
		int room = sc.nextInt();
		sc.nextLine();
		quart[i] = new Room(name,email,room);
		contador++;
		}
		
		System.out.println("Busy rooms:");
		
		for (int i= 0; i<n;i++) {
			
	     System.out.println(quart[i]);
		}
		sc.close();
    }
}
