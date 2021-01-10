public class FlightManager {

    private Plane plane;
    private Flight flight;

    public FlightManager(Plane plane, Flight flight){
        this.plane = plane;
        this.flight = flight;
    }

    public int calculateBaggageWeightPerPassenger() {
        return plane.getTotalWeight() / 2 / plane.getPassengerCapacity();
    }

//    public int calculateTotalBaggageWeightBooked() {
//
//
//    }
}

