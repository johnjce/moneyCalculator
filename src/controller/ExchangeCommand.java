package controller;

import model.CurrencySet;
import model.Exchange;
import model.ExchangeRate;
import model.Money;
import views.persistence.implementation.webprovider.ExchangeRateLoader;
import views.process.Exchanger;
import views.ui.interfaces.ExchangeDialog;
import views.ui.interfaces.ExchangeDisplay;

public class ExchangeCommand implements Command {
    
    private CurrencySet currencySet;
    private ExchangeDialog exchangeDialog;
    private ExchangeDisplay exchangeDisplay;
    
    public ExchangeCommand(CurrencySet currencySet, ExchangeDialog exchangeDialog, ExchangeDisplay exchangeDisplay) {
        this.exchangeDialog = exchangeDialog;
        this.exchangeDisplay = exchangeDisplay;
        this.currencySet = currencySet;
    }
    
    @Override
    public void execute () {      
        Exchange exchange = exchangeDialog.getExchange();
        ExchangeRate exchangeRate = new ExchangeRateLoader(exchange, currencySet).load();
        Money  money = new Exchanger (exchange.getMoney(), exchange.getCurrency(), exchangeRate).execute();
        exchangeDisplay.display(money);
    }
    
}
