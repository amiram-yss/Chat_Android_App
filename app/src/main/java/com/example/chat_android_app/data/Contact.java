package com.example.chat_android_app.data;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity
public class Contact {
    public void setId(String id) {
        this.id = id;
    }

    @PrimaryKey(autoGenerate = true)
    private String id;
    private String name;
    private String server;
    private String last;

    public void setLastDate(long lastDate) {
        this.lastDate = lastDate;
    }

    private long lastDate;
    private String password;

    public Contact(){
    }

    public Contact(String id, String name, String server, String last, Date lastDate) {
        this.id = id;
        this.name = name;
        this.server = server;
        this.last = last;
        this.lastDate = lastDate.getTime();
    }

    public Contact(String id, String name, String server, String last, Date lastDate, String password) {
        this.id = id;
        this.name = name;
        this.server = server;
        this.last = last;
        this.lastDate = lastDate.getTime();
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public long getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate.getTime();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
