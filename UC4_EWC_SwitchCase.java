package Pfp014_Assignment_2;

import java.util.Scanner;

public class UC4_EWC_SwitchCase {

	public static void main(String[] args) {
		int WagePerHour = 20;
		int FullDayHour = 8;
		int PartTimeHour = 4;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employeeType");
		int employeeType = sc.nextInt();
		
		switch(employeeType)
		{
		case 1:
			int FullTimeDailyWage = WagePerHour*FullDayHour;
			System.out.println("Daily full time employee wage: " + FullTimeDailyWage);
			break;
		case 2:
			int PartTimeDailyWage = WagePerHour*PartTimeHour;
			System.out.println("Daily part time employee wage: " + PartTimeDailyWage);
			break;
		default : System.out.println("Invalid employeeType");	      
		}

	}

}
