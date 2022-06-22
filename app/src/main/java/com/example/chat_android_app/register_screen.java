package com.example.chat_android_app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class register_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_screen);

        Button btnLog = findViewById(R.id.login_toggle_button_Reg);

        btnLog.setOnClickListener(v -> {
            Intent i = new Intent(this, LoginRegisterActivity.class);
            startActivity(i);
        });
    }
}