
package views.ui.implementation.console;

import model.Money;

public class ExchangeDisplay implements views.ui.interfaces.ExchangeDisplay {
    
    public void display (Money money) {
        System.out.println(money.getAmount()+" "+money.getCurrency().getSymbol());
    }
  
}
