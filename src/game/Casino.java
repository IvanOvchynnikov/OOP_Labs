package game;
import blackjack_stuff.Table;

/**
 * Клас Casino використовується для створення столів із різними діапазонами ставок
 */
public class Casino {
    /**
     * Поле tables є масивом об'єктів Стіл. Воно є публічним, для взаємодії у класі Main.
     */
    public Table tables[] = new Table[3];

    /**
     * Конструктор Casino() не приймає ніяких параметрів
     */
    public Casino(){
        this.tables[0]=new Table(1,10);
        this.tables[1]=new Table(5,50);
        this.tables[2]=new Table(25,250);
    }
}
