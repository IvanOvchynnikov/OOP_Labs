package blackjack_stuff;

/**
 * Клас Card створює карту із певним значенням та мастю.
 */
public class Card {
    /**
     * Приватне поле для масті
     */
    private Suit suit;
    /**
     * Приватне поле для значення
     */
    private Value value;

    /**
     * Конструктор Card
     * @param suit - @link Suit - масть
     * @param value - @link Value - значення
     */
    public Card(Suit suit,Value value){
        this.suit=suit;
        this.value=value;
    }

    /**
     * Метод , який повертає масть карти
     * @return - Масть карти(String)
     */
    public String get_suit(){
        switch (this.suit) {
            case CLUBS:
                return "♣";
            case DIAMONDS:
                return "♦";
            case SPADES:
                return "♠";
            case HEARTS:
                return "♥";
            default:
                return "Invalid";
        }
    }

    /**
     * Метод , який повертає значення карти.
     * @return - значення карти (int)
     */
    public String get_value(){
        switch (this.value) {
            case TWO:
                return "2";
            case THREE:
                return "3";
            case FOUR:
                return "4";
            case FIVE:
                return "5";
            case SIX:
                return "6";
            case SEVEN:
                return "7";
            case EIGHT:
                return "8";
            case NINE:
                return "9";
            case TEN:
                return "10";
            case JACK:
                return "J";
            case QUEEN:
                return "Q";
            case KING:
                return "K";
            case ACE:
                return "A";
            default:
                return "Invalid";
        }
    }
}
