package bank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Sega on 31.01.2017.
 */
public class Money {
    public int dollars = 0;
    public int cents = 0;
    public Money add(Money money){
        this.dollars =+ money.dollars;
        this.cents =+money.cents;
        return money;
    }
    public Money(int dollars,int cents){
        this.dollars = dollars;
        this.cents = cents;
    }
    public Money(){
        new Money(0,0);
    }

}
