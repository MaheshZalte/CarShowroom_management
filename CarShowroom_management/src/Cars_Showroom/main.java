package Cars_Showroom;
import java.util.*;
import java.lang.*;
import java.util.Scanner;

public class main {

	private static final String Syatem = null;

	public static void main_menu() {
		System.out.println("------------WELCOME TO THE CARS SHOWROOM------------");
		System.out.println();
		System.out.println();
		System.out.println("1) ADD SHOWROOM \t\t 2) ADD EMPLOYEES \t\t 3) ADD CARS");
		System.out.println();
		System.out.println("4) GET SHOWROOM \t\t 5) GET EMPLOYEES \t\t 6) GET CARS");
		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println();
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Showrooms showroom[] = new Showrooms[10];
		Employees emp[] = new Employees[5];
		cars  cars[] = new cars[5];
		int car_count = 0;
		int showroom_count = 0;
		int emp_count = 0;
		int choisse = 100;
		while(choisse != 0) {
			main_menu();
			choisse = sc.nextInt();
			while(choisse != 9 && choisse != 0) {
				switch(choisse) {
				case 1:
					showroom[showroom_count] = new Showrooms();
					showroom[showroom_count].set_details();
					showroom_count++;
					System.out.println("1) ADD NEW SHOWROOM");
					System.out.println("9) FOR BACK MAIN MENU");
					choisse = sc.nextInt();
					break;
					
				case 2:
					emp[emp_count] = new Employees();
					emp[emp_count].set_details();
					emp_count++;
					System.out.println("2) ADD NEW EMPLOYEE");
					System.out.println("9) FOR BACK MAIN MENU");
					choisse = sc.nextInt();
					break;
					
				case 3:
					cars[car_count] = new cars();
					cars[car_count].set_details();
					car_count++;
					System.out.println("3) ADD NEW CAR");
					System.out.println("9) FOR BACK MAIN MENU");
					choisse = sc.nextInt();
					break;
					
				case 4:
					for(int i = 0 ; i < showroom_count ; i++) {
						showroom[i].get_details();
					}
					System.out.println();
					System.out.println();
					System.out.println("9) FOR GO BACK TO MENU");
					System.out.println("0) Exite");
					choisse = sc.nextInt();
					break;
				
				case 5:
					for(int i = 0 ; i < emp_count ; i++) {
						showroom[i].get_details();
					}
					System.out.println();
					System.out.println();
					System.out.println("9) FOR GO BACK TO MENU");
					System.out.println("0) Exite");
					choisse = sc.nextInt();
					break;
					
				case 6:
					for(int i = 0 ; i < car_count ; i++) {
						showroom[i].get_details();
					}
					System.out.println();
					System.out.println();
					System.out.println("9) FOR GO BACK TO MENU");
					System.out.println("0) Exite");
					choisse = sc.nextInt();
					break;
					
				default:
					System.out.println("ENTER THE VALID INPUT !!");
					break;
					
				}
					
			}
			
		}
		
		
	}

}
