package controller;

import model.CurrencySet;
import model.Exchange;
import model.ExchangeRate;
import model.Money;
import views.persistence.implementation.sqlite.ExchangeRateLoader;
import views.process.Exchanger;
import views.ui.interfaces.ExchangeDialog;
import views.ui.interfaces.ExchangeDisplay;

public class ExchangeOperation {
    
    private CurrencySet currencySet;
    private ExchangeDialog exchangeDialog;
    private ExchangeDisplay exchangeDisplay;
    
    public ExchangeOperation(CurrencySet currencySet, ExchangeDialog exchangeDialog, ExchangeDisplay exchangeDisplay) {
        this.exchangeDialog = exchangeDialog;
        this.exchangeDisplay = exchangeDisplay;
        this.currencySet = currencySet;
    }
    
    public void execute () {      
        Exchange exchange = exchangeDialog.getExchange();
        ExchangeRate exchangeRate = new ExchangeRateLoader(exchange, currencySet).load();
        Money  money = new Exchanger (exchange.getMoney(), exchange.getCurrency(), exchangeRate).execute();
        exchangeDisplay.display(money);
    }
    
}
