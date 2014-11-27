package views.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import model.CurrencySet;
import model.Exchange;
import model.ExchangeRate;

public class ExchangeRateLoader {
    
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
    
    public ExchangeRate load () {
        Connection c = null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:test.db");
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("Opened database successfully");
        return null;
    }
}
