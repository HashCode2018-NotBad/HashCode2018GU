import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Parser {

    private static City city;
    private static int rows = 0;
    private static int columns = 0;
    private static int numberOfVehicles = 0;

    public Parser() {

    }

    public static void main(String[] args) {

        String fileName = "./a_example.in";
        String s = "";
        int counter = 0;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext()){
                for (int i = 0; i < 6) {
                    if (i == 0) {
                        while (s.charAt(counter) != (' ')) {
                            counter++;
                        }
                        rows = Integer.parseInt(s.substring(0, counter + 1));
                        counter = 0;
                        i++;
                    }
                    if (i == 1) {
                        while (s.charAt(counter) != (' ')) {
                            counter++;
                        }
                        columns = Integer.parseInt(s.substring(0, counter));
                        counter = 0;
                        i++;
                    }
                    if (i == 2) {
                        while (s.charAt(counter) != (' ')) {
                            counter++;
                        }
                        numberOfVehicles = Integer.parseInt(s.substring(0, counter));
                        counter = 0;
                        i++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}