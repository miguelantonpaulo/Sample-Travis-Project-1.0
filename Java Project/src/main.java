import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int choice = 0;
		
		while(choice < 6) {
			//dbms fucntion 
			System.out.println("DBMS Functions");
			
			System.out.println("MENU");
			System.out.println("[1]Add to DB");
			System.out.println("[2]Delete in DB");
			System.out.println("[3]Search DB");
			//System.out.println("[4]View by DB Column");
			System.out.println("[5]View All");
			System.out.println("[6]Exit");
			System.out.print("Choice: ");
			
			choice = input.nextInt();
			
		}
	}
	
	public void menu(int choice) {
		if(choice == 1) {
			//add to DB function here
			System.out.println("Adding to DB!");
		}else {
			System.out.println("Bye!");
		}
	}
}
