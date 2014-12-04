package controller;

import model.CurrencySet;
import model.Exchange;
import model.Money;
import views.persistence.ExchangeRateLoader;
import views.process.Exchanger;
import views.ui.ExchangeDialog;
import views.ui.MoneyDisplay;

public class ExchangeOperation {
    
    private CurrencySet currencySet;
    
    public ExchangeOperation(CurrencySet currencySet) {
        this.currencySet = currencySet;
    }
    
    public void execute () {
        ExchangeDialog exchangeDiag = showExchangeDialog();
        ExchangeRateLoader exchangeRateLoader = getExchangeRateLoader(exchangeDiag);
        Exchanger exchanger = executeExchanger(exchangeRateLoader);
        MoneyDisplay moneyDisplay = showMoneyDisplay(exchanger.execute());
    }
    
    private MoneyDisplay showMoneyDisplay (Money money) {
        //return new MoneyDisplay(money);
        return null;
    }
    
    private ExchangeDialog showExchangeDialog () {
        //return new ExchangeDialog(currencySet);
        return null;
    }
    
    private Exchanger executeExchanger (ExchangeRateLoader exchangeRateLoader) {
        return new Exchanger(exchangeRateLoader.load());
    }
    
    private ExchangeRateLoader getExchangeRateLoader (ExchangeDialog exchangeDiag) {
        return new ExchangeRateLoader(exchangeDiag.getExchange(), currencySet);
    }
    
}
