import java.util.Scanner;

/**
 * It allows users to interact with the Bankomat object by adding or changing banknote values
 * and printing the values in the ATM.
 */
public class Main {

    /**
     * The main method creates a Bankomat object and provides a user interface for interacting with it.
     * Users can add or change banknote values and quantities, print the values in the ATM, or end the program.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat(); // Create a new Bankomat object
        Scanner scanner = new Scanner(System.in);

        // Main program loop
        while (true) {
            // Display menu options
            System.out.println("Write down 1 to add or change banknote value");
            System.out.println("Write down 2 to print the values in ATM");
            System.out.println("Write down -1 to end the program");

            // Get user input
            int userInput = scanner.nextInt();

            // Perform actions based on user input
            if (userInput != 1 && userInput != 2 && userInput != -1) {
                System.out.println("Write down the correct value again");
            } else if (userInput == 1) {
                // Adding or changing banknote values
                while (true) {
                    System.out.println("Write down the value of banknote and quantity to add");
                    int value = scanner.nextInt();
                    int quantity = scanner.nextInt();

                    // Validate user input for value and handle exceptions
                    if (value <= 0) {
                        System.out.println("Write down the correct value again");
                    } else {
                        try {
                            bankomat.addBanknote(value, quantity);
                            break;
                        } catch (Exception e) {
                            System.out.println("Enter a correct quantity");
                        }
                    }
                }
            } else if (userInput == 2) {
                // Print the values in the ATM
                bankomat.showValues();
            } else {
                // End the program
                break;
            }
        }
    }
}
