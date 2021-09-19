package com.example.nwsdb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddAccount extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); //<< this
        setContentView(R.layout.activity_add_account);

        button = (Button)  findViewById(R.id.btnDismissA);
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