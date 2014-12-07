package swing;

import javax.swing.JTextField;
import model.Money;

public class ExchangeDisplay extends JTextField implements views.ui.ExchangeDisplay {

    @Override
    public void display(Money money) {
        this.setText(money.toString());
    }
    
}
