package controller;

import model.Currency;
import model.CurrencySet;
import model.Exchange;
import model.ExchangeRate;
import model.Money;
import views.persistence.ExchangeRateLoader;
import views.ui.ExchangeDialog;

public class ExchangeOperation {
    
    private CurrencySet currencySet;
    
    public ExchangeOperation(CurrencySet currencySet) {
        this.currencySet = currencySet;
    }
    
    public void execute () {
        Exchange exchange = readExchange();
        ExchangeRate exchangeRate = getExchangeRate();
    }
    
    private void displayMoney (Money money) {
        
    }
    
    private Exchange readExchange () {
         return new ExchangeDialog(currencySet).execute();
    }
    
    private ExchangeRate getExchangeRate () {
        return new ExchangeRateLoader().load();
    }
    
    private Money calculateExchanger () {
        return null;
    }
    
}
