package views.persistence.implementation;

import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader implements views.persistence.interfaces.CurrencySetLoader {

    @Override
    public CurrencySet load() {
        CurrencySet currencySet = new CurrencySet ();
        currencySet.add(new Currency("DOLLAR","$","DLL"));
        currencySet.add(new Currency("EURO","€","EUR"));
        currencySet.add(new Currency("LIBRA","L","LIB"));
        return currencySet;
    }
    
}
