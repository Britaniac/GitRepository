
public class House {
	int id;
	int houseNumber;
	double area;
	int floor;
	int roomNumber;
	String street;
	int period;
	public House(int id, int houseNumber, double area, int floor, int roomNumber, String street, int period){
		this.id = id;
		this.houseNumber = houseNumber;
		this.area = area;
		this.floor = floor;
		this.roomNumber = roomNumber;
		this.street = street;
		this.period = period;
	}
	
	public String toString() {
		return "House #" + houseNumber + " on " + street;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	
	
	
}
