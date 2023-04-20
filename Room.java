public class Room {
	private String hotelAddress;
    private String roomNumber;
    private String category;
    private boolean allowsChildren;
    private boolean allowsPets;
    private double price;

    public Room(String hotelAddress, String roomNumber, String category, boolean allowsChildren, boolean allowsPets, double price) {
        this.roomNumber = roomNumber;
        this.hotelAddress = hotelAddress;
        this.category = category;
        this.allowsChildren = allowsChildren;
        this.allowsPets = allowsPets;
        this.price = price;
    }

    public void changePetPolicy(boolean allowsPets) {
        this.allowsPets = allowsPets;
    }
}