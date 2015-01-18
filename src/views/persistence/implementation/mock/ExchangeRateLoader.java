package views.persistence.implementation.mock;

import java.util.Date;
import model.Currency;
import model.CurrencySet;
import model.Exchange;
import model.ExchangeRate;

public class ExchangeRateLoader implements views.persistence.interfaces.ExchangeRateLoader {
        
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
    
    private double getRate (Currency in, Currency out) {
        switch (in.toString()){
            case "$": if (out.toString()=="€") return 1.1;
                else if(out.toString()=="F") return 0.8;
                else if (out.toString()=="£") return 0.7;
            case "€": if (out.toString()=="$") return 0.9;
                else if(out.toString()=="F") return 0.5;
                else if(out.toString()=="£") return 0.5;
            case "£": if (out.toString()=="€") return 2;
                else if(out.toString()=="F") return 1.24;
                else if(out.toString()=="$") return 1.25;
            case "F": if (out.toString()=="€") return 2;
                else if(out.toString()=="£") return 1.23;
                else if(out.toString()=="$") return 1.25;
            default: return 0;
        }
    }
    
    @Override
    public ExchangeRate load () {    
        return new ExchangeRate(exchange.getMoney().getCurrency(), exchange.getCurrency(), getRate(exchange.getMoney().getCurrency(), exchange.getCurrency()), new Date());
    }
}
