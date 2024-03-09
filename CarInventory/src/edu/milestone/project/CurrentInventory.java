package edu.milestone.project;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;


public class CurrentInventory {
	    
	public static void main(String[] args) throws IOException {
		
		Scanner scnr = new Scanner(System.in);
		ArrayList<Automobile> curCars = new ArrayList<Automobile>();
		
		Automobile autoMobile = new Automobile("Honda", "CRV", "White", 2015, 34255, 1);
		curCars.add(autoMobile);
		
		int menuOption;
		int i;
		i = 0;
		
		FileOutputStream fileOut = null;
	    PrintWriter outPut = null;

	     
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
							printInventory(curCars, fileOut, outPut, scnr);
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
		for(int i = 0; i < curCars.size(); i++) {
			System.out.println(curCars.get(i));
		}
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
		Automobile aCar = curCars.get(upCar -1);
		int upOp = scnr.nextInt();
		
			switch (upOp) {
			
			case 1:
				System.out.println("Enter new make:");
				aCar.setMake(scnr.next());
				System.out.println("Done");	
				break;
			case 2:
				System.out.println("Enter new model:");
				aCar.setModel(scnr.next());
				System.out.println("Done");	
				break;
			case 3:
				System.out.println("Enter new color:");
				aCar.setColor(scnr.next());
				System.out.println("Done");	
				break;
			case 4:
				System.out.println("Enter new year:");
				aCar.setYear(scnr.nextInt());
				System.out.println("Done");	
				break;
			case 5:
				System.out.println("Enter new mileage:");
				aCar.setMileage(scnr.nextInt());
				System.out.println("Done");	
				break;
		}
			
		}
		catch (Exception e) {System.out.println(e);}
		
	}

	private static void printInventory(ArrayList<Automobile> curCars, FileOutputStream fileOut, PrintWriter outPut, Scanner scnr) {
		try {
			System.out.println("Do you want to print the inventory? Y or N?");
			char priOpt = scnr.next().charAt(0);
			if (priOpt == 'Y') {
			fileOut = new FileOutputStream("/Users/krist/Documents/InvList.txt");
			outPut = new PrintWriter(fileOut);
			outPut.print(curCars);
			System.out.println("Success!");
			outPut.close();
			} 
			else {
				System.out.println("File not printing. Thank you for using this program. Now closing.");
			}
		}
		catch (IOException ex) { System.out.println("Unable to save file");}
		}

	private static void removeCar(ArrayList<Automobile> curCars, Scanner scnr) {
		try {
		System.out.println("Enter Car lotnum:");
		int reCar = scnr.nextInt();
		curCars.remove(reCar -1);
		System.out.println("Removed lot num " + reCar);
		System.out.print("Current inventorty:" + curCars);
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
