
public class HouseTester {

	public static void main(String[] args) {
		House h1 = new House(1, 1, 30, 1, 2, "Science Street", 25);
		House h2 = new House(2, 21, 35, 2, 2, "23 August Street", 40);
		House h3 = new House(3, 35, 40, 3, 3, "Science Street", 15);
		House h4 = new House(4, 49, 50, 4, 3, "Block Street", 25);
		House h5 = new House(5, 53, 79, 5, 3, "Block Street", 125);
		House h6 = new House(6, 22, 99, 2, 4, "Science Street", 25);
		House[] houses = {h1, h2, h3, h4, h5, h6};
		
		System.out.println("Houses with 3 rooms");
		for (House house : houses) {
			if (HouseChecker.checkRooms(house, 3)) {
				System.out.println(house.toString());
			}
		}
		
		System.out.println("Houses with 2 rooms on floors 2 to 5");
		for (House house : houses) {
			if (HouseChecker.checkRooms(house, 2) && HouseChecker.checkFloor(house, 2, 5)) {
				System.out.println(house.toString());
			}
		}
		
		System.out.println("Houses with area more than 41 square meters");
		for (House house : houses) {
			if (HouseChecker.checkArea(house, 41)) {
				System.out.println(house.toString());
			}
		}
		
	}
	

}
