package views.ui.implementation.swing;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.Money;

public class ExchangeDisplay extends JPanel implements views.ui.interfaces.ExchangeDisplay {

    private JLabel label = new JLabel("-");
    
    public ExchangeDisplay () {
        super();
        this.add(label);
        this.setBorder(BorderFactory.createTitledBorder("Exchange Display"));
    }
    
    @Override
    public void display(Money money) {
        label.setText(" The result is : "+money.getAmount()+" "+money.getCurrency().getSymbol());
    }
    
}
