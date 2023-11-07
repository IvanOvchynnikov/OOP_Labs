package blackjack_stuff;

import java.util.Random;
import java.util.ArrayList;

/**
 * Даний клас служить для створення колоди з 52 карт
 */
public class Deck {
    /**
     * Поле cards служить для зберігання колоди з 52 карт
     */
    private ArrayList<Card> cards = new ArrayList<Card>();

    /**
     * Створює колоду з 52 карт
     */
    public void createDeck(){
        for(Suit suit:Suit.values()){
            for(Value value:Value.values()){
                this.cards.add(new Card(suit,value));
            }
        }
    }
    /**
     * Перемішує карти за допомогою бібліотеки random.
     */
    public void shuffleCard(){
        ArrayList<Card>tmp=new ArrayList<Card>();
        Random random=new Random();
        for(int i=0; i<this.cards.size(); i++){
            int ind=random.nextInt(this.cards.size());
            tmp.add(this.cards.get(ind));
            this.cards.remove(ind);
        }
        this.cards=tmp;
    }

    /**
     * Метод , для видачі карти.
     * @return - екземпляр класу @link Card - Рандомна карта з кололди.
     */
    public Card deal_card(){
        Random random=new Random();
        int ind=random.nextInt(this.cards.size());
        Card tmp=this.cards.get(ind);
        this.cards.remove(ind);
        return tmp;
    }

}
