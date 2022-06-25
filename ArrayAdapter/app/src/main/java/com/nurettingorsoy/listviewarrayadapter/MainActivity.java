package com.nurettingorsoy.listviewarrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<String> adapter;
    String[] diller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diller = new String[5];
        diller[0] = "Java";
        diller[1] = "C#";
        diller[2] = "C++";
        diller[3] = "JavaScript";
        diller[4] = "Swift";


        adapter = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,diller);

        listView = findViewById(R.id.listView);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("dil",diller[position]);
                startActivity(intent);

            }
        });

    }
}