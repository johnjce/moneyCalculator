package views.ui;

import model.CurrencySet;
import model.Exchange;

public class ExchangeDialog {
    
    private CurrencySet currencySet;

    public ExchangeDialog(CurrencySet currencySet) {
        this.currencySet = currencySet;
    }

    public CurrencySet getCurrencySet() {
        return currencySet;
    }
    
    public Exchange execute () {
        return null;
    }
    
}
