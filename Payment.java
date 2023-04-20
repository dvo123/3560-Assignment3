import java.util.*;

public interface Payment {
	public abstract void addFlightSeat(FlightSeat flightSeat);
	
	public abstract void addRoom(Room room);
	
	public abstract Date printResDate();
	
	public abstract Date printDueDate();
	
	public abstract double  getTotalPrice();
}
