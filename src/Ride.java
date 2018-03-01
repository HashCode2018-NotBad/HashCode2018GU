class Ride {

    private int[] start;
    private int[] end;
    private int earliestStart;
    private int latestFinish;

    Ride(int[] starts, int[] ends, int earliestStart, int latestFinish){

        this.start = starts;
        this.end = ends;
        this.earliestStart = earliestStart;
        this.latestFinish = latestFinish;
    }
}
