package game;
import blackjack_stuff.Table;
public class Casino {
    public Table tables[] = new Table[3];
    public Casino(){
        this.tables[0]=new Table(1,10);
        this.tables[1]=new Table(5,50);
        this.tables[2]=new Table(25,250);
    }
}
