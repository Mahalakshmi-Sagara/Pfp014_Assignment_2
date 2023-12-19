package Pfp014_Assignment_2;

public class UC3_EmployeeWageCalculate {

	public static void main(String[] args) {
        int WagePerHour = 20;
        int FullDayHour = 8;
        int PartTimeHour = 4;
        
        int FullTimeDailyWage = WagePerHour*FullDayHour;
        System.out.println("Daily full time employee wage: " + FullTimeDailyWage);
        
        int PartTimeDailyWage = WagePerHour*PartTimeHour;
        System.out.println("Daily full time employee wage: " + PartTimeDailyWage);
        

	}

}
