import java.util.Scanner;

public class JavaHomeworkClass6pt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Convert the if statement from part 1 to a switch statement.
		
		System.out.println("Input a grade score: ");
		Scanner input = new Scanner(System.in);
		
		
		int grade = input.nextInt();
		
		

	      switch(grade/10) {
	         case 10 :
	         case 9 :
	            System.out.println("A"); 
	            break;
	         case 8 :
	            System.out.println("B");
	            break;
	         case 7 :
	            System.out.println("C");
	            break;
	         case 6 :
		        System.out.println("D");
		        break;
	         case 5 :  // could have done default for F but wanted an Invalid Grade Score for wrong inputs
	         case 4 :
	         case 3 :
	         case 2 :
	         case 1 :
	         case 0 :
	        	 System.out.println("F");
	        	 break;
	         default :
	            System.out.println("Invalid grade score");
	      }
	      System.out.println("You inputed: " + grade);
	   }
	
	// 2. Why would programmers prefer switch over if-else?
	/* Switch statements can be faster and are better for fixed data values, whereas If else are better for booleans.
	A switch statement can also be much cleaner looking when you have to combine cases. In comparison to If Else statements,
	Switch statements are easier to change and maintain. Switch are also a bit less vulnerable to errors like If Else 
	statements are */
	
	
}


