package blackjack_stuff;

public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit,Value value){
        this.suit=suit;
        this.value=value;
    }

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
