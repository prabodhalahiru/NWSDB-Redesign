package com.example.nwsdb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditAccount extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); //<< this
        setContentView(R.layout.activity_edit_account);

        button = (Button)  findViewById(R.id.btnDismiss);
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