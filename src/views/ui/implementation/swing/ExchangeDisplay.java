package views.ui.implementation.swing;

import javax.swing.JLabel;
import model.Money;

public class ExchangeDisplay extends JLabel implements views.ui.interfaces.ExchangeDisplay {

    public ExchangeDisplay () {
        super();
    }
    
    @Override
    public void display(Money money) {
        this.setText(" The result is : "+money.getAmount()+" "+money.getCurrency().getSymbol());
    }
    
}
