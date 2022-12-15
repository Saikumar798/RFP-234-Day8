package practiseProblemsDay3;

import java.util.Scanner;

public class LineComparision {

	public double FindLength(int x1, int x2, int y1, int y2) {
		double lengthofline = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
		return lengthofline;
	}

	public void CheckEquality(double Line1, double Line2) {
		
		if (Line1 > Line2)
			System.out.println("Length of Line 1 is greater than the Length of Line 2");
		else if (Line1 < Line2)
			System.out.println("Length of Line 1 is lesser than the Length of Line 2");
		else
			System.out.println("Both the lines have equal length");
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of  x1");
		int x1 = sc.nextInt();
		System.out.println("Enter the value of  x2");
		int x2 = sc.nextInt();
		System.out.println("Enter the value of  y1");
		int y1 = sc.nextInt();
		System.out.println("Enter the value of  y2");
		int y2 = sc.nextInt();
		System.out.println("Enter the value of  x3");
		int x3 = sc.nextInt();
		System.out.println("Enter the value of  x4");
		int x4 = sc.nextInt();
		System.out.println("Enter the value of  y3");
		int y3 = sc.nextInt();
		System.out.println("Enter the value of  y4");
		int y4 = sc.nextInt();

		LineComparision Compare = new LineComparision();
		
		double lengthOfLine1 = Compare.FindLength(x1, x2, y1, y2);
		System.out.println("The lenth of First Line is :" + lengthOfLine1);
		
		double lengthOfLine2 = Compare.FindLength(x3, x4, y3, y4);
		System.out.println("The lenth second Line is :" + lengthOfLine2);
		
		Compare.CheckEquality(lengthOfLine1, lengthOfLine2);
		

	}

}
