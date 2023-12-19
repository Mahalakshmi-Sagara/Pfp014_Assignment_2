package Pfp014_Assignment_2;

import java.util.Scanner;

public class UC5_MonthlyWageCalculate {

	public static void main(String[] args) {
		int WagePerHour = 20;
		int FullDayHour = 8;
		int PartTimeHour = 4;
		
		int totalworkingDay=20;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employeeType");
		int employeeType = sc.nextInt();
		
		switch(employeeType)
		{
		case 1:
			int FullTimeDailyWage = WagePerHour*FullDayHour;
			int FullTimeMonthlyWage = FullTimeDailyWage*totalworkingDay;
			System.out.println("Daily full time employee wage: " + FullTimeDailyWage);
			break;
		case 2:
			int PartTimeDailyWage = WagePerHour*PartTimeHour;
			int PartTimeMonthlyWage = PartTimeDailyWage*totalworkingDay;
			System.out.println("Daily part time employee wage: " + PartTimeDailyWage);
			break;
		default : System.out.println("Invalid employeeType");	      
		}

	}

}
