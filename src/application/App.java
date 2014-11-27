package application;

import controller.ExchangeOperation;
import views.persistence.CurrencySetLoader;

public class App {   
    public static void main (String args []) {     
        new ExchangeOperation(new CurrencySetLoader().load()).execute();  
        
        
    }
}
