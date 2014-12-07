package application;

import controller.ExchangeOperation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.CurrencySet;
import views.ui.implementation.swing.ApplicationFrame;

public class App {   
    public static void main (String args []) {     
        CurrencySet currencySet = new views.persistence.implementation.CurrencySetLoader().load();
        ApplicationFrame frame = new ApplicationFrame(currencySet.toArray());
        frame.register(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ExchangeOperation(currencySet, frame.getExchangeDialog(), new views.ui.implementation.swing.ExchangeDisplay()).execute();
            }
        });
    }
}
