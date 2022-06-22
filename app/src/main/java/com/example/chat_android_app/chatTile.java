package com.example.chat_android_app;

public class chatTile {

    private String name;
    private String lastTime = "00:00";
    private String lastMessage = "";

    public chatTile(String name) {
        this.name = name;
    }

    public chatTile(String name, String lastTime, String lastMessage) {
        this.name = name;
        this.lastTime = lastTime;
        this.lastMessage = lastMessage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastTime() {
        return lastTime;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    @Override
    public String toString() {
        return name + '\n' +
                lastTime + '\t' +
                lastMessage;
    }
}
