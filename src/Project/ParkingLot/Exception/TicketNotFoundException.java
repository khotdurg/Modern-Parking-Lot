package Project.ParkingLot.Exception;

public class TicketNotFoundException extends RuntimeException{
    public TicketNotFoundException() {

    }

    public TicketNotFoundException(String message) {
        super(message);
    }
}
