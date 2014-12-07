
package views.process;

import model.Currency;
import model.ExchangeRate;
import model.Money;

public class Exchanger {
    
    private Currency currency;
    private Money money;
    private ExchangeRate exchangeRate;
    
    public Exchanger (Money money, Currency currency, ExchangeRate exchangeRate) {
        this.money=money;
        this.currency=currency;
        this.exchangeRate=exchangeRate;
    }
    
    public Money execute () {
        return new Money(money.getAmount()*exchangeRate.getValue(), exchangeRate.getOut());
    }
    
}
