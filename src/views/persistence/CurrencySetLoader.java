package views.persistence;

import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader {

    public CurrencySet load() {
        CurrencySet set = new CurrencySet();
        set.add(new Currency("","",""));
        set.add(new Currency("","",""));
        set.add(new Currency("","",""));
        set.add(new Currency("","",""));
        return set;
    }
    
}
