class Car {

    private int[] nextDestination;
    private int[] calculateDistance;
    private int[] currentPos;
    private int m;

    Car(int[] next, int[] calculate, int m1, int[] currentPosition){
        this.calculateDistance = calculate;
        this.nextDestination = next;
        this.m = m1;
        this.currentPos = currentPosition;
    }
    public void driveTowards(Ride ride){

    }
    public int getM() {
        return m;
    }
}
