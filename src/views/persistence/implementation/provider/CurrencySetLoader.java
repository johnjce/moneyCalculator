package views.persistence.implementation.provider;

import views.persistence.implementation.sqlite.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.CurrencySet;

public class CurrencySetLoader implements views.persistence.interfaces.CurrencySetLoader {

    @Override
    public CurrencySet load() {
        CurrencySet currencySet = new CurrencySet ();
        try {
            Class.forName("org.sqlite.JDBC");
            Connection c = DriverManager.getConnection("jdbc:sqlite:currencies.db");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CurrencySetLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return currencySet;
    } 
}
