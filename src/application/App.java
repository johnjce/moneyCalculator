package application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.CurrencySet;
import swing.ApplicationFrame;

public class App {   
    public static void main (String args []) {     
        CurrencySet currencySet = new mock.CurrencySetLoader().load();
        ApplicationFrame frame = new ApplicationFrame(currencySet.toArray());
        frame.register(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //new ExchangeOperation(frame.getExchangeDialog(), new swing.ExchangeDisplay()).execute();
            }
        });
    }
}
