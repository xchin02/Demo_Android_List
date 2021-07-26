package com.example.id20001695.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<AndroidVersion> al;
    //ArrayAdapter<AndroidVersion> aa;
    AndroidVersion item;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);

        al = new ArrayList<>();
        AndroidVersion item = new AndroidVersion("Pie", "9.0");
        al.add(item);
        al.add(new AndroidVersion("Cookie", "2.00"));
        al.add(new AndroidVersion("Nugget", "3.00"));
        //aa = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, al);
        //lv.setAdapter(aa);


        adapter = new CustomAdapter(this, R.layout.row, al);

        lv.setAdapter(adapter);
    }
}