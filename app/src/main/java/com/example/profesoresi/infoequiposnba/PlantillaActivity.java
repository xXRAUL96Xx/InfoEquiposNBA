package com.example.profesoresi.infoequiposnba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PlantillaActivity extends AppCompatActivity {
    ListView listView;
    String [] plantilla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plantilla);
        listView = (ListView) findViewById(R.id.listView);
        Intent i = getIntent();
        plantilla = i.getStringArrayExtra("PLANTILLA");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,plantilla);
        listView.setAdapter(adapter);
    }
}
