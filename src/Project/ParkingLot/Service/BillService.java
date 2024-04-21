package Project.ParkingLot.Service;

import Project.ParkingLot.Model.Bill;
import Project.ParkingLot.Service.Strategy.BillCalculationStrategy.BillCalculationStrategy;
import Project.ParkingLot.Service.Strategy.BillCalculationStrategy.BillCalculationStrategyFactory;

public class BillService {
    public Bill generateBill(int ticketId, int exitGateId) {
        BillCalculationStrategy billCalculationStrategy = BillCalculationStrategyFactory.getBill();
        // fetch ticket object from repository
        //double amount = billCalculationStrategy.generateBill(ticket);
        Bill bill = new Bill();
        // add all details required to bill
        // release the spot -> spot details are present inside ticket object
        return  bill;
    }
}