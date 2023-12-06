package com.example.servee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class UserRegister4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_register4);


        //Text Field Instance
        TextView user = (TextView)findViewById(R.id.username_userRegister);
        TextView password = (TextView)findViewById(R.id.password_userRegister);

        //Next Button Instance
        Button next = (Button)findViewById(R.id.button);

        // Next Button
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UserRegister4.this,"SIGN UP SUCCESSFUL",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(UserRegister4.this,Home.class);
                startActivity(intent);
            }
        });


    }
}