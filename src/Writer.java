import java.io.IOException;
import java.io.PrintWriter;

public class Writer {

    private Car[] cars;
    public Writer(Car[] cars) {
        this.cars = cars;
    }

    public void printToFile() {
        for (int i = 0; i < cars.length; i++) {
            try {
                PrintWriter writer = new PrintWriter("b_output.txt", "UTF-8");
                writer.println(cars[i]); //cars[i].getM();
                writer.println("The second line"); // for loop cars[i].getRides[j].getID();
                writer.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
