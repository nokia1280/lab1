import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("E:\\COS30019\\lab1\\src\\text.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");

            String fromCity = tokens[0];
            String toCity = tokens[1];
            int actualDistance = Integer.parseInt(tokens[2]);
            int straightDistance = Integer.parseInt(tokens[3]);

            Route route = new Route(fromCity, toCity, actualDistance, straightDistance);

            System.out.println(route);
        }
    }
}