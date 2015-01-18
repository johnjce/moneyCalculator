package views.persistence.implementation.mock;

import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader implements views.persistence.interfaces.CurrencySetLoader {

    @Override
    public CurrencySet load() {
        CurrencySet currencySet = new CurrencySet ();
        currencySet.add(new Currency("Dólar Estadounidense","$","USD"));
        currencySet.add(new Currency("Euro","€","EUR"));
        currencySet.add(new Currency("Francos Franceses","F","FRF"));
        currencySet.add(new Currency("Libras Británicas","£","GBP"));
        return currencySet;
    } 
}
