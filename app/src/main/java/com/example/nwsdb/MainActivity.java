package com.example.nwsdb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.util.Log;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); //<< this
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btnAccount);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAccount();
            }
        });

    }
    public void openAccount(){
        Intent intent = new Intent(this, ManageAccount.class);
        startActivity(intent);
    }


}










