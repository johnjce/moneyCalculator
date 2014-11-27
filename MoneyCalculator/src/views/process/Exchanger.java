
package views.process;

import model.Exchange;
import model.Money;

public class Exchanger {
    
    private Exchange exchange;
    private Money money;

    public Exchanger(Exchange exchange, Money money) {
        this.exchange = exchange;
        this.money = money;
    }

    public Money execute () {
        return new Money (money.getAmount() * exchange.getMoney().getAmount(), money.getCurrency());
    }
    
}
