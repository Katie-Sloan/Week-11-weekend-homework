public enum PlaneType {

    BOEING747(5, 100);

    private final int passengerCapacity;
    private final int totalWeight;

    PlaneType(int passengerCapacity, int totalWeight) {
        this.passengerCapacity = passengerCapacity;
        this.totalWeight = totalWeight;
    }

    public int getPassengerCapacity(){
        return this.passengerCapacity;
    }

    public int getTotalWeight(){
        return this.totalWeight;
    }

}
