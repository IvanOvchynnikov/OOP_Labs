/**
 * Клас StringLengthException є власним винятком.
 */
public class StringLengthException extends Exception {

    /**
     * Конструктор StringLengthException.
     *
     * @param errorMessage Повідомлення про помилку, пов'язане із винятком.
     */
    public StringLengthException(String errorMessage) {
        super(errorMessage);
    }
}
