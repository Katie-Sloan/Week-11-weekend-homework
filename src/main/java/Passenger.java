public class Passenger {

    private String name;
    private int numberOfBags;

    public Passenger(String name) { this.name = name; }

    public String getName() { return name; }

    public int bagCount() {
        return this.numberOfBags;
    }
}
