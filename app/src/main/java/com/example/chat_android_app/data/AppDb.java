package com.example.chat_android_app.data;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

@Database(entities = {Chat.class,Contact.class,Message.class,MessageChatRelator.class}, version = 1)
public abstract class AppDb extends RoomDatabase {
    public abstract ChatDao chatDao();
}
