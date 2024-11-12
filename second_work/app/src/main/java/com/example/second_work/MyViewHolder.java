package com.example.second_work;

import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    Button buttonLeft;
    Button buttonRight;

    public MyViewHolder(View v) {
        super(v);
        buttonLeft = v.findViewById(R.id.button_left);
        buttonRight = v.findViewById(R.id.button_right);
    }
}