package com.example.taskrecyclerviewer;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Currency {
    private String currencyName;
    private double exchangeRate;
    private String currencyCode;
    private int countryFlag;

    public Currency(int countryFlag,String currencyName, double exchangeRate,String currencyCode ) {
        this.currencyCode = currencyCode;
        this.exchangeRate = exchangeRate;
        this.currencyName = currencyName;
        this.countryFlag = countryFlag;
    }

    public String getCurrenceyCode() {

        return currencyCode;
    }

    public void setCurrencyCode() {

        this.currencyCode = currencyCode;
    }

    public String getCurrenceyName() {
        return currencyName;
    }

    public void setCurrencyName() {
        this.currencyName = currencyName;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public int getCountryFlag(){
        return countryFlag;
    }


}
