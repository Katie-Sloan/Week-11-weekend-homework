import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class Flight {

    private ArrayList<Passenger> passengers;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private LocalDateTime departureTime;
    private Plane plane;

    public Flight(String flightNumber, String destination, String departureAirport, LocalDateTime departureTime, Plane plane) {
        this.passengers = new ArrayList<Passenger>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.plane = plane;
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

    public String getDepartureTime() {
        LocalDate justDate = this.departureTime.toLocalDate();
        LocalTime justTime = this.departureTime.toLocalTime();
        return ("Date: " + justDate + " Time: " + justTime);
    }

    public Plane getPlane() {
        return plane;
    }

    public int returnAvailableSeats() {
        return plane.getPassengerCapacity() - this.passengerCount();
    }

    public void bookPassenger(Passenger passenger) {
        if (this.returnAvailableSeats() >= 1) {
            this.passengers.add(passenger);
        }
    }

    public int totalBagsCount() {
        int totalBags = 0;
        for (Passenger passenger: this.passengers) {
            totalBags += passenger.bagCount();
        }
        return totalBags;
    }

    public int calculateTotalWeight() {
        return totalBagsCount() * 10;
    }

    public int calculateBaggageWeightPerPassenger() {
        return plane.getTotalWeight() / 2 / plane.getPassengerCapacity();
    }
}
