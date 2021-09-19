package com.example.nwsdb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class EditAccount extends AppCompatActivity {
    private Button button;
    ImageView backImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); //<< this
        setContentView(R.layout.activity_edit_account);

        button = (Button)  findViewById(R.id.btnDismiss);
        backImg = findViewById(R.id.imageViewEdit);

        backImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ManageAccount.class);
                startActivity(i);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDismiss();
            }
        });
    }
    public void openDismiss(){
        Intent intent = new Intent(this,ManageAccount.class);
        startActivity(intent);
    }
}