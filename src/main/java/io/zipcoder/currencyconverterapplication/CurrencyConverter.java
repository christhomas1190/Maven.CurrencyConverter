package io.zipcoder.currencyconverterapplication;

public class CurrencyConverter {
    public static Double convert(Double amountOfBaseCurrency, ConvertableCurrency sourceCurrencyType, CurrencyType targetCurrencyType) {
//taking in the universal amount of currency you have, multiply by currency conversion value
        return amountOfBaseCurrency * sourceCurrencyType.convert(targetCurrencyType);
    }
}
