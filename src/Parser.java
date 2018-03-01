import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Parser {

    private static City city;
    private static Car[] cars;
    private static int rows = 0;
    private static int columns = 0;
    private static int numberOfVehicles = 0;
    private static int numberOfRides = 0;
    private static int bonus = 0;
    private static int numberOfSteps = 0;

    public Parser() {

    }

    public void parseLines() {
        String fileName = "./a_example.in";
        String s = "";
        int counter = 0;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            String firstLine = scanner.nextLine();
            for (int i = 0; i < 6;) {
                if (i == 0) {
                    while (firstLine.charAt(counter) != (' ')) {
                        counter++;
                    }
                    rows = Integer.parseInt(firstLine.substring(0, counter));
                    counter = 0;
                    i++;
                }
                else if (i == 1) {
                    while (firstLine.charAt(counter) != (' ')) {
                        counter++;
                    }
                    columns = Integer.parseInt(firstLine.substring(0, counter));
                    counter = 0;
                    i++;
                }
                else if (i == 2) {
                    while (firstLine.charAt(counter) != (' ')) {
                        counter++;
                    }
                    numberOfVehicles = Integer.parseInt(firstLine.substring(0, counter));
                    counter = 0;
                    i++;
                }
                else if (i == 3) {
                    while (firstLine.charAt(counter) != (' ')) {
                        counter++;
                    }
                    numberOfRides = Integer.parseInt(firstLine.substring(0, counter));
                    counter = 0;
                    i++;
                }
                else if (i == 4) {
                    while (firstLine.charAt(counter) != (' ')) {
                        counter++;
                    }
                    bonus = Integer.parseInt(firstLine.substring(0, counter));
                    counter = 0;
                    i++;
                }
                else if (i == 5) {
                    while (firstLine.charAt(counter) != (' ')) {
                        counter++;
                    }
                    numberOfSteps = Integer.parseInt(firstLine.substring(0, counter));
                    counter = 0;
                    i++;
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}