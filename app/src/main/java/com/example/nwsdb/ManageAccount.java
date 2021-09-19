package com.example.nwsdb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ManageAccount extends AppCompatActivity {

    private Button button;
    private Button button2;
    ImageView imgBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); //<< this
        setContentView(R.layout.activity_manage_account);

        button = (Button)  findViewById(R.id.btnEdit);
        button2 = (Button) findViewById(R.id.btnAdd);
        imgBack = findViewById(R.id.imageViewMgt);

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                //To start the activity
                startActivity(i);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAdd();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEdit();
            }
        });
    }
    public void openAdd(){
        Intent intent2 = new Intent(this, AddAccount.class);
        startActivity(intent2);
    }


    public void openEdit(){
        Intent intent = new Intent(this,EditAccount.class);
        startActivity(intent);
    }


}