package com.example.taskrecyclerviewer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.taskrecyclerviewer.adapter.CurrencyAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView currencyRecycleViwer;
    private ArrayList<Currency> currencyArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currencyRecycleViwer = findViewById(R.id.RecycleViwerCurrency);
        currencyRecycleViwer.setLayoutManager(new LinearLayoutManager(this));
        addCurrencies();

        RecyclerView.ItemDecoration div = new DividerItemDecoration(this, LinearLayoutManager.VERTICAL);
        currencyRecycleViwer.addItemDecoration(div);

        CurrencyAdapter currencyAdapter = new CurrencyAdapter(currencyArrayList);
        currencyRecycleViwer.setAdapter(currencyAdapter);


    }
    private void addCurrencies(){
        currencyArrayList.add(new Currency("Kuwait",1,"KWD"));
        //////////////////////////////////////////////////////////////////////////////////////
        currencyArrayList.add(new Currency("United States",3.25,"USD"));
        //////////////////////////////////////////////////////////////////////////////////////
        currencyArrayList.add(new Currency("UAE",11.95,"AED"));
        //////////////////////////////////////////////////////////////////////////////////////
        currencyArrayList.add(new Currency("KSA",12.2,"SR"));
        //////////////////////////////////////////////////////////////////////////////////////
        currencyArrayList.add(new Currency("Qatar",11.84,"QR"));
        //////////////////////////////////////////////////////////////////////////////////////
        currencyArrayList.add(new Currency("United Kingdom",2.57,"SP"));
        //////////////////////////////////////////////////////////////////////////////////////
        currencyArrayList.add(new Currency("Euro",2.98,"ER"));
        //////////////////////////////////////////////////////////////////////////////////////
        currencyArrayList.add(new Currency("Canada",4.38,"CD"));


    }

}