package com.example.upesaio;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView mname;
    Button mdown;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        mname=itemView.findViewById(R.id.name_down);
        mdown=itemView.findViewById(R.id.down_button);



    }
}
