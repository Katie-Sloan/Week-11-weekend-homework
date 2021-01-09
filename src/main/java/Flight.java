import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private String flightNumber;
    private String destination;
//    private Plane plane;

    public Flight(String flightNumber, String destination) {
        this.passengers = new ArrayList<Passenger>();
        this.flightNumber = flightNumber;
        this.destination = destination;
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

//    public Plane getPlane() {
//        return this.plane;
//    }




}
