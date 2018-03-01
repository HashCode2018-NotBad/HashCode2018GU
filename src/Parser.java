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
        int counter = 0;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            String firstLine = scanner.nextLine();
            System.out.println(firstLine);
            for (int i = 0; i < 6;) {
                if (i == 0) {
                    System.out.println(firstLine);
                    while (firstLine.charAt(counter) != ' ') {
                        counter++;
                    }
                    //System.out.println(firstLine.substring(0, counter));
                    rows = Integer.parseInt(firstLine.substring(0, counter));
                    firstLine = firstLine.substring(counter + 1, firstLine.length());
                    counter = 0;
                    i++;
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
                    i++;
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
                    i++;
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
                    i++;
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
                    i++;
                }
                else if (i == 5) {
                    System.out.println(firstLine);
                    System.out.println(firstLine.substring(0, firstLine.length()));
                    numberOfSteps = Integer.parseInt(firstLine.substring(0, firstLine.length()));
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