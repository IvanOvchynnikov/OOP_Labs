import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The Main class reads input values from a file, performs calculations,
 * and writes the result to an output file.
 */
public class Main {

    /**
     * Reads a double value from the given Scanner.
     *
     * @param scanner The Scanner to read from.
     * @return The double value read.
     */
    public static double scanDouble(Scanner scanner) {
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else {
            System.out.println("The file has incorrect datatype of values");
            System.exit(0);
        }
        return 0;
    }

    /**
     * Reads an integer value from the given Scanner.
     *
     * @param scanner The Scanner to read from.
     * @return The integer value read.
     */
    public static int scanInt(Scanner scanner) {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("The file has incorrect datatype of values");
            System.exit(0);
        }
        return 0;
    }

    /**
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        File file = new File("input.txt");
        try {
            Scanner scanner = new Scanner(file);
            double x = scanDouble(scanner);
            double y = scanDouble(scanner);
            int z = scanInt(scanner);
            y /= 100;
            z /= 12;
            double ans = x * Math.pow((1 + y), z);

            try {
                FileWriter answer = new FileWriter("answer.txt", true);
                answer.write("Your profit is: " + (ans - x));
                answer.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Input mismatch. Check data types in the file.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
