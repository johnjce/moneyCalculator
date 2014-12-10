
package views.ui.implementation.console;

import java.util.Scanner;
import model.Currency;
import model.Exchange;
import model.Money;

public class ExchangeDialog implements views.ui.interfaces.ExchangeDialog {

    public Exchange getExchange() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Amount money in : ");
        double amountIN = scanner.nextDouble();
        Currency currencyIN = getCurrency(scanner.nextInt());

        System.out.println("Amount money out : ");
        double amountOut = scanner.nextDouble();
        Currency currencyOUT = getCurrency(scanner.nextInt());
        return new Exchange(new Money(amountIN, currencyIN), currencyOUT);
    }
    
    private Currency getCurrency (int ID) {
        System.out.println("Currency : ");
        System.out.println("€ : 0");
        System.out.println("$ : 1");
        System.out.println("£ : 2");
        switch (ID) {
            case 0:
                return new Currency("","","");
            case 1:
                return new Currency ("","","");
            default:
                return new Currency ("","","");
        }
    }
    
}
