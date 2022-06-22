package com.example.chat_android_app.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Chat.class,Contact.class,Message.class, ContactChatRelator.class}, version = 1)
public abstract class AppDb extends RoomDatabase {
    public abstract ChatDao chatDao();
}
