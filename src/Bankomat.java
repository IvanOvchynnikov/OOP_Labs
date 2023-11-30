import java.util.HashMap;
import java.util.Map;
/**
 * The Bankomat class represents a simple model of an ATM (Automated Teller Machine).
 * It maintains information about the denominations of banknotes and their quantities.
 */
public class Bankomat {

    // Map to store the denominations of banknotes and their quantities
    private Map<Integer, Integer> banknotes;

    /**
     * Constructs a new ATM object with an empty banknotes map.
     */
    public Bankomat() {
        banknotes = new HashMap<>();
    }

    /**
     * Adds or removes a specified quantity of banknotes of a given denomination.
     *
     * @param value    The denomination of the banknote.
     * @param quantity The quantity of banknotes to add (positive) or remove (negative).
     * @throws Exception If the resulting quantity is negative, indicating an invalid operation.
     */
    public void addBanknote(int value, int quantity) throws Exception {
        int currentQuantity = 0;

        // Check if the denomination already exists in the banknotes map
        if (banknotes.containsKey(value)) {
            currentQuantity = banknotes.get(value);
        }

        // Check if the resulting quantity after the operation is non-negative
        if (quantity + currentQuantity < 0) {
            throw new Exception("Invalid operation. The resulting quantity is negative.");
        } else {
            // Update the banknotes map with the new quantity
            banknotes.put(value, currentQuantity + quantity);
        }
    }

    /**
     * Displays the quantity of each denomination of banknotes in the ATM.
     */
    public void showValues() {
        banknotes.forEach((denomination, quantity) ->
                System.out.println("The quantity of " + denomination + "$ = " + quantity));
    }
}
