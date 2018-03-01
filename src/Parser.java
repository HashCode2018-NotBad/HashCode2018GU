import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Parser {

    private int rows;
    private int columns;
    private int numberOfVehicles;
    private int numberOfRides;
    private int bonus;
    private int numberOfSteps;
    private Ride[] rides;

    public Parser() {
        this.rows = 0;
        this.columns = 0;
        this.numberOfVehicles = 0;
        this.numberOfRides = 0;
        this.bonus = 0;
        this.numberOfSteps = 0;
    }

    public void parseLines() {
        String fileName = "./a_example.in";
        int counter = 0;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            String firstLine = scanner.nextLine();
            System.out.println(firstLine);
            for (int i = 0; i < 6; i++) {
                if (i == 0) {
                    System.out.println(firstLine);
                    while (firstLine.charAt(counter) != ' ') {
                        counter++;
                    }
                    rows = Integer.parseInt(firstLine.substring(0, counter));
                    firstLine = firstLine.substring(counter + 1, firstLine.length());
                    counter = 0;
                }
                else if (i == 1) {
                    System.out.println(firstLine);
                    while (firstLine.charAt(counter) != ' ') {
                        counter++;
                    }
                    //System.out.println(firstLine.substring(0, counter));
                    columns = Integer.parseInt(firstLine.substring(0, counter));
                    firstLine = firstLine.substring(counter + 1, firstLine.length());
                    counter = 0;
                }
                else if (i == 2) {
                    System.out.println(firstLine);
                    while (firstLine.charAt(counter) != ' ') {
                        counter++;
                    }
                    System.out.println(firstLine.substring(0, counter));
                    numberOfVehicles = Integer.parseInt(firstLine.substring(0, counter));
                    firstLine = firstLine.substring(counter + 1, firstLine.length());
                    counter = 0;
                }
                else if (i == 3) {
                    System.out.println(firstLine);
                    while (firstLine.charAt(counter) != ' ') {
                        counter++;
                    }
                    System.out.println(firstLine.substring(0, counter));
                    numberOfRides = Integer.parseInt(firstLine.substring(0, counter));
                    firstLine = firstLine.substring(counter + 1, firstLine.length());
                    counter = 0;
                }
                else if (i == 4) {
                    System.out.println("counter = " + counter);
                    System.out.println(firstLine);
                    while (firstLine.charAt(counter) != ' ') {
                        counter++;
                        System.out.println("counter++");
                    }
                    System.out.println(firstLine.substring(0, counter));
                    bonus = Integer.parseInt(firstLine.substring(0, counter));
                    firstLine = firstLine.substring(counter + 1, firstLine.length());
                    counter = 0;
                }
                else if (i == 5) {
                    System.out.println(firstLine);
                    System.out.println(firstLine.substring(0, firstLine.length()));
                    numberOfSteps = Integer.parseInt(firstLine.substring(0, firstLine.length()));
                    counter = 0;
                }
            }

            //Going through all rides now
            rides = new Ride[numberOfRides];
            int rideIndex = 0;
            int rowStart;
            int colStart;
            int rowEnd;
            int colEnd;
            int earliestStart;
            int latestFinish;
            while (scanner.hasNext()) {
                String rideLine = scanner.nextLine();
                int counterRide = 0;
                System.out.println(rideLine);

                //Row start retrieve val
                while (rideLine.charAt(counterRide) != ' ') {
                    counterRide++;
                }
                rowStart = Integer.parseInt(rideLine.substring(0, counterRide));
                rideLine = rideLine.substring(counterRide + 1, rideLine.length());
                counterRide = 0;

                //Column start retrieve val
                while (rideLine.charAt(counterRide) != ' ') {
                    counterRide++;
                }
                colStart = Integer.parseInt(rideLine.substring(0, counterRide));
                rideLine = rideLine.substring(counterRide + 1, rideLine.length());
                counterRide = 0;

                //Row end retrieve val
                while (rideLine.charAt(counterRide) != ' ') {
                    counterRide++;
                }
                rowEnd = Integer.parseInt(rideLine.substring(0, counterRide));
                rideLine = rideLine.substring(counterRide + 1, rideLine.length());
                counterRide = 0;

                //Column end retrieve val
                while (rideLine.charAt(counterRide) != ' ') {
                    counterRide++;
                }
                colEnd = Integer.parseInt(rideLine.substring(0, counterRide));
                rideLine = rideLine.substring(counterRide + 1, rideLine.length());
                counterRide = 0;

                //Earliest start retrieve val
                while (rideLine.charAt(counterRide) != ' ') {
                    counterRide++;
                }
                earliestStart = Integer.parseInt(rideLine.substring(0, counterRide));
                rideLine = rideLine.substring(counterRide + 1, rideLine.length());

                latestFinish =  Integer.parseInt(rideLine.substring(0, rideLine.length()));

                rides[rideIndex] = new Ride(new int[] {rowStart, colStart}, new int[] {rowEnd, colEnd}, earliestStart,
                        latestFinish);
                rideIndex++;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getRows() {
        return this.rows;
    }

    public int getColumns() {
        return this.columns;
    }

    public int getNumberOfVehicles() {
        return numberOfVehicles;
    }

    public int getNumberOfRides() {
        return numberOfRides;
    }

    public int getBonus() {
        return bonus;
    }

    public int getNumberOfSteps() {
        return numberOfSteps;
    }
}