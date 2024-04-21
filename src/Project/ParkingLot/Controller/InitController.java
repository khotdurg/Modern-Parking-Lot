package Project.ParkingLot.Controller;

import Project.ParkingLot.Model.ParkingLot;
import Project.ParkingLot.Service.InitialisationService;

//init controller based on initialisation service
public class InitController {
    private InitialisationService initialisationService;

    public InitController(InitialisationService initialisationService) {
        this.initialisationService = initialisationService;
    }

    public ParkingLot init(){
       return initialisationService.init();

    }
}
