import java.util.*;

public class Reservation implements Payment{
    private String reservationCode;
    private Date reservationDate;
    private Date dueDate;
    private double totalCost;
    private List<FlightSeat> listSeat;
    private List<Room> listRoom;

    public Reservation(String reservationCode, Date reservationDate, double totalCost) {
        this.reservationCode = reservationCode;
        this.reservationDate = reservationDate;
        this.totalCost = totalCost;
    }

    public void addFlightSeat(FlightSeat flightSeat) {
    	listSeat.add(flightSeat);
    }
    
    public void addRoom(Room room) {
    	listRoom.add(room);
    }

    public Date printResDate() {
    	return reservationDate;
    }
    
    public double getTotalPrice() {
    	return totalCost;
    }
    
    public Date printDueDate() {
    	return dueDate;
    }
}




