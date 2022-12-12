package practiseProblemsDay3;

import java.util.Scanner;

public class EmpWageUc3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int IsFullTime = 4;
		int IsPartTime = 1;
		int EmpRatePerHr = 20;
		int EmpHrs1 = 16;
		int EmpHrs2 = 8;
		int Salary = (EmpHrs1 * EmpRatePerHr);
		int EmpHrs;
		
		if (IsFullTime == 2) {
			int Salary1 = (EmpHrs1 * EmpRatePerHr);
			System.out.println(" The Employee is FullTime and salary is " + Salary1);

		} else if (IsPartTime == 1) {
			int Salary2 = (EmpHrs2 * EmpRatePerHr);
			System.out.println("The Employee is Parttime and salary is " + Salary2);
		} else
			EmpHrs = 0;
	}

}
