package mock;

import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader implements views.persistence.CurrencySetLoader {

    @Override
    public CurrencySet load() {
        CurrencySet currencySet = new CurrencySet ();
        currencySet.add(new Currency("","",""));
        currencySet.add(new Currency("","",""));
        currencySet.add(new Currency("","",""));
        return currencySet;
    }
    
}
