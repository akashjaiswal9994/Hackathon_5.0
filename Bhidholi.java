package com.example.upesaio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.time.Year;

public class Bhidholi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhidholi);
    }
    public void socsclick(View view){
        Intent so=new Intent(this, CsYear.class);
        startActivity(so);
    }

}