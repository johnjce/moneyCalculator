package views.ui.implementation.swing;

import javax.swing.JTextField;
import model.Money;

public class ExchangeDisplay extends JTextField implements views.ui.interfaces.ExchangeDisplay {

    @Override
    public void display(Money money) {
        this.setText(money.getAmount()+" "+money.getCurrency().getSymbol());
    }
    
}
