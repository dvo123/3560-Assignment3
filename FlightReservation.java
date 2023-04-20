import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlightReservation extends Reservation {
    private List<FlightSeat> flightSeats;
    private List<Flight> flights;

    public FlightReservation(String reservationCode, Date reservationDate, double totalCost) {
        super(reservationCode, reservationDate, totalCost);
        flightSeats = new ArrayList<>();
        flights = new ArrayList<>();
    }

    @Override
    public void addFlightSeat(FlightSeat flightSeat) {
        flightSeats.add(flightSeat);
    }
}