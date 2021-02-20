package com.example.upesaio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    ebook_socs ebook_socs;
    ArrayList<DownModel>downModels;

    public MyAdapter(ebook_socs ebook_socs, ArrayList<DownModel> downModels) {
        this.ebook_socs = ebook_socs;
        this.downModels = downModels;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(ebook_socs.getBaseContext());
        View view=layoutInflater.inflate(R.layout.ebooks,null,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.mname.setText(downModels.get(position).getName());
        holder.mdown.setText(downModels.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return downModels.size();
    }
}
