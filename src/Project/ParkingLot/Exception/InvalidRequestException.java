package Project.ParkingLot.Exception;

public class InvalidRequestException extends RuntimeException{
    public InvalidRequestException() {
    }

    public InvalidRequestException(String message) {
        super(message);
    }
}
