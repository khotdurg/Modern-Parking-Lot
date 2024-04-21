package Project.ParkingLot.Service.Strategy.BillCalculationStrategy;

import Project.ParkingLot.Model.Bill;
import Project.ParkingLot.Model.Ticket;

public interface BillCalculationStrategy {
    Bill generateBill(Ticket ticket);
}
