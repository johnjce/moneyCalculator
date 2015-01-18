package views.persistence.implementation.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.CurrencySet;
import model.Exchange;
import model.ExchangeRate;

public class ExchangeRateLoader implements views.persistence.interfaces.ExchangeRateLoader {
        
    private Exchange exchange;
    private CurrencySet currencySet;

    public ExchangeRateLoader (Exchange exchange, CurrencySet currencySet) {
        this.exchange = exchange;
        this.currencySet = currencySet;
    }  
    
    public Exchange getExchange() {
        return exchange;
    }

    public CurrencySet getCurrencySet() {
        return currencySet;
    }      
    
    @Override
    public ExchangeRate load () {
        
        try {
            Class.forName("org.sqlite.JDBC");
            Connection c = DriverManager.getConnection("jdbc:sqlite:moneycalculator.db");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CurrencySetLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
