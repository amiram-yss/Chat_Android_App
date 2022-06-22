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

        ListView lv = findViewById(R.id.lv_chats);
        ArrayAdapter<chatTile> adapter = new ArrayAdapter<chatTile>(this,
                android.R.layout.simple_list_item_1,
                this.list);

        lv.setAdapter(adapter);

    }





}
