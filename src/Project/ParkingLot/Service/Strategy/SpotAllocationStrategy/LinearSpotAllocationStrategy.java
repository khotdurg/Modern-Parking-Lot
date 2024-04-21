package Project.ParkingLot.Service.Strategy.SpotAllocationStrategy;

import Project.ParkingLot.Exception.ParkingSpotNotFoundForVehicleException;
import Project.ParkingLot.Model.Enum.ParkingSpotStatus;
import Project.ParkingLot.Model.ParkingFloor;
import Project.ParkingLot.Model.ParkingLot;
import Project.ParkingLot.Model.ParkingSpot;
import Project.ParkingLot.Model.Vehicle;

import java.util.List;

public class LinearSpotAllocationStrategy implements SpotAllocationStrategy{

    @Override
    public ParkingSpot getSpotForVehicle(ParkingLot parkingLot, Vehicle vehicle) {
        List<ParkingFloor> parkingFloors = parkingLot.getFloors();
        //TODO : add the required validations
        for(ParkingFloor parkingFloor : parkingFloors){
            for(ParkingSpot parkingSpot : parkingFloor.getParkingSpots()){
                if(parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.EMPTY) &&
                        parkingSpot.getVehicleType().equals(vehicle.getVehicleType())
                ){
                    return parkingSpot;
                }
            }
        }
        throw new ParkingSpotNotFoundForVehicleException("Please go home, eat and sleep");
    }
}
