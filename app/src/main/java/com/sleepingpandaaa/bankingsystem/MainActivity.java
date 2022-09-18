package com.sleepingpandaaa.bankingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnViewUsers;
    private Button btnViewTransactions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnViewUsers = findViewById(R.id.btnViewUsers);
        btnViewTransactions=findViewById(R.id.btnViewTransaction);
        btnViewUsers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Userlist.class));
            }
        });

        btnViewTransactions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,HistoryList.class));
            }
        });

    }
}