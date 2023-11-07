package blackjack_stuff;

/**
 * Клас Table використовується для ініціалізації стола з мін.ставкою та макс.ставкою.
 */
public class Table {
    /**
     * Публічне поле minBid з мін.ставкою даного стола.
     */
    public int minBid;
    /**
     * Публічне поле maxBid з мін.ставкою даного стола.
     */
    public int maxBid;

    /**
     * Конструктор класу Table
     * @param minBid мін.ставка на даному столі.
     * @param maxBid макс.ставка на даному столі.
     */
    public Table(int minBid,int maxBid){
        this.minBid=minBid;
        this.maxBid=maxBid;
    }

}
