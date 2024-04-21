package Project.ParkingLot;

import Project.ParkingLot.Controller.InitController;
import Project.ParkingLot.Controller.TicketController;
import Project.ParkingLot.Model.Enum.VehicleType;
import Project.ParkingLot.Model.ParkingLot;
import Project.ParkingLot.Model.Ticket;
import Project.ParkingLot.Model.Vehicle;
import Project.ParkingLot.Repository.*;
import Project.ParkingLot.Service.InitialisationService;
import Project.ParkingLot.Service.TicketService;

import java.util.Scanner;

public class MainParkingLot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // dependency injection started bcoz we are passing data
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
        GateRepository gateRepository = new GateRepository();
        TicketRepository ticketRepository = new TicketRepository();

        InitialisationService initialisationService = new InitialisationService(
                gateRepository,
                parkingLotRepository,
                parkingFloorRepository,
                parkingSpotRepository
        );

        TicketService ticketService = new TicketService(
                ticketRepository,
                parkingLotRepository,
                gateRepository,
                parkingSpotRepository
        );

        TicketController ticketController = new TicketController(ticketService);
        InitController initController = new InitController(initialisationService);
        System.out.println("***PARKING LOT DATA INITIALISATION - START");
        ParkingLot parkingLot = initController.init();; //DATA INITIALISATION
        System.out.println("***PARKING LOT DATA INITIALISATION - END");
        //dependency injection end
        System.out.println("Please enter an option -> 1. Enter parking Lot, 2. Exit Parking Lot");

        int option = scn.nextInt();
        while (true){
            if(option == 1){
                Vehicle vehicle = new Vehicle();
                System.out.println("Welcome to our parking lot");
                System.out.println("Please enter the vehicle details");
                System.out.println("Please enter the vehicle number");
                String number = scn.next();
                vehicle.setVehicleNumber(number);
                System.out.println("Please enter vehicle color");
                String color = scn.next();
                vehicle.setColor(color);
                System.out.println("Please choose the vehicle type -> 1. Car and 2. Bike");
                int vehicleType = scn.nextInt();
                if(vehicleType == 1){
                    vehicle.setVehicleType(VehicleType.FOUR_WHEELER);
                }else {
                    vehicle.setVehicleType(VehicleType.TWO_WHEELER);
                }
                System.out.println("Please enter the parkingLot ID");
                int parkingLotId = scn.nextInt();
                System.out.println("Please enter gate ID");
                int gateId = scn.nextInt();
                Ticket ticket = ticketController.generateTicket(vehicle, gateId, parkingLotId);
                System.out.println("Ticket details :" + ticket);
            }
            else if (option == 2) {

            } else {
                System.out.println("THANKS");
                break;
            }
        }


    }
}
