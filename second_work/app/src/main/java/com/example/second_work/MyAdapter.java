package com.example.second_work;

import android.graphics.Color;
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
        holder.btn.setOnClickListener(v -> {
            System.out.println("Button was pressed: " + data.get(position));
        });
        String newText = "Это элемент номер " + (position+1);
        holder.txt.setText(newText);

    }

    @Override
    public int getItemCount() {
        return data.size();

    }

}
