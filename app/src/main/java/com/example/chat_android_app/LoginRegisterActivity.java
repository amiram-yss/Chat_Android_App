package com.example.chat_android_app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LoginRegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_register);

        Button btnLog = findViewById(R.id.login_button_Log);
        btnLog.setOnClickListener(v -> {
            EditText etName = findViewById(R.id.username_input_Log);
            EditText etPass = findViewById(R.id.password_input_Log);
            String name = etName.getText().toString();
            String pass = etPass.getText().toString();

            if (name.equals("aaa")
            && pass.equals("bbb")){
                Intent i = new Intent(this, chatList.class);
                startActivity(i);
            }


        });


        Button btnReg = findViewById(R.id.register_toggle_button_Log);

        btnReg.setOnClickListener(v -> {
            Intent i = new Intent(this, register_screen.class);
            startActivity(i);
        });
    }




}