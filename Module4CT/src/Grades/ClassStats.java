package Grades;



import java.util.Scanner;


public class ClassStats {
		
	public static void main(String [] args) {
		Scanner scnr = new Scanner (System.in);
		
		double numGrades;
		double sumGrades; 
		double averageGrade;
		double enteredGrades;
		double maxGrade;
		double minGrade;

		
		System.out.println("Enter amount of grades you are averaging:");
		
		numGrades = scnr.nextDouble();
		sumGrades = 0;
		averageGrade = 0;
		maxGrade = 0;
		minGrade = 101;
		
		System.out.println("Please enter " + (int)numGrades + " grades.");
		
	
		for (double i=0; i < numGrades; ++i) {
			enteredGrades = scnr.nextDouble();
			sumGrades = sumGrades + enteredGrades;
			
		
			
			if (enteredGrades > maxGrade) {
				maxGrade = enteredGrades;
				
			}
			
			if (enteredGrades < minGrade) {
				minGrade = enteredGrades;
				
			}
			 
			
			
			
		}
		
		
		averageGrade = sumGrades / numGrades;	
		System.out.println("The average grade is: " + averageGrade);
		System.out.println("The max grade is: " + maxGrade);
		System.out.println("The min grade is: " + minGrade);
		

		
		
	}

}