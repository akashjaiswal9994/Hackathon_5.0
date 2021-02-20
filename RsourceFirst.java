package com.example.upesaio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.firestore.FirebaseFirestore;

public class RsourceFirst extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rsource_first);

    }
    public void boobot(View view){
        Intent boi=new Intent(this,ebook_socs.class);
        startActivity(boi);
    }
}