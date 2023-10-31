package Step4;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class ReadFour {
    /**
     * Yes, you can look at the other
     * examples in this lab to build your solution here.
     */
    public static void main(String[] args) {
        try {
            Scanner fileIn = new Scanner(new File("input.txt"));
            double runningTotal = 0.0;

            while (fileIn.hasNextDouble()) {
                    double value = fileIn.nextDouble();
                    runningTotal += value;
                    System.out.println("Running Total: " + runningTotal);
                }
            // Print out a running total of all the
            // values in the input file.
            fileIn.close();
        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}