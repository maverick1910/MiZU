package com.example.mizu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Payment extends AppCompatActivity {
    Button newcardButton;
    Button savedcardButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        newcardButton = findViewById(R.id.newcardbtn);

        newcardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Payment.this, NewCard.class);
                startActivity(intent);
            }
        });
        savedcardButton = findViewById(R.id.savedcardbtn);

        savedcardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Payment.this, bookingconfirmation.class);
                startActivity(intent);
            }
        });
    }
}
