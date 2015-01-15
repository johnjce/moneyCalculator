package views.ui.implementation.swing;

import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.Currency;
import model.Exchange;
import model.Money;

public class ExchangeDialog extends JPanel implements views.ui.interfaces.ExchangeDialog{

    private JTextField amount;
    private JComboBox<Currency> fromCurrency;
    private JComboBox<Currency> toCurrency;
    private Currency[] currencies;

    public ExchangeDialog (Currency[] currencies) {
        this.setBorder(BorderFactory.createTitledBorder("Exchange Dialog"));
        this.currencies = currencies;
        this.setLayout(new FlowLayout());
        this.createWidgets();
    }

    private void createWidgets() {
        this.add(createAmountWidget());
        this.add(createFromCurrencyWidget());
        this.add(createToCurrencyWidget());
    }

    private JComponent createAmountWidget() {
        JTextField input = new JTextField(10);
        this.amount = input;
        return input;
    }

    private Component createFromCurrencyWidget() {
        JComboBox<Currency> input = new JComboBox<>(currencies);
        this.fromCurrency = input;
        return input;
    }

    private Component createToCurrencyWidget() {
        JComboBox<Currency> input = new JComboBox<>(currencies);
        this.toCurrency = input;
        return input;
    }

    @Override
    public Exchange getExchange() {
        return new Exchange(getMoney(), getCurrency(toCurrency));
    }

    private Money getMoney() {
        return new Money(getAmount(), getCurrency(fromCurrency));
    }

    private double getAmount() {
        try {
            return Double.parseDouble(amount.getText());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private Currency getCurrency(JComboBox<Currency> comboBox) {
        return comboBox.getItemAt(comboBox.getSelectedIndex());
    }   
}
