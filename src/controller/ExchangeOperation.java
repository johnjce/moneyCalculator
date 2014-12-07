package controller;

import model.CurrencySet;
import model.Money;
import views.persistence.implementation.ExchangeRateLoader;
import views.process.Exchanger;
import views.ui.interfaces.ExchangeDialog;
import views.ui.interfaces.ExchangeDisplay;

public class ExchangeOperation {
    
    private CurrencySet currencySet;
    
    public ExchangeOperation(CurrencySet currencySet, ExchangeDialog exchangeDialog, ExchangeDisplay exchangeDiplay) {
        this.currencySet = currencySet;
    }
    
    public void execute () {
        ExchangeDialog exchangeDiag = showExchangeDialog();
        ExchangeRateLoader exchangeRateLoader = getExchangeRateLoader(exchangeDiag);
        Exchanger exchanger = executeExchanger(exchangeRateLoader);
        ExchangeDisplay moneyDisplay = showMoneyDisplay(exchanger.execute());
    }
    
    private ExchangeDisplay showMoneyDisplay (Money money) {
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
