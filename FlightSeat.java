import java.util.Date;

class FlightSeat {
    private String seatNumber;
    private double fare;
    private String seatClass;
    private boolean financed;
    private Date paymentDueDate;
    private Date paymentReceiptDate;

    public FlightSeat(String seatNumber, double fare, String seatClass, boolean financed) {
        this.seatNumber = seatNumber;
        this.fare = fare;
        this.seatClass = seatClass;
        this.financed = financed;
    }

    public void setPaymentPlan(double amount, int numPayments) {

    }

    public void makePayment(double amount) {

    }
}