package JavaActivity1_1;

public class Activity1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car honda = new Car();
		honda.make = 2014;
		honda.color = "Black";
		honda.transmission = "Manual";
		honda.displayCharacterstics();
		honda.accelerate();
		honda.brake();
	}

}
