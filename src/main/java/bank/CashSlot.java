package bank;

/**
 * Created by Sega on 31.01.2017.
 */
public class CashSlot {
    private int contents;
    public int getContents() {
        return contents;
    }
    public void dispense(int dollars){
        contents = dollars;
    }
}
