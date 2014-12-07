package model;

import java.util.ArrayList;
import java.util.List;

public class CurrencySet {
    
    private final List<Currency> currencyList;
    
    public CurrencySet () {
        currencyList = new ArrayList<>();
    }
    
    public void add (Currency currency) {
        currencyList.add(currency);
    }
    
    public Currency get (int num){
        return currencyList.get(num);
    }
    
    public Currency [] toArray () {
        return currencyList.toArray(new Currency [currencyList.size()]);
    }
}
