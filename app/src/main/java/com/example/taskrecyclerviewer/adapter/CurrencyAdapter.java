package com.example.taskrecyclerviewer.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taskrecyclerviewer.Currency;
import com.example.taskrecyclerviewer.R;

import java.util.ArrayList;

public class CurrencyAdapter extends RecyclerView.Adapter<CurrencyAdapter.ViewHolder> {
private ArrayList<Currency> currencyPrice;

    public CurrencyAdapter(ArrayList<Currency> currencyPrice) {
        this.currencyPrice = currencyPrice;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        TextView exchangeTextView;
        TextView codeTextView;
        ImageView countryImageView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.currencyName);
            exchangeTextView = itemView.findViewById(R.id.exchangeRate);
            codeTextView = itemView.findViewById(R.id.currencyCode);
            countryImageView = itemView.findViewById(R.id.countryImageView);

        }
    }

    @NonNull
    @Override
    public CurrencyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.currencylayout,
                parent,
                false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Currency currency = currencyPrice.get(position);
        String currencyName = currency.getCurrenceyName();
        String currencyCode = currency.getCurrenceyCode();
        double currencyRate = currency.getExchangeRate();
        int countryImageView = currency.getCountryFlag();
        holder.nameTextView.setText(currencyName);
        holder.exchangeTextView.setText(String.valueOf(currencyRate));
        holder.codeTextView.setText(currencyCode);
        holder.countryImageView.setImageResource(currency.getCountryFlag());
    }

    @Override
    public int getItemCount() {

        return currencyPrice.size();
    }

}
