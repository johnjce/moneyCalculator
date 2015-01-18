package application;

import controller.ExchangeCommand;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.CurrencySet;
import views.ui.implementation.console.*;
import views.ui.implementation.swing.ApplicationFrame;

public class App {   
    public static void main (String args []) {     
        SwingMODE(new views.persistence.implementation.mock.CurrencySetLoader().load());
    }
    
    private static void SwingMODE (CurrencySet currencySet) {
        ApplicationFrame frame = new ApplicationFrame(currencySet.toArray());
        frame.register(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ExchangeCommand(currencySet, frame.getExchangeDialog(), frame.getExchangeDisplay()).execute();
            }
        });
    }
    
    private static void ConsoleMODE (CurrencySet currencySet) {
        new ExchangeCommand(currencySet, new ExchangeDialog(), new ExchangeDisplay()).execute();
    }
}
