package com.example.second_work;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private final List<String> data;

    public MyAdapter(List<String> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.buttonLeft.setOnClickListener(v -> {
            System.out.println("Left button was pressed: " + data.get(position));
        });

        holder.buttonRight.setOnClickListener(v -> {
            System.out.println("Right button was pressed: " + data.get(position));
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

}
