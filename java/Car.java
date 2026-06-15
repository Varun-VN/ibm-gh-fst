package fst;

public class Car {
	public String Color = "Black";
	public String Transmission = "Manual";
	public Integer Make = 2014;
	public Integer Tyres;
	public Integer Doors;
	
	Car(){
		Tyres = 4;
		Doors = 4;
	}
	
	 public void displayCharacterstics(){
			System.out.println("Color of the Car: " + Color);
			System.out.println("Make of the Car: " + Make);
			System.out.println("Transmission of the Car: " + Transmission);
			System.out.println("Number of tyres on the car: " + Tyres);
		    System.out.println("Number of doors on the car: " + Doors);
		    }

		    public void accelerate() {
			System.out.println("Car is moving forward.");
		    }
			
		    public void brake() {
			System.out.println("Car has stopped.");
		    }
	
}
