package com.example.second_work;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    Button btn;
    TextView txt;

    public MyViewHolder(View v) {
        super(v);
        btn = v.findViewById(R.id.button);
        txt = v.findViewById(R.id.textView);
    }
}