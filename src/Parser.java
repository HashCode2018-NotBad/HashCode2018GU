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
        String s = "";
        int counter = 0;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext()){
                for (int i = 0; i < 6;) {
                    if (i == 0) {
                        while (s.charAt(counter) != (' ')) {
                            counter++;
                        }
                        this.rows = Integer.parseInt(s.substring(0, counter + 1));
                        counter = 0;
                        i++;
                    }
                    else if (i == 1) {
                        while (s.charAt(counter) != (' ')) {
                            counter++;
                        }
                        this.columns = Integer.parseInt(s.substring(0, counter + 1));
                        counter = 0;
                        i++;
                    }
                    else if (i == 2) {
                        while (s.charAt(counter) != (' ')) {
                            counter++;
                        }
                        this.numberOfVehicles = Integer.parseInt(s.substring(0, counter + 1));
                        counter = 0;
                        i++;
                    }
                    else if (i == 3) {
                        while (s.charAt(counter) != (' ')) {
                            counter++;
                        }
                        this.numberOfRides = Integer.parseInt(s.substring(0, counter + 1));
                        counter = 0;
                        i++;
                    }
                    else if (i == 4) {
                        while (s.charAt(counter) != (' ')) {
                            counter++;
                        }
                        this.bonus = Integer.parseInt(s.substring(0, counter + 1));
                        counter = 0;
                        i++;
                    }
                    else if (i == 5) {
                        while (s.charAt(counter) != (' ')) {
                            counter++;
                        }
                        this.numberOfSteps = Integer.parseInt(s.substring(0, counter + 1));
                        counter = 0;
                        i++;
                    }

                }
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