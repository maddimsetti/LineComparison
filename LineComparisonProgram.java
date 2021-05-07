package linecomparison;

import java.util.Scanner;

//class Declaration
public class LineComparisonProgram {
	// variables
	private static final Scanner sc = new Scanner(System.in);
	static double x1, x2, y1, y2, a1, b1, a2, b2;
	static double length_Of_Line1, length_Of_Line2;

	// method
	public void compareTo() {
		System.out.println("enter x1 point\n");
		x1 = sc.nextInt();
		System.out.println("enter y1 point\n");
		y1 = sc.nextInt();
		System.out.println("enter x2 point\n");
		x2 = sc.nextInt();
		System.out.println("enter y2 point\n");
		y2 = sc.nextInt();
		length_Of_Line1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println("Length of a Line between two coordinates of " + "(" + x1 + "," + y1 + ")," + "(" + x2 + ","
				+ y2 + ") is" + length_Of_Line1);
		System.out.println("enter a1 point\n");
		a1 = sc.nextInt();
		System.out.println("enter b1 point\n");
		b1 = sc.nextInt();
		System.out.println("enter a2 point\n");
		a2 = sc.nextInt();
		System.out.println("enter b2 point\n");
		b2 = sc.nextInt();
		sc.close();
		length_Of_Line2 = Math.sqrt(Math.pow((a2 - a1), 2) + Math.pow((b2 - b1), 2));
		System.out.println("Length of a Line between two coordinates of " + "(" + a1 + "," + b1 + ")," + "(" + a2 + ","
				+ b2 + ") is " + length_Of_Line2);
		String str1 = String.valueOf(length_Of_Line1);
		String str2 = String.valueOf(length_Of_Line2);
		System.out.println(length_Of_Line1 + " .equals " + length_Of_Line2 + ": " + str1.equals(str2));
		System.out.println(length_Of_Line1 + " .compareTo " + length_Of_Line2 + ": " + str1.compareTo(str2));
		if (str1.compareTo(str2) == 0)
			System.out.println("Both Lines are Equal");
		else if (str1.compareTo(str2) > 0)
			System.out.println("Line_1 is  Greater than Line_2");
		else
			System.out.println("Line_1 is  Less than Line_2");
	}

	// Computation
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Line Comparison Computation Program");
		LineComparisonProgram line = new LineComparisonProgram();
		line.compareTo();
	}

}
