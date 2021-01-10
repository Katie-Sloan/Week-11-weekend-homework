public class Passenger {

    private String name;
    private int numberOf10KiloBags;

    public Passenger(String name, int numberOf10KiloBags) {
        this.name = name;
        this.numberOf10KiloBags = numberOf10KiloBags;
    }

    public String getName() { return name; }

    public int bagCount() {
        return this.numberOf10KiloBags;
    }
}
