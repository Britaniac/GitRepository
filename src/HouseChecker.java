
public class HouseChecker {
	public static boolean checkRooms(House house, int rooms) {
		if (house.getRoomNumber() == rooms) {
			return true;
		} else {return false;}
	}
	
	public static boolean checkFloor(House house, int floor) {
		if (house.getFloor() == floor) {
			return true;
		} else {return false;}
	}
		
	public static boolean checkFloor(House house, int fl1, int fl2) {
		if (house.getFloor() >= fl1 && house.getFloor() <= fl2) {
			return true;
		} else {return false;}
	}
	
	public static boolean checkArea(House house, double area) {
		if (house.getArea() >= area) {
			return true;
		} else {return false;}
	}
}
