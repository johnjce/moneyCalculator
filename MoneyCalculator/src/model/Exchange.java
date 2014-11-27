package model;

import java.util.Date;

public class Exchange {
    
    private Money money;
    private Currency [] currency;
    
    private Date date;

    public Exchange(Money money, Currency[] currency, Date date) {
        this.money = money;
        this.currency = currency;
        this.date = date;
    }
    
    public Money getMoney() {
        return money;
    }

    public Currency[] getCurrency() {
        return currency;
    }

    public Date getDate() {
        return date;
    }
}
