package Project.ParkingLot.Service.Strategy.SpotAllocationStrategy;

import Project.ParkingLot.Model.ParkingLot;
import Project.ParkingLot.Model.ParkingSpot;
import Project.ParkingLot.Model.Vehicle;

public interface SpotAllocationStrategy {
    ParkingSpot getSpotForVehicle(ParkingLot parkingLot, Vehicle vehicle);


}