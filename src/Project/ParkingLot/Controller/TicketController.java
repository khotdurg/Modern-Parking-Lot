package Project.ParkingLot.Controller;

import Project.ParkingLot.Exception.InvalidRequestException;
import Project.ParkingLot.Model.Ticket;
import Project.ParkingLot.Model.Vehicle;
import Project.ParkingLot.Service.TicketService;

// main concern is to generate the tickets
// controller talk to service
public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

// Generating the tickets based on vehicles come up
    public Ticket generateTicket(Vehicle vehicle, int gateId, int parkingLotId){
        //validate the data
        if(gateId <=0 || parkingLotId <=0){
            throw new InvalidRequestException("Please enter valid requests");
        }
        return ticketService.generateTicket(vehicle, gateId, parkingLotId);
    }
}
