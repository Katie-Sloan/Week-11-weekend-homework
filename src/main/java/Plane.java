public class Plane {

    private PlaneType type;

    public Plane(PlaneType type) {
        this.type = type;
    }

    public PlaneType getType() {
        return this.type;
    }

    public int getPassengerCapacity() {
        return this.type.getPassengerCapacity();
    }

    public int getTotalWeight() {
        return this.type.getTotalWeight();
    }
}
