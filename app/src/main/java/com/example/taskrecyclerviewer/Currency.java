package com.example.taskrecyclerviewer;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Currency {
    private String currencyName;
    private double exchangeRate;
    private String currencyCode;

    public Currency(String currencyName, double exchangeRate,String currencyCode ) {
        this.currencyCode = currencyCode;
        this.exchangeRate = exchangeRate;
        this.currencyName = currencyName;
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


}
