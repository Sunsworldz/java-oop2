package WCS;

public class Hangar {

	public static void main(String[] args) {
		Car voiture1 = new Car ("opel",125000);
		Car voiture2 = new Car ("ford",114000);
		
		Boat bateaux1 = new Boat ("pole",45);
		Boat bateaux2 = new Boat ("rex",489);
		
		System.out.println(voiture1.doStuff());
		System.out.println(voiture2.doStuff());
		System.out.println(bateaux1.doStuff());
		System.out.println(bateaux2.doStuff());
	}
}
