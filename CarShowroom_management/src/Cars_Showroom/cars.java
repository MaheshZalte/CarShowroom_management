package Cars_Showroom;
import java.util.Scanner;


public class cars extends Showrooms implements utility{
	String Car_name;
	String Car_color;
	String Car_fiuleType;
	int Car_Price;
	String Car_type;
	String Car_transmission;
	
	@Override
	public void get_details() {
		System.out.println("############---CARS Detalis---############");
		System.out.println();
		System.out.println("CAR NAME : " + Car_name);
		System.out.println("CAR COLOR : "+ Car_color);
		System.out.println("CAR FIULE TYPE : "+ Car_fiuleType);
		System.out.println("CAR TRANSMISSION(Menual / Auto) : "+ Car_transmission);
		System.out.println();
		System.out.println();
	}
	
	@Override
	public void set_details() {
		Scanner sc = new Scanner(System.in);
		System.out.println("############---CARS Details---############");
		System.out.println();
		System.out.println();
		System.out.println("CAR NAME :");
		Car_name = sc.nextLine();
		System.out.println("CAR COLOR :");
		Car_color = sc.nextLine();
		System.out.println("CAR FIULE TYPE : ");
		Car_fiuleType = sc.nextLine();
		System.out.println("CAR TRANSMISSION(Menual / Auto) : ");
		Car_transmission = sc.nextLine();
		total_cars_instock++;
		System.out.println();
		System.out.println("");
		System.out.println("############--------*---------############");
		System.out.println();
		
		
		
	}
	
	
}
