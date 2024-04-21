package Project.ParkingLot.Service;

import Project.ParkingLot.Model.Enum.ParkingSpotStatus;
import Project.ParkingLot.Model.ParkingLot;
import Project.ParkingLot.Model.ParkingSpot;
import Project.ParkingLot.Model.Ticket;
import Project.ParkingLot.Model.Vehicle;
import Project.ParkingLot.Repository.GateRepository;
import Project.ParkingLot.Repository.ParkingLotRepository;
import Project.ParkingLot.Repository.ParkingSpotRepository;
import Project.ParkingLot.Repository.TicketRepository;
import Project.ParkingLot.Service.Strategy.SpotAllocationStrategy.SpotAllocationStrategy;
import Project.ParkingLot.Service.Strategy.SpotAllocationStrategy.SpotAllocationStrategyFactory;

import java.time.LocalDateTime;

// Service is talk to repository
public class TicketService {
    private TicketRepository ticketRepository;
    //to fetch the parking lot object we need to used ParkingLotRepo as well
    private ParkingLotRepository parkingLotRepository;
    private GateRepository gateRepository;
    private ParkingSpotRepository parkingSpotRepository;

    public TicketService(TicketRepository ticketRepository, ParkingLotRepository parkingLotRepository, GateRepository gateRepository, ParkingSpotRepository parkingSpotRepository) {
        this.ticketRepository = ticketRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.gateRepository = gateRepository;
        this.parkingSpotRepository = parkingSpotRepository;
    }

        // select the spot
    public Ticket generateTicket(Vehicle vehicle, int gateId, int parkingLotId){
        SpotAllocationStrategy strategy = SpotAllocationStrategyFactory.getSpotAllocationStrategy();
        //these are come from SpotAllocationStrategy
        ParkingLot parkingLot = parkingLotRepository.get(parkingLotId);
        ParkingSpot allocatedSpot = strategy.getSpotForVehicle(parkingLot, vehicle);
        allocatedSpot.setParkingSpotStatus(ParkingSpotStatus.OCCUPIED);
        allocatedSpot.setVehicle(vehicle);
        parkingSpotRepository.put(allocatedSpot);

        // after selecting the spot get the ticket
        Ticket ticket = new Ticket();
        ticket.setEntryTime(LocalDateTime.now());
        ticket.setVehicle(vehicle);
        ticket.setParkingSpot(allocatedSpot);
        ticket.setEntryGate(gateRepository.get(gateId));
        return ticketRepository.put(ticket);
    }
}
