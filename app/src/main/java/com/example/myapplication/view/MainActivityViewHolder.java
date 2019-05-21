package com.example.myapplication.view;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.myapplication.R;

public class MainActivityViewHolder extends RecyclerView.ViewHolder {
    public TextView textViewName;

    public MainActivityViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewName =itemView.findViewById(R.id.textViewName);
    }

}
