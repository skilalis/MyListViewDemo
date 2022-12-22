package com.example.mylistviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listViewId);

        String[] countryNames = getResources().getStringArray(R.array.country_names);
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(MainActivity.this,R.layout.sample_view,R.id.textViewId,countryNames);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = countryNames[position];
                Toast.makeText(MainActivity.this, value + " " +position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}