import java.util.Date;

public class Flight {
    private String flightNumber;
    private String airline;
    private Date travelDate;
    private String route;

    public Flight(String flightNumber, String airline, Date travelDate, String route) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.travelDate = travelDate;
        this.route = route;
    }
}