package JavaActivity1_3;

public class Activity1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double seconds = 1000000000;

		double EarthSecs= 31557600;
		double MercurySecs = 0.2408467;
		double VenusSecs = 0.61519726;
		double MarsSecs = 1.8808158;
		double JupiterSecs = 11.862615;
		double SaturnSecs = 29.447498;
		double UranusSecs= 84.016846;
		double NeptuneSecs = 164.79132;
		
		System.out.println("Age on Mercury: " + seconds/EarthSecs/MercurySecs);
        System.out.println("Age on Venus: " + seconds/EarthSecs/VenusSecs);
        System.out.println("Age on Earth: " + seconds/EarthSecs);
        System.out.println("Age on Mars: " + seconds/EarthSecs/MarsSecs);
        System.out.println("Age on Jupiter: " + seconds/EarthSecs/JupiterSecs);
        System.out.println("Age on Saturn: " + seconds/EarthSecs/SaturnSecs);
        System.out.println("Age on Uranus: " + seconds/EarthSecs/UranusSecs);
        System.out.println("Age on Neptune: " + seconds/EarthSecs/NeptuneSecs);
	}

}
