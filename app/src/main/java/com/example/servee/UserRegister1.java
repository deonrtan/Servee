package com.example.servee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class UserRegister1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_register1);
    TextView haveAccount=(TextView) findViewById(R.id.haveAccount);
        Button next = (Button)findViewById(R.id.button);

        // Already Have an Account Button
    haveAccount.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(UserRegister1.this,Home.class);
            startActivity(intent);
        }
    });

        // Next Button
    next.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(UserRegister1.this,UserRegister2.class);
            startActivity(intent);
        }
    });
    }



}