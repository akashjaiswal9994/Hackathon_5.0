package com.example.upesaio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OneTwoSem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_two_sem);
    }
    public void semseone(View view){
        Intent seo= new Intent(this,RsourceFirst.class);
        startActivity(seo);
    }
}