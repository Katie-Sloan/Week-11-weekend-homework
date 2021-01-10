public class FlightManager {

    private Plane plane;

    public FlightManager(Plane plane){
        this.plane = plane;
    }

    public int calculateBaggageWeightPerPassenger() {
        return plane.getTotalWeight() / 2 / plane.getPassengerCapacity();
    }

}

