package com.example.chat_android_app.api.service;

import com.example.chat_android_app.api.model.ContactModel;
import com.example.chat_android_app.api.model.Login;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ContactClient {
    @POST("Login")
    Call<ResponseBody> login(@Body Login login);

    @GET("allContacts")
    Call<List<ContactModel>> index();

    @GET("secretinfo")
    Call<List<ResponseBody>> getSecret(@Header("Authorization") String authToken);

}
