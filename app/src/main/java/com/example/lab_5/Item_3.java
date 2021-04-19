package com.example.lab_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Item_3 extends AppCompatActivity {
    TextView TV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_3);
        TV=findViewById(R.id.textView2);
        TV.setText("Study Plan:\n" +
                "Миний нэрийг Б.Билгүүн гэдэг\n" +
                "Маглалгч байх\n" +
                "Программыг хэнээс ч илүү хийдэг байх\n" +
                "Ёс суртхуунлаг байж ямагт бусдаас хуулалгүй суралцах");
    }
}