package views.persistence.implementation.webprovider;

import java.util.Currency;
import model.CurrencySet;

public class CurrencySetLoader implements views.persistence.interfaces.CurrencySetLoader {

    @Override
    public CurrencySet load() {
        CurrencySet currencySet = new CurrencySet();
        for (Currency currency : Currency.getAvailableCurrencies()) {
            currencySet.add(new model.Currency(currency.getDisplayName(), currency.getSymbol(), currency.getCurrencyCode()));
        }
        return currencySet;
    } 
}
