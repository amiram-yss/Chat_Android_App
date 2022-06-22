package com.example.chat_android_app.data;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class MessageChatRelator {
    @PrimaryKey(autoGenerate = true)
    int id;
}
