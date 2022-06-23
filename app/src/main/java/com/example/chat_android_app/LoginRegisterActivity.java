package com.example.chat_android_app;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chat_android_app.api.model.ContactModel;
import com.example.chat_android_app.api.model.Login;
import com.example.chat_android_app.api.service.ContactClient;

import java.io.IOException;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoginRegisterActivity extends AppCompatActivity {

    private Retrofit retrofit;
    private String name, pass;
    private ContactClient contactClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_register);

        try {
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://10.0.2.2:5062/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            contactClient = retrofit.create(ContactClient.class);

        }
        catch (Exception e) {
            Log.e("ERR", e.getMessage());
        }



        Button btnLog = findViewById(R.id.login_button_Log);
        btnLog.setOnClickListener(v -> {
            EditText etName = findViewById(R.id.username_input_Log);
            EditText etPass = findViewById(R.id.password_input_Log);
            String name = etName.getText().toString();
            String pass = etPass.getText().toString();

            /*if (name.equals("aaa")
            && pass.equals("bbb")){
                Intent i = new Intent(this, chatList.class);
                startActivity(i);
            }*/
            //index();
            login();


        });


        Button btnReg = findViewById(R.id.register_toggle_button_Log);

        btnReg.setOnClickListener(v -> {
            Intent i = new Intent(this, register_screen.class);
            startActivity(i);
        });
    }

    void index() {
        Call<List<ContactModel>> call = contactClient.index();
        call.enqueue(new Callback<List<ContactModel>>() {
            @Override
            public void onResponse(Call<List<ContactModel>> call, Response<List<ContactModel>> response) {
                List<ContactModel> ls = response.body();
                Toast.makeText(LoginRegisterActivity.this, ls.get(0).getName(), Toast.LENGTH_SHORT);
                Log.e("i", ls.get(0).getName(), null);
            }

            @Override
            public void onFailure(Call<List<ContactModel>> call, Throwable t) {

            }
        });
    }

    void login() {
        Login login = new Login(name, pass);
        Call<ResponseBody> call = contactClient.login(login);

        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    }


}