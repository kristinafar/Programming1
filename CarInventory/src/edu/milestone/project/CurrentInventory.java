package edu.milestone.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CurrentInventory {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<Automobile> curCars = new ArrayList<Automobile>();
		
		Automobile autoMobile = new Automobile("Honda", "CRV", "White", 2015, 34255, 1);
		curCars.add(autoMobile);
		
		int menuOption;
		int i;
		i = 0;

	
		while (i < '5') {
				System.out.println("Please select an option by entering a number:");
				System.out.println("1: View Inventory");
				System.out.println("2: Add Car");
				System.out.println("3: Remove Car");
				System.out.println("4: Print Inventory");
				System.out.println("5: Update Car");
				System.out.println("6: Quit Program");
				menuOption = scnr.nextInt();

						//option else tree
						if (menuOption == 1) {
							viewInventory(curCars);
						}
						else if (menuOption == 2) {
							addCar(curCars, scnr);

						}
						else if (menuOption == 3) {
							removeCar(curCars, scnr);
						}
						else if (menuOption == 4) {
							printInventory();
						}
						else if (menuOption == 5) {
							updateCar(curCars, scnr);
						}
						else if (menuOption == 6) {
							System.out.println("Thank you for using this program. Now closing.");
							break;
						}
			}
		
	}

	private static void viewInventory(ArrayList<Automobile> curCars) {
		System.out.println("Current inventory:" 
											+ curCars);
	}

	private static void updateCar(ArrayList<Automobile> curCars, Scanner scnr) {
		try {
		System.out.println("Please enter the lot number of the car you wish to update:");
		int upCar = scnr.nextInt();
		System.out.println("Updating " + curCars.get(upCar - 1));
		System.out.println("What would you like to update?");
		System.out.println("1 - Make");
		System.out.println("2 - Model");
		System.out.println("3 - Color");
		System.out.println("4 - Year");
		System.out.println("5 - Mileage");
		
		int upOp = scnr.nextInt();
		
			switch (upOp) {
			case 1:
				Automobile aCar = curCars.get(upCar -1);
				System.out.println("Enter new make:");
				aCar.setMake(scnr.next());
				System.out.println("Done");	
			}
		}
		catch (Exception e) {System.out.println(e);}
		
	}

	private static void printInventory() {
		// TODO Auto-generated method stub
		
	}

	private static void removeCar(ArrayList<Automobile> curCars, Scanner scnr) {
		try {
		System.out.println("Enter Car lotnum:");
		int reCar = scnr.nextInt();
		curCars.remove(reCar -1);
		System.out.println("Removed lot num " + reCar);
		}
		catch (Exception e) {System.out.println(e);}
	}

	public static void addCar(ArrayList<Automobile> curCars, Scanner scnr) {
		try {
		System.out.println("Please enter new car as prompted:");
		scnr.nextLine();
		System.out.println("Make:");
		String make = scnr.nextLine();
		System.out.println("Model:");
		String model = scnr.nextLine();
		System.out.println("Color:");
		String color = scnr.nextLine();
		System.out.println("Year:");
		int year = scnr.nextInt();
		System.out.println("Mileage");
		int mileage = scnr.nextInt();
		int lotnum = (curCars.size() + 1);
		
		Automobile aCar = new Automobile(make, model, color, year, mileage, lotnum);
		curCars.add(aCar);
		System.out.println("Success." + aCar + "added.");
		}
		catch (Exception e) {System.out.println("Could not add car:");
							 System.out.println(e);} 

	}
		
				
}
