import java.util.Scanner;
public class JavaHomeworkClass6pt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	System.out.println("Welcome to Daniel's Fortune Teller. \nPlease pick a color: Blue(1), Red(2), Green(3), Yellow(4).");
	Scanner input = new Scanner(System.in);
	int color = input.nextInt();
	
	System.out.println("Choose a number: 7, 13, 21, 42.");
	
	Scanner input2 = new Scanner(System.in);
	
	int number = input.nextInt();
	
	String fortune = "Fortune says: ";
	
	if(color == 1) {
		if(number == 42) {
			System.out.println(fortune + "Life will reward you soon.");
		}else if (number == 21) {
			System.out.println(fortune + "Alas! The onion you are eating is someone else's water lily.");
		}else if (number == 13) {
			System.out.println(fortune + "Serious trouble will bypass you.");
		}else if (number == 7) {
			System.out.println(fortune + "You can still love what you can not have in life.");
		}else 
			System.out.println(fortune + "You didnt choose a correct number.");
	}else if(color == 2) {
		if(number == 42) {
			System.out.println(fortune + "It's Never Too Late For Good Things To Happen!");
		}else if (number == 21) {
			System.out.println(fortune + "You can make your own happiness.");
		}else if (number == 13) {
			System.out.println(fortune + "Love or money, or neither?");
		}else if (number == 7) {
			System.out.println(fortune + "You will make many changes before settling down happily.");
		}else 
			System.out.println(fortune + "You didnt choose a correct number.");
	}else if(color == 3) {
		if(number == 42) {
			System.out.println(fortune + "A big fortune will descend upon you this year.");
		}else if (number == 21) {
			System.out.println(fortune + "Your way of doing what other people do their way is what makes you special.");
		}else if (number == 13) {
			System.out.println(fortune + "Volition, Strength, Languages, Freedom and Power rests in you.");
		}else if (number == 7) {
			System.out.println(fortune + "If your desires are not extravagant, they will be granted");
		}else 
			System.out.println(fortune + "You didnt choose a correct number.");
	}else if(color == 4) {
		if(number == 42) {
			System.out.println(fortune + "Love is on its way.");
		}else if (number == 21) {
			System.out.println(fortune + "Remember this: duct tape can fix anything, so don't worry about messing things up.");
		}else if (number == 13) {
			System.out.println(fortune + "Let your fantasies unwind...");
		}else if (number == 7) {
			System.out.println(fortune + "One who admires you greatly is hidden before your eyes.");
		}else {
			System.out.println(fortune + "You didnt choose a correct number.");
		}
	}else 
		System.out.println(fortune + "You didnt choose a color.");
	
	
	
	
		
			
	}
}
