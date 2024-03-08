package edu.milestone.project;

//class
public class Automobile {
	private String make;
	private String model;
	private String color;
	private int year;
	private int mileage;
	private int lotnum;
		
		//Default
		Automobile () {}
	
		//parameterized
		Automobile(String make, String model, String color, int year, int mileage, int lotnum) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.mileage = mileage;
		this.lotnum = lotnum;
		}
		
		//getters
		public String getMake() {
			return make;
		}
		public String getModel() {
			return model;
		}
		public String getColor() {
			return color;
		}
		public int getYear() {
			return year;
		}
		public int getMileage() {
			return mileage;
		}
		public int getLotNum() {
			return lotnum;
		}

		
		//setters
		public void setMake(String make) {
			this.make = make;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public void setColor(String color) {
			 this.color = color;
		} 
		public void setYear(int year) {
			this.year = year;
		}
		public void setMileage(int mileage) {
			this.mileage = mileage;
		}
		
		//convert to string
		 @Override
		   public String toString() {
		        return ("Make:" + getMake()+
		               " Model: " + getModel() +
		               " Year: "+ getYear() +
		               " Lot Num: " + getLotNum() +
		               " Mileage: " + getMileage());
		   }
}
		