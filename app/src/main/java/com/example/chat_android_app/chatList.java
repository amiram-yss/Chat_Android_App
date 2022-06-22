package com.example.chat_android_app;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class chatList extends AppCompatActivity {

    List<chatTile> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_list);

        this.list = new ArrayList<chatTile>();

        this.list.add(new chatTile("ariel"));
        this.list.add(new chatTile("amiram"));
        this.list.add(new chatTile("yasif"));
        this.list.add(new chatTile("Ariel", "14:50", "lol"));
        this.list.add(new chatTile("Amiram", "10:19", "NOOO"));
        this.list.add(new chatTile("Yasif", "09:00", "YESSSS!!!"));
        this.list.add(new chatTile("bbriel", "14:50", "lol"));
        this.list.add(new chatTile("bbmiram", "10:19", "NOOO"));
        this.list.add(new chatTile("bbasif", "09:00", "YESSSS!!!"));
        this.list.add(new chatTile("ffriel", "14:50", "lol"));
        this.list.add(new chatTile("ffmiram", "10:19", "NOOO"));
        this.list.add(new chatTile("ffasif", "09:00", "YESSSS!!!"));
        this.list.add(new chatTile("hhriel", "14:50", "lol"));
        this.list.add(new chatTile("hhmiram", "10:19", "NOOO"));
        this.list.add(new chatTile("hhasif", "09:00", "YESSSS!!!"));
        this.list.add(new chatTile("triel", "14:50", "lol"));
        this.list.add(new chatTile("tmiram", "10:19", "NOOO"));
        this.list.add(new chatTile("tasif", "09:00", "YESSSS!!!"));

        ListView lv = findViewById(R.id.lv_chats);
        ArrayAdapter<chatTile> adapter = new ArrayAdapter<chatTile>(this,
                android.R.layout.simple_list_item_1,
                this.list);

        lv.setAdapter(adapter);

    }


}
