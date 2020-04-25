import java.util.Scanner;

public class JavaHomeworkClass6pt1 {
/*Challenge 1 1. Use if statements in Java to represent a 10 point grade system.
	A 90-100
	B 80-89
	C 70-79
	D 60-69
	F 0-59
	2. Create a program that takes user input (the score on a test), and use the if-else statement
	to return a letter grade.*/
	
	public static void main(String[] args) {
	System.out.println("Input a grade score: ");
	Scanner input = new Scanner(System.in);
	
	
	int grade = input.nextInt();

	
	if(grade >= 90) {
		System.out.println("A");
	}else if (grade >= 80 && grade < 90) {
		System.out.println("B");
	}else if (grade >= 70 && grade < 80) {
		System.out.println("C");
	}else if (grade >= 60 && grade < 70) {
		System.out.println("D");
	}else {
		System.out.println("F");
	}
	
	input.close();
}
}