package com.example.servee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button userButton = (Button) findViewById(R.id.userButton);
        Button serviceProviderButton =(Button) findViewById(R.id.serviceProviderButton);

        userButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //Registration of the User
                Intent intent = new Intent(Register.this, UserRegister1.class);
                startActivity(intent);
            }
        });

        serviceProviderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //Registration of the Service Provider
                Intent intent = new Intent(Register.this,ServiceProviderRegister.class);
                startActivity(intent);
            }
        });
    }
}