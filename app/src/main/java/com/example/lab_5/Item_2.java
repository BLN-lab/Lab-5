package com.example.lab_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Item_2 extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_2);
        textView=findViewById(R.id.texts);
        textView.setText("1-х өдөр:none\n" +
                "2-х өдөр:none\n" +
                "3-х өдөр:Mobile Programming(10:00-12:50)\tWeb Programming II(14:00-17:50)\n" +
                "4-х өдөр:Programming Language Structure(14:00-16:50)\tSoftware Engineering(16:50-17:50)\n" +
                "5-х өдөр:Artificial Intelligence(10:00-12:50)");
    }
}