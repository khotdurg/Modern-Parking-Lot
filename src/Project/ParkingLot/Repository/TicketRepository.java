package Project.ParkingLot.Repository;

import Project.ParkingLot.Exception.TicketNotFoundException;
import Project.ParkingLot.Model.Ticket;

import java.util.HashMap;
import java.util.Map;

// we are storing the data/persisting the data without using database
public class TicketRepository {
    private Map<Integer, Ticket> ticketMap; // table
    private static int idCounter = 0; // for ticket id auto generation

    public TicketRepository() {
        this.ticketMap = new HashMap<>();
    }

    public Ticket get(int ticketId){
        Ticket ticket = ticketMap.get(ticketId);
        if(ticket == null){
            throw new TicketNotFoundException("Ticket not found for id : " + ticketId);
        }
        return ticket;
    }

    public Ticket put(Ticket ticket){
        ticket.setId(++idCounter);
        ticketMap.put(ticket.getId(), ticket);
        System.out.println("Ticket has been added successfully");
        return ticketMap.get(idCounter);
    }
}