package transformer;

import bank.Money;
import cucumber.api.Transformer;

/**
 * Created by Sega on 31.01.2017.
 */
public class MoneyConverter extends Transformer<Money> {
    public Money transform(String amount) {
        String[] numbers = amount.substring(1).split("\\.");
        int dollars = Integer.parseInt(numbers[0]);
        int cents = Integer.parseInt(numbers[1]);
        return new Money(dollars, cents);
    }
}
