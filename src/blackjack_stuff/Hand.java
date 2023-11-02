package blackjack_stuff;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> hand;
    public Hand(){
        this.hand=new ArrayList<Card>();
    }
    public void add_card(Card card){
        this.hand.add(card);
    }
    public void print_card(int type){
        if(type==1){
            System.out.print(this.hand.get(0).get_value());
            System.out.println(this.hand.get(0).get_suit());
        }
        else{
            for(Card card:this.hand){
                System.out.print(card.get_value());
                System.out.println(card.get_suit());
            }
        }
    }
    public void clear_hand(){
        this.hand.clear();
    }
    public int get_value(){
        int cur=0,aces=0;
        for(Card card:this.hand){
            switch (card.get_value()){
                case "2": cur+=2; break;
                case "3": cur+=3; break;
                case "4": cur+=4; break;
                case "5": cur+=5; break;
                case "6": cur+=6; break;
                case "7": cur+=7; break;
                case "8": cur+=8; break;
                case "9": cur+=9; break;
                case "10": cur+=10; break;
                case "J": cur+=10; break;
                case "Q": cur+=10; break;
                case "K": cur+=10; break;
                case "A": aces++; break;
            }
        }
        for(int i=0; i<aces; i++){
           if(cur>10){
               cur+=1;
           }
           else cur+=11;
       }
        return cur;
    }

}
