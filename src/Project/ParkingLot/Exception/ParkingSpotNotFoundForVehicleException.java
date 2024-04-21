package Project.ParkingLot.Exception;

public class ParkingSpotNotFoundForVehicleException extends RuntimeException{
    public ParkingSpotNotFoundForVehicleException() {
    }

    public ParkingSpotNotFoundForVehicleException(String message) {
        super(message);
    }
}
