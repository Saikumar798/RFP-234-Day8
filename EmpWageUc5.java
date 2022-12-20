package practiseProblemsDay8;

import java.util.Random;

public class EmpWageUc5 {
	public static void main(String[] args) {

		final int WAGE_PER_HR = 20;
		final int FULL_TIME = 8;
		final int PART_TIME = 4;
		int total_Wage = 0;

		Random random = new Random();

		for (int i = 1; i < 20; i++) {
			int empAttendance = random.nextInt() % 2;
			System.out.println(empAttendance);
			if (empAttendance == 0) {
				System.out.println("Employee is Absent");
			} else {
				System.out.println("Employee is Present");

				int empType = random.nextInt() % 2;
				switch (empType) {
				case 0:
					System.out.println("Full Time");
					total_Wage = WAGE_PER_HR * FULL_TIME;
					break;
				case 1:
				case -1:
					System.out.println("Part Time");
					total_Wage = WAGE_PER_HR * PART_TIME;
					break;
				}

			}
			System.out.println("Total Wage =" + total_Wage);
		}

	}

}
