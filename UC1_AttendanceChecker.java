package Pfp014_Assignment_2;

import java.util.Random;

public class UC1_AttendanceChecker {

	public static void main(String[] args) {
		Random random = new Random();
		boolean isPresent = random.nextBoolean();
		if(isPresent)
		{
			System.out.println("Employee is Present");
		}
		else
		{
			System.out.println("Employee is Absent");
		}

	}

}
