package com.roman.tihai.lab022challenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ListItems extends AppCompatActivity {
    private TextView sendItemBread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_items);
        sendItemBread = findViewById(R.id.item);
    }

    public void sendBread(View view) {
    }
}
