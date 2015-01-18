package views.persistence.implementation.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Currency;
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
        Connection c = null;
        Statement stmt = null;
        ExchangeRate exchangeRate= null;
        try {
          Class.forName("org.sqlite.JDBC");
          c = DriverManager.getConnection("jdbc:sqlite:exchangerates.db");
          c.setAutoCommit(false);
          stmt = c.createStatement();
          ResultSet rs = stmt.executeQuery( "SELECT * FROM EXCHANGERATES_TABLE;" );
          while ( rs.next() ) {
             if (exchange.getMoney().getCurrency().getSymbol() == rs.getString("currency_in_symbol") && exchange.getCurrency().getSymbol() == rs.getString("currency_out_symbol")) {
                 exchangeRate = new ExchangeRate(exchange.getMoney().getCurrency(), exchange.getCurrency(), rs.getDouble("rate"), new Date());
                 break;
             }
          }
          rs.close();
          stmt.close();
          c.close();
        } catch ( Exception e ) {
          System.err.println( e.getClass().getName() + ": " + e.getMessage() );
          System.exit(0);
        }
        return exchangeRate;
    }
}
