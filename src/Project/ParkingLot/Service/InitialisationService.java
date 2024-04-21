package Project.ParkingLot.Service;

import Project.ParkingLot.Model.Enum.*;
import Project.ParkingLot.Model.Gate;
import Project.ParkingLot.Model.ParkingFloor;
import Project.ParkingLot.Model.ParkingLot;
import Project.ParkingLot.Model.ParkingSpot;
import Project.ParkingLot.Repository.GateRepository;
import Project.ParkingLot.Repository.ParkingFloorRepository;
import Project.ParkingLot.Repository.ParkingLotRepository;
import Project.ParkingLot.Repository.ParkingSpotRepository;

import java.util.ArrayList;
import java.util.List;

// once repository layer done service come to the picture
// will create 1 method, this method will build be entire data set to work with
// anytime will restart our code our data set is ready
//whole things will store in repository

public class InitialisationService {

    // in order to save the data we need repository class
    private GateRepository gateRepository;
    private ParkingLotRepository parkingLotRepository;
    private ParkingFloorRepository parkingFloorRepository;
    private ParkingSpotRepository parkingSpotRepository;

    public InitialisationService(GateRepository gateRepository, ParkingLotRepository parkingLotRepository, ParkingFloorRepository parkingFloorRepository, ParkingSpotRepository parkingSpotRepository) {
        this.gateRepository = gateRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.parkingFloorRepository = parkingFloorRepository;
        this.parkingSpotRepository = parkingSpotRepository;
    }

    public ParkingLot init(){
        System.out.println("*****Starting Initialisation*****");
        //creating parkingLot object
        //1st object
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setName("Khot Parking Services");
        parkingLot.setAddress("Khot Chamber");
        parkingLot.setParkingLotStatus(ParkingLotStatus.OPEN);
        parkingLot.setCapacity(100);
        parkingLot.setVehicleTypesSupported(List.of(VehicleType.TWO_WHEELER, VehicleType.FOUR_WHEELER));

        // floors it has list of floors
        List<ParkingFloor> floors = new ArrayList<>();
        //Running a loot to create 10 parkingFloor object
        for(int i =1; i<=10; i++){
            //creating parking floor object
            ParkingFloor parkingFloor = new ParkingFloor();
            parkingFloor.setId(i);
            parkingFloor.setFloorNumber(i);
            parkingFloor.setParkingFloorStatus(ParkingFloorStatus.AVAILABLE);

            List<ParkingSpot> spots = new ArrayList<>();
            // for each floor creating 10 parking spot objects
            for(int j =1; j<=10; j++){
                ParkingSpot parkingSpot = new ParkingSpot();
                parkingSpot.setId(j);
                parkingSpot.setNumber((i*100)+j); // floor number + j
                parkingSpot.setParkingSpotStatus(ParkingSpotStatus.EMPTY);
                parkingSpot.setVehicleType(VehicleType.FOUR_WHEELER);
                spots.add(parkingSpot);
                parkingSpotRepository.put(parkingSpot);
            }

            parkingFloor.setParkingSpots(spots);
            //Creating entry gate object
            Gate entryGate = new Gate();
            entryGate.setId((i*1000)+1);
            entryGate.setGateNumber(i*100+1);
            entryGate.setGateStatus(GateStatus.OPEN);
            entryGate.setGateType(GateType.ENTRY);
            entryGate.setOperatorName("Operator : " + i+1);
            //save this gate to the floor
            parkingFloor.setEntryGate(entryGate);
            gateRepository.put(entryGate);

            // creating exit gate object
            Gate exitGate = new Gate();
            exitGate.setId((i*1000)+2);
            exitGate.setGateNumber(i*100+2);
            exitGate.setGateStatus(GateStatus.OPEN);
            exitGate.setGateType(GateType.EXIT);
            exitGate.setOperatorName("Operator : " + i+2);
            parkingFloor.setExitGate(exitGate);
            gateRepository.put(exitGate);

            floors.add(parkingFloor); //adding the floor to floor list
            parkingFloorRepository.put(parkingFloor); // saving the floor to repository
        }
        parkingLot.setFloors(floors); // adding floor list to the parking list
        parkingLotRepository.put(parkingLot);
        return parkingLotRepository.get(1);
    }
}
