package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class UniversalCurrency implements ConvertableCurrency {
    //takes value from currency type and gives it's Currency a value


    @Override
    public CurrencyType getCurrencyType() {
        return CurrencyType.UNIVERSAL_CURRENCY;
    }
}
