package tax;
import java.util.Scanner;

	public class withholding {
	public static void main (String [] args) {
	Scanner scnr = new Scanner(System.in);
	double weeklyIncome;
	double withHolding;
		
	System.out.println("Please enter your weekly income with cents.");
	
	weeklyIncome = scnr.nextDouble();
	
	if (weeklyIncome < 500.00) {
		withHolding = (weeklyIncome * 0.10);
		System.out.print("Your withholding is ");
		System.out.printf("%.2f", withHolding);
		System.out.println(".");
		}
	
	else if (weeklyIncome >= 500.00 && weeklyIncome < 1500.00) {
		withHolding = (weeklyIncome * 0.15);
		System.out.print("Your withholding is ");
		System.out.printf("%.2f", withHolding);
		System.out.println(".");
		}
	
	else if (weeklyIncome >= 1500.00 && weeklyIncome < 2500.00) {
		withHolding = (weeklyIncome * 0.20);
		System.out.print("Your withholding is ");
		System.out.printf("%.2f", withHolding);
		System.out.println(".");
		}
	
	else if (weeklyIncome >= 2500.00) {
		withHolding = (weeklyIncome * 0.30);
		System.out.print("Your withholding is ");
		System.out.printf("%.2f", withHolding);
		System.out.println(".");
		}
	
	else { 
		System.out.println("Please see a tax professional.");
		
		}
			
	}


}
