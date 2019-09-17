package com.example.mizu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    Button login2Button;
    Button rh;
    String phone,password;
    EditText ph,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login2Button = findViewById(R.id.login2btn);
        ph = findViewById(R.id.editText5);
        pass = findViewById(R.id.editText6);

        login2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast t1 = Toast.makeText(getApplicationContext(),"Enter phone number", Toast.LENGTH_SHORT);
                Toast t2 = Toast.makeText(getApplicationContext(),"Enter password", Toast.LENGTH_SHORT);
                Toast t3 = Toast.makeText(getApplicationContext(),"enter valid phone number", Toast.LENGTH_SHORT);
                phone = ph.getText().toString();
                password = pass.getText().toString();
                if(phone.isEmpty()!=true&&password.isEmpty()!=true&&phone.length()==10) {
                    Intent intent = new Intent(login.this, Main2Activity.class);
                    startActivity(intent);
                }
                else {
                    if (phone.isEmpty())
                        t1.show();
                    else
                    {
                        if(phone.length()!=10)
                            t3.show();
                    }
                    if(password.isEmpty())
                        t2.show();

                }
            }
        });
        rh = findViewById(R.id.button4);

        rh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
