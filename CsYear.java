package com.example.upesaio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CsYear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs_year);
    }
    public void firstcs(View view){
        Intent fi =new Intent(this,OneTwoSem.class);
        startActivity(fi);
    }
}