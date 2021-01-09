import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;

    public Flight() {
        this.passengers = new ArrayList<Passenger>();
    }

    public int passengerCount() {
        return this.passengers.size();
    }
}
