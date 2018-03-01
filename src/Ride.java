class Ride {

    private int[] start;
    private int[] end;

    Ride(int[] starts, int[] ends){

        this.start = starts;
        this.end = ends;
    }

    public int[] getStart() {
        return start;
    }

    public int[] getEnd() {
        return end;
    }
}
