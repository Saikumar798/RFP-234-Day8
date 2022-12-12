package practiseProblemsDay3;

public class EmpWageUc4 {

	public static void main(String[] args) {
		int Part_time = 4;
		int Wage_per_Hour = 20;
		int Full_day_Hour = 8;
		int Total_wage = 0;
		System.out.println("Welcome to Employee wage computation program");

		int random = (int) (Math.random() * 3);
		switch (random) {
		case 0: {
			System.out.println("Employee is present and Full Time");
			Total_wage = Full_day_Hour * Wage_per_Hour;
			break;
		}
		case 1: {
			System.out.println("Employee is present and Part time");
			Total_wage = Wage_per_Hour * Part_time;
			break;
		}
		default: {
			System.out.println("Employee is Absent");
			break;
		}
		}
		System.out.println("The Wage of The Employee is "+Total_wage);
	}
}


