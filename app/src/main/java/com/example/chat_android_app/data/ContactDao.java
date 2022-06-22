package com.example.chat_android_app.data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;

@Dao
public interface ContactDao {
    @Insert
    void insert();

    @Update
    void update();

    @Delete
    void delete();
}
