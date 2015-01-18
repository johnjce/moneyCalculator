package views.persistence.implementation.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader implements views.persistence.interfaces.CurrencySetLoader {

    @Override
    public CurrencySet load() {
        CurrencySet currencySet = new CurrencySet ();
        Connection c = null;
        Statement stmt = null;
        try {
          Class.forName("org.sqlite.JDBC");
          c = DriverManager.getConnection("jdbc:sqlite:currencies.db");
          c.setAutoCommit(false);
          stmt = c.createStatement();
          ResultSet rs = stmt.executeQuery( "SELECT * FROM CURRENCIES_TABLE;" );
          while ( rs.next() ) {
             currencySet.add(new Currency(rs.getString("name"),rs.getString("symbol"),rs.getString("code")));
          }
          rs.close();
          stmt.close();
          c.close();
        } catch ( Exception e ) {
          System.err.println( e.getClass().getName() + ": " + e.getMessage() );
          System.exit(0);
        }
        return currencySet;
    } 
}
