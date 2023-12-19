package Pfp014_Assignment_2;

public class UC6_ConditionalWageCalcute {

    public static void main(String[] args) {
        int WagePerHour = 20;
        int FullDayHour = 8;
        int PartTimeHour = 4;

        int TotalWorkingHoursCondition = 100;
        int TotalWorkingDaysCondition = 20;
        int employeeType =2; // 1 for full-time, 2 for part-time

        int TotalWorkingHours = 0;
        int TotalWorkingDays = 0;

        while (TotalWorkingHours < TotalWorkingHoursCondition && TotalWorkingDays < TotalWorkingDaysCondition) {
            switch (employeeType) {
                case 1:
                    int FullTimeDailyWage = WagePerHour * FullDayHour;
                    TotalWorkingHours += FullDayHour;
                    TotalWorkingDays++;
                    System.out.println("Day " + TotalWorkingDays + " Daily full-time employee wage: " + FullTimeDailyWage);
                    break;
                case 2:
                    int PartTimeDailyWage = WagePerHour * PartTimeHour;
                    TotalWorkingHours += PartTimeHour;
                    TotalWorkingDays++;
                    System.out.println("Day " + TotalWorkingDays + " Daily part-time employee wage: " + PartTimeDailyWage);
                    break;
                default:
                    System.out.println("Enter valid employeeType");
                    break;
            }
        }
    }
}
