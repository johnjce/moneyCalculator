package views.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import model.CurrencySet;

public class CurrencySetLoader {

    public CurrencySet load() {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:moneycalculator.db");
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS CURRENCY " +
                         "(ID INT PRIMARY KEY     NOT NULL," +
                         " NAME           CHAR(50)    NOT NULL, " + 
                         " SYMBOL         CHAR(1)     NOT NULL, " + 
                         " CODE        CHAR(10)"; 
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Table created successfully");
        return null;
    }
    
}
