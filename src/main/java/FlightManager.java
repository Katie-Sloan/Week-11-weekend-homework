import java.util.ArrayList;

public class FlightManager {

    private ArrayList<Plane> planes;
    private ArrayList<Flight> flights;

    public FlightManager(){
        this.planes = new ArrayList<Plane>();
        this.flights = new ArrayList<Flight>();
    }

    public int calculateBaggageWeightEach(String flightNumber) {
        Flight foundFlight = findFlight(flightNumber);
        return foundFlight.calculateBaggageWeightPerPassenger();
//        return plane.getTotalWeight() / 2 / plane.getPassengerCapacity();
    }
//
//    public int calculateTotalBaggageWeightBooked() {
//        return flight.totalBagsCount();
//
//    }

    public Flight findFlight(String flightNumber) {
        Flight foundFlight = null;
        for (Flight flight : this.flights) {
            if (flight.getFlightNumber() == flightNumber) {
                foundFlight = flight;
            }
        }
        return foundFlight;
    }

    public int flightCount() {
        return this.flights.size();
    }

    public void addFlight(Flight flight1) {
        this.flights.add(flight1);
    }
}

