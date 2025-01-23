package Cars_Showroom;
import java.util.UUID;
import java.util.Scanner;


public class Employees extends Showrooms implements utility {
	String emp_id;
	String emp_name;
	int emp_age;
	String emp_department;
	
	@Override
	public void get_details() {
		System.out.println("EMPLOYEE ID : "+ emp_id);
		System.out.println("EMPLOYEE NAME : "+ emp_name);
		System.out.println("EMPLOYEE AGE : "+ emp_age);
		System.out.println("EMPLOYEE DEPARTMENT : "+ emp_department);
		System.out.println("SHOWROOM NAME : "+ Showroom_name);
		System.out.println();
		System.out.println();
	}
	
	@Override
	public void set_details() {
		Scanner sc = new Scanner(System.in);
		System.out.println("############---CREATE EMPLOYEE DETAILS---############");
		System.out.println();
		UUID uuid = UUID.randomUUID();
		emp_id = String.valueOf(uuid);
		System.out.println("EMPOYEE NAME :");
		emp_name = sc.nextLine();
		System.out.println("EMPLOYEE AGE :");
		emp_age = sc.nextInt();
		System.out.println("EMPLOYEE DEPARTMENT :");
		emp_department = sc.nextLine();
		System.out.println("SHOWROOM NAME :");
		Showroom_name = sc.nextLine();
		System.out.println();
		System.out.println();
	}
}
