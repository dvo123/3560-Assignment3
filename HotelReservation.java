import java.util.Date;

public class HotelReservation extends Reservation {
    private Room room;
    private Room address;

    public HotelReservation(String reservationCode, Date reservationDate, double totalCost) {
        super(reservationCode, reservationDate, totalCost);
    }

    public void addAddress(Room address) {
    	this.address = address;
    }

    @Override
    public void addRoom(Room room) {
        this.room = room;
    }
}