package com.example.jamstars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    public ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listview);
        addItems(listView);


    }

    public void addItems(ListView starList){
        String[] starNames = new String[] {
                "Ricardo Fuller",
                "Mike McCallum",
                "Andre Russell",
                "Trevor Berbick",
                "Asafa Powell",
                "Chris Gayle",
                "Yohan Blake",
                "Shelly-Ann Fraser-Pryce",
                "Veronica Campbell Brown",
                "Usain Bolt"
        };

        ArrayAdapter <String> adapter = new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1, starNames);

        starList.setAdapter(adapter);
    }


}