package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class SingaporeDollar implements ConvertableCurrency {
    //takes value from currency type and gives it's Currency a value



    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.SINGAPORE_DOLLAR;
    }
}
