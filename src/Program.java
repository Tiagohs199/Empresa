import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Employee;
import Entities.OutsoursedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees?");
		int n = sc.nextInt();
		
		for (int i=0;i<n;i++) {
			System.out.printf("Employee #%d data: ",i+1);
			System.out.print("Outsourced (y/n)?");
			char j = sc.next().charAt(0);
			if (j == 'y') {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				System.out.print("Value per hour: ");
				Double money = sc.nextDouble();
				System.out.print("Additional charge: ");
				Double add = sc.nextDouble();
				list.add(new OutsoursedEmployee(name,hours,money,add));
			}else {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				System.out.print("Value per hour: ");
				Double money = sc.nextDouble();
				list.add(new Employee(name, hours, money));
			}
		}
		System.out.println("Payments: ");
		for (Employee emp: list) {
			System.out.println(emp.getName()+" -- $ " + emp.payment());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
