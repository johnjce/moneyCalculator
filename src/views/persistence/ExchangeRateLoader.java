package views.persistence;

import model.CurrencySet;
import model.Exchange;
import model.ExchangeRate;

public class ExchangeRateLoader {
    
    private Exchange exchange;
    private CurrencySet currencySet;

    public ExchangeRateLoader (Exchange exchange, CurrencySet currencySet) {
        this.exchange = exchange;
        this.currencySet = currencySet;
    }  
    
    public Exchange getExchange() {
        return exchange;
    }

    public CurrencySet getCurrencySet() {
        return currencySet;
    }      
    
    public ExchangeRate load () {
        return null;
    }
}
