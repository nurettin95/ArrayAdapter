package com.nurettingorsoy.listviewarrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    String ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.textView);

        ad = getIntent().getStringExtra("dil");

        if(ad.equals("Java")){
            textView.setText(ad);
        }
        else if(ad.equals("C#")){
            textView.setText(ad);
        }
        else if(ad.equals("C++")){
            textView.setText(ad);
        }
        else if(ad.equals("JavaScript")){
            textView.setText(ad);
        }
        else if(ad.equals("Swift")){
            textView.setText(ad+"afaf");
        }
        else{
            textView.setText("");
        }







    }
}