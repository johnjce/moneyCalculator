package views.persistence.implementation.test;

import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader implements views.persistence.interfaces.CurrencySetLoader {

    @Override
    public CurrencySet load() {
        CurrencySet currencySet = new CurrencySet ();
        currencySet.add(new Currency("Dólar Estadounidense","$","USD"));
        currencySet.add(new Currency("Pesos argentinos","","ARS"));
        currencySet.add(new Currency("Euro","€","EUR"));
        currencySet.add(new Currency("Francos Franceses","F","FRF"));
        currencySet.add(new Currency("Libras Británicas","£","GBP"));
        currencySet.add(new Currency("Rúpia Hindú","RH","INR"));
        currencySet.add(new Currency("Yen Japones","Y","JPY"));
        currencySet.add(new Currency("Rublo Ruso","R","RUB"));
        return currencySet;
    } 
}
