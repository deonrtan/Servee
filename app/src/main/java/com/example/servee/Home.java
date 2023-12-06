package com.example.servee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    TextView username,password;
    Button loginButton,registerButton;
    DBHandler DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username =(TextView) findViewById(R.id.username);
        password =(TextView) findViewById(R.id.password);

        loginButton = (Button) findViewById(R.id.loginButton);
        registerButton =(Button) findViewById(R.id.registerButton);

        DB = new DBHandler(this);


        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,Register.class);
                startActivity(intent);
                String user = username.getText().toString();
                String pass = password.getText().toString();
            }
        });

        //admin and admin
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    //correct
                    Toast.makeText(Home.this,"LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();

                }
                else{
                    //Incorrect
                    Toast.makeText(Home.this,"LOGIN FAILED",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }


}