import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private String flightNumber;
    private String destination;
    private String departureAirport;
//    private Plane plane;

    public Flight(String flightNumber, String destination, String departureAirport) {
        this.passengers = new ArrayList<Passenger>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
//        this.plane = new Plane(null);
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

//    public Plane getPlane() {
//        return this.plane;
//    }




}
