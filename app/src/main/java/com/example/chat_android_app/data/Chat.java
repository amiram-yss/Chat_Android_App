package com.example.chat_android_app.data;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Chat {
    @PrimaryKey(autoGenerate = true)
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    private String Name;

    public void setName(String name) {
        Name = name;
    }

    public Chat() {
        Name = ".";
    }

    public Chat(String name) {
        Name = name;
    }

    public Chat(int id, String name) {
        this.id = id;
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public int getId() {
        return id;
    }
}
