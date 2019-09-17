package com.example.mizu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class confirmaddress extends AppCompatActivity {
    Button addaddressButton;
    Button savedaddressButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmaddress);

        addaddressButton = findViewById(R.id.newadd);

        addaddressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(confirmaddress.this, NewAddress.class);
                startActivity(intent);
            }
        });
        savedaddressButton = findViewById(R.id.saveadd);

        savedaddressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(confirmaddress.this, Payment.class);
                startActivity(intent);
            }
        });
    }
}
