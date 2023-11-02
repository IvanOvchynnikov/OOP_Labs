package game;

import blackjack_stuff.Deck;
import blackjack_stuff.Hand;
import blackjack_stuff.Table;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number of your chips:");
        Scanner scanner=new Scanner(System.in);
        Casino casino=new Casino();
        double chips=scanner.nextDouble();
        System.out.println("Choose your table:");
        for(int i=0; i<3; i++){
            System.out.println(i+1+" Table has limit: "+casino.tables[i].minBid+"$"+"-"+casino.tables[i].maxBid+"$");
        }
        int table_num;
        while(true){
            table_num=scanner.nextInt();
            if(table_num<=0 || table_num>3) System.out.println("There is no such a table. Pick another one");
            else if(casino.tables[table_num-1].minBid>chips) System.out.println("You don't have enough money for this one. Pick another one");
            else {System.out.println("Your table is: "+table_num); break;}
        }
        table_num--;
        while(chips>0){
            System.out.println("You have "+chips+"$. Enter your bet:");
            double bet;
            while (true){
                bet=scanner.nextDouble();
                if(bet>chips) System.out.println("You don't have such an amount of money. Enter proper amount:");
                else if(bet<casino.tables[table_num].minBid) System.out.println("Minimal bet is: "+casino.tables[table_num].minBid+"$ Enter proper amount:");
                else if(bet>casino.tables[table_num].maxBid) System.out.println("Maximal bet is: "+casino.tables[table_num].maxBid+"$ Enter proper amount:");
                else {System.out.println("Your bet is: "+bet+"$"); break;}
            }
            chips-=bet;
            Deck deck=new Deck();
            deck.createDeck();
            deck.shuffleCard();

            Hand player_hand=new Hand();
            Hand dealer_hand=new Hand();

            player_hand.add_card(deck.deal_card());
            player_hand.add_card(deck.deal_card());

            dealer_hand.add_card(deck.deal_card());
            dealer_hand.add_card(deck.deal_card());
            System.out.println("Your card "+"("+player_hand.get_value()+"): ");
            player_hand.print_card(0);
            System.out.println("Dealer's card:");
            dealer_hand.print_card(1);

            if(player_hand.get_value()==21){
                System.out.println("VICTORY! You have blackjack!");
                chips+=bet*(5/2);
            }
            else{
                int entered=1;
                while(player_hand.get_value()<21){
                    System.out.println("Enter (1) to take one more card or (2) to hold");
                    entered=scanner.nextInt();
                    if(entered!=1 && entered!=2) System.out.println("You wrote down incorrect value");
                    if(entered==1){
                        player_hand.add_card(deck.deal_card());
                        System.out.println("Your card "+"("+player_hand.get_value()+"): ");
                        player_hand.print_card(0);
                        System.out.println("Dealer's card:");
                        dealer_hand.print_card(1);
                    }
                    else break;
                }
                while(dealer_hand.get_value()<=16){
                    dealer_hand.add_card(deck.deal_card());
                }
                System.out.println();
                System.out.println("Your card "+"("+player_hand.get_value()+"): ");
                player_hand.print_card(0);
                System.out.println("Dealer's card "+"("+dealer_hand.get_value()+"): ");
                dealer_hand.print_card(0);
                int playerValue= player_hand.get_value();
                int dealerValue=dealer_hand.get_value();
                if((dealerValue>playerValue && dealerValue<=21) || (playerValue>dealerValue && playerValue>21)) System.out.println("You lose!");
                else if(dealerValue==playerValue || (dealerValue>21 && playerValue>21)) {System.out.println("It is DRAW!"); chips+=bet;}
                else{
                    System.out.println("You WON!");
                    chips+=bet*2;
                }
            }
        }
        System.out.println("You don't have money! LOOOOOOOSSSSEEEEERRR");
    }
}