package com.example.lab_5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_option,menu);
        return true;
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.item_1: {
                Intent intent1 = new Intent(this, Item_1.class);
                startActivity(intent1);
            }
            break;
            case R.id.item_2: {
                Intent intent2 = new Intent(this, Item_2.class);
                startActivity(intent2);
            }
            break;
            case R.id.item_3: {
                Intent intent3 = new Intent(this, Item_3.class);
                startActivity(intent3);
            }
            break;
            default:{}break;
        }
        return true;
    }
}