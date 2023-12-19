package Pfp014_Assignment_2;

public class UC8_Employee {

	public static void main(String[] args) 
	{
		calculateEmployeeWage("Company A", 20, 8, 100, 20);
        calculateEmployeeWage("Company B", 25, 7, 90, 22);
        calculateEmployeeWage("Company C", 30, 6, 80, 24);
        calculateEmployeeWage("Company D", 35, 5, 70, 26);
        calculateEmployeeWage("Company E", 40, 4, 60, 28);  
    }

    public static void calculateEmployeeWage(String companyName, int wagePerHour, int fullDayHours, int totalWorkingHours, int totalWorkingDays)
    {
        int totalWorkingHoursCondition = totalWorkingHours;
        int totalWorkingDaysCondition = totalWorkingDays;

        int totalWorkingHoursCompany = 0;
        int totalWorkingDaysCompany = 0;

        while (totalWorkingHoursCompany < totalWorkingHoursCondition && totalWorkingDaysCompany < totalWorkingDaysCondition)
        {
            int dailyWage = wagePerHour * fullDayHours;
            totalWorkingHoursCompany += fullDayHours;
            totalWorkingDaysCompany++;

            System.out.println("Company: " + companyName + ", Day " + totalWorkingDaysCompany + ", Daily employee wage: " + dailyWage);
        }

	}

}
