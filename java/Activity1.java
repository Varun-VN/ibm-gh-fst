package fst;

public class Activity1 {

	public static void main(String[] args) {
		Car KIA = new Car();
		KIA.Color = "Red";
		KIA.Make = 2026;
		KIA.Transmission = "Manual";
		
		KIA.displayCharacterstics();
		KIA.accelerate();
		KIA.brake();

	}

}
