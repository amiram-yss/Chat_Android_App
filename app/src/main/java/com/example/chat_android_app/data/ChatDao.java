package com.example.chat_android_app.data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ChatDao {
    @Query("SELECT * FROM chat")
    List<Chat> index();
    @Query("SELECT * FROM chat WHERE chat.id = :id")
    Chat get(int id);

    @Insert
    void insert(Chat c);

    @Update
    void update(Chat c);

    @Delete
    void delete(Chat c);
}
