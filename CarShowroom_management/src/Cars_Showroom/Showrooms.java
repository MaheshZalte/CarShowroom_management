package Cars_Showroom;
//import java.sql.SQLoutput;
import java.util.Scanner;

public class Showrooms implements utility{
	String Showroom_name;
	String Showroom_Add;
	int Add_Showroom ;
	int Total_emp ;
	int total_cars_instock = 0;
	String Manager_name;
	
	@Override
	public void get_details() {
		System.out.println("SHOWROOM NAME :"+ Showroom_name);
		System.out.println("SHOWROOM Address : " + Showroom_Add);
		System.out.println("MANAGER NAME : "+ Manager_name);
		System.out.println("TOTAL EMPLOYEES : "+ Total_emp);
		System.out.println("TOTAL CARS IN STOCK : " + total_cars_instock);
		System.out.println();
		System.out.println();
	}
	
	@Override
	public void set_details() {
		Scanner sc = new Scanner(System.in);
		System.out.println("############---Create the SHOWROOM---############");
		System.out.println();
		System.out.println();
		System.out.print("SHOWROOM NAME :");
		Showroom_name = sc.nextLine();
		System.out.println();
		System.out.print("SHOWROOM Address :");
		Showroom_Add = sc.nextLine();
		System.out.println();
		System.out.print("MANAGER NAME :");
		Manager_name = sc.nextLine();
		System.out.println();
		System.out.print("TOTAL EMPLOYEES :");
		Total_emp = sc.nextInt();
		System.out.println();
		System.out.print("TOTAL CARS IN STOCK :");
		total_cars_instock = sc.nextInt();
		System.out.println();
		
	}
}
