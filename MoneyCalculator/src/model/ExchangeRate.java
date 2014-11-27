package model;

import java.util.Date;

public class ExchangeRate {
    
    private Currency in, out;
    private double value;
    private Date date;

    public ExchangeRate(Currency in, Currency out, double value, Date date) {
        this.in = in;
        this.out = out;
        this.value = value;
        this.date = date;
    }

    public Currency getIn() {
        return in;
    }

    public Currency getOut() {
        return out;
    }

    public double getValue() {
        return value;
    }

    public Date getDate() {
        return date;
    }
      
}
