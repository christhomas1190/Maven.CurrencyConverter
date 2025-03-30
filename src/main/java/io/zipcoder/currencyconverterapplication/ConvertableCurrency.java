package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    //Method input from currencyType
    CurrencyType getCurrencyType();
        //creating the conversion rate
    default Double convert(CurrencyType currencyType) {
        //Here you will have two different currencies put in.
        //getCurrency is taking in what you are converting too.
        return currencyType.getRate()/getCurrencyType().getRate();
    }

}
