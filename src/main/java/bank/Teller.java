package bank;

/**
 * Created by Sega on 31.01.2017.
 */
public class Teller {
    public CashSlot cashSlot;
    public Teller(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }
    public void withdrawFrom(Account account, int dollars) {
        cashSlot.dispense(dollars);
    }

}
