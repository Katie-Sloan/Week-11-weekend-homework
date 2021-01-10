import java.util.ArrayList;

public class FlightManager {

    private ArrayList<Flight> flights;

    public FlightManager(){
        this.flights = new ArrayList<Flight>();
    }

    public int flightCount() {
        return this.flights.size();
    }

    public void addFlight(Flight flight1) {
        this.flights.add(flight1);
    }

    public Flight findFlight(String flightNumber) {
        Flight foundFlight = null;
        for (Flight flight : this.flights) {
            if (flight.getFlightNumber() == flightNumber) {
                foundFlight = flight;
            }
        }
        return foundFlight;
    }

    public int calculateBaggageWeightEach(String flightNumber) {
        Flight foundFlight = findFlight(flightNumber);
        return foundFlight.calculateBaggageWeightPerPassenger();
    }

    public int calculateTotalBaggageWeightBooked(String flightNumber) {
        Flight foundFlight = findFlight(flightNumber);
        return foundFlight.calculateTotalWeight();
    }

    public int calculateOverallBaggageWeightRemaining(String flightNumber) {
        Flight foundFlight = findFlight(flightNumber);
        Plane foundPlane = foundFlight.getPlane();
        int initialBaggageWeightAvailable = foundPlane.getTotalWeight() / 2;
        return initialBaggageWeightAvailable - calculateTotalBaggageWeightBooked(flightNumber);
    }
}

