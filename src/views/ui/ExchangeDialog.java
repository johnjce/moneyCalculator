
package views.ui;

import model.CurrencySet;
import model.Exchange;

public class ExchangeDialog {
    
    private Exchange exchange;
    private CurrencySet currencySet;

    public ExchangeDialog(CurrencySet currencySet) {
        this.currencySet = currencySet;
    }

    public Exchange getExchange() {
        return exchange;
    }
    
}
