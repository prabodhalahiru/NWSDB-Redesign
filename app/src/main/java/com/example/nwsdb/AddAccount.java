package com.example.nwsdb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AddAccount extends AppCompatActivity {
    Button button;
    ImageView backBtnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); //<< this
        setContentView(R.layout.activity_add_account);

        button = (Button)  findViewById(R.id.btnDismissA);
        backBtnAdd = findViewById(R.id.imageViewAddBack);

        backBtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ManageAccount.class);
                startActivity(i);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMgt();
            }
        });
    }
    public void openMgt(){
        Intent intent3 = new Intent(this,ManageAccount.class);
        startActivity(intent3);
    }
}