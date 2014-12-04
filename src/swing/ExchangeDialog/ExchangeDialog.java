package swing.ExchangeDialog;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import model.Currency;
import model.Exchange;
import model.Money;

public class ExchangeDialog implements views.ui.ExchangeDialog {

    private final Currency [] currencySet;
    private JComboBox<Currency> fromCurrency;
    private JTextField amount;
    private JComboBox<Currency> toCurrency;
    
    public ExchangeDialog (Currency [] currencySet) {
        super();
        createWidgets();
        this.currencySet=currencySet;
    }

    public Currency[] getCurrencySet() {
        return currencySet;
    }

    public JComboBox<Currency> getFromCurrency() {
        return fromCurrency;
    }
    
    public JComboBox<Currency> getToCurrency() {
        return toCurrency;
    }
    
    @Override
    public Exchange getExchange() {
        //return new Exchange (getMoney(), getToCurrency(),);
        return null;
    }
    
    public Money getMoney () {
        return null;
        //return new Money(getAmount(), getFromCurrency());
    }
    
    public double getAmount () {
        return Double.parseDouble(amount.getText());
    }

    
    private void createWidgets() {
        //add(createAmount());
        add(createFromCurrency());
        add(createToCurrency());
    }
    
    
    
    private JComboBox<Currency> createFromCurrency () {
        fromCurrency = new JComboBox<>(currencySet);
        return fromCurrency;
    }
    
    private JTextField createAmount () {
        amount = new JTextField();
        return amount;
    }
    
    private JComboBox<Currency> createToCurrency () {
        toCurrency = new JComboBox<>(currencySet);
        return toCurrency;
    }

    private void add(JComboBox<Currency> createAmount) {
        
    }
    
}
