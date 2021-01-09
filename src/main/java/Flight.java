import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private String flightNumber;
//    private Plane plane;

    public Flight(String flightNumber) {
        this.passengers = new ArrayList<Passenger>();
        this.flightNumber = flightNumber;
//        this.plane = new Plane(null);
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

//    public Plane getPlane() {
//        return this.plane;
//    }




}
