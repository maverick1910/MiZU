package com.example.mizu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button loginButton;
    Button registerButton;
    Button skipButton;
    EditText name1,phn,pass;
    String name,phnumber,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.loginbtn);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, login.class);
                startActivity(intent);
            }
        });
        registerButton = findViewById(R.id.registerbtn);
        name1 = findViewById(R.id.editText);
        phn = findViewById(R.id.editText2);
        pass = findViewById(R.id.editText3);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast t1 = Toast.makeText(getApplicationContext(),"Enter phone number", Toast.LENGTH_SHORT);
                Toast t2 = Toast.makeText(getApplicationContext(),"Enter password", Toast.LENGTH_SHORT);
                Toast t3 = Toast.makeText(getApplicationContext(),"enter valid phone number", Toast.LENGTH_SHORT);
                Toast t4 = Toast.makeText(getApplicationContext(),"enter name", Toast.LENGTH_SHORT);
                name = name1.getText().toString();
                phnumber = phn.getText().toString();
                password = pass.getText().toString();
                if(name.isEmpty()!=true&&phnumber.isEmpty()!=true&&password.isEmpty()!=true&&phnumber.length()==10)
                {
                    Intent intent = new Intent(MainActivity.this, Address.class);
                    startActivity(intent);
                }
                else {
                    if (phnumber.isEmpty())
                        t1.show();
                    else{
                        if (phnumber.length() != 10)
                        t3.show();
                    }
                    if(password.isEmpty())
                        t2.show();
                    if(name.isEmpty())
                        t4.show();
                }

            }
            });
        skipButton = findViewById(R.id.skipbtn);

        skipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
