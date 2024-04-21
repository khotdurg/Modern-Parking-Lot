package Project.ParkingLot.Exception;

public class GateNotFoundException extends RuntimeException{
    public GateNotFoundException() {
    }

    public GateNotFoundException(String message) {
        super(message);
    }
}
