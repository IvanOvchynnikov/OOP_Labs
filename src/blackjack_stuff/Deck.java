package blackjack_stuff;

import java.util.Random;
import java.util.ArrayList;
public class Deck {
    private ArrayList<Card> cards = new ArrayList<Card>();
    public void createDeck(){
        for(Suit suit:Suit.values()){
            for(Value value:Value.values()){
                this.cards.add(new Card(suit,value));
            }
        }
    }
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

    public Card deal_card(){
        Random random=new Random();
        int ind=random.nextInt(this.cards.size());
        Card tmp=this.cards.get(ind);
        this.cards.remove(ind);
        return tmp;
    }

}
