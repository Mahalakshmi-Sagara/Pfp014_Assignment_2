package Pfp014_Assignment_2;

public class UC7_Employee
{
		private static double hourlyRate = 10.0;
	    public static double computeWage(int hoursWorked)
	    {
	        double overtimeRate = 1.5;
	        if (hoursWorked <= 40) 
	        {
	            return hoursWorked * hourlyRate;
	        } 
	        else 
	        {
	            int regularHours = 40;
	            int overtimeHours = hoursWorked - regularHours;
	            return (regularHours * hourlyRate) + (overtimeHours * hourlyRate * overtimeRate);
	        }
	    }

	    public static void main(String[] args)
	    {
	        int hoursWorked = 45;
	        double totalWage = computeWage(hoursWorked);
	        System.out.println("Employee wage for " + hoursWorked + " hours: $" + totalWage);

	}

}
