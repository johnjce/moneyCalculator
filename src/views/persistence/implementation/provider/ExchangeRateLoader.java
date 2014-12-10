package views.persistence.implementation.provider;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.CurrencySet;
import model.Exchange;
import model.ExchangeRate;

public class ExchangeRateLoader implements views.persistence.interfaces.ExchangeRateLoader {
        
    private Exchange exchange;
    private CurrencySet currencySet;
    
    private final String googleProvider = "http://rate-exchange.appspot.com/currency?";

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
            URLConnection provider = new URL(googleProvider+"from="+exchange.getMoney().getCurrency().getSymbol()+"&to="+exchange.getCurrency().getSymbol()).openConnection();
            BufferedReader exchangeRateInfo = new BufferedReader(new InputStreamReader(provider.getInputStream()));
            System.out.println(exchangeRateInfo.readLine());
        } catch (MalformedURLException ex) {
            Logger.getLogger(ExchangeRateLoader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ExchangeRateLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
