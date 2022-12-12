package practiseProblemsDay3;

public class EmpWageUc1 {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");

		int empPresent = 1;
		int empStatus = (int) ((Math.random() * 10) % 2);
		System.out.println(empStatus);

		if (empStatus == empPresent)
			System.out.println("Employee is Present ");
		else
			System.out.println("Employee is not Present ");

	}
}
																	