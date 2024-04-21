package Project.ParkingLot.Service.Strategy.SpotAllocationStrategy;

public class SpotAllocationStrategyFactory {

    //TODO : add more spot allocation strategies, with ENUM and implement here
    public static SpotAllocationStrategy getSpotAllocationStrategy(){
        return new LinearSpotAllocationStrategy();
    }
}
