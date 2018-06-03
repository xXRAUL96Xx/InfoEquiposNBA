package com.example.profesoresi.infoequiposnba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    Equipos equipos = new Equipos();
    ListView lvEquipos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvEquipos = (ListView)findViewById(R.id.listViewEquipos);
        EquipoAdapter adapter = new EquipoAdapter(this,equipos);
        lvEquipos.setAdapter(adapter);
        lvEquipos.setOnItemClickListener(this);
    }




    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Equipo e = equipos.getEquipos()[position];
        Intent i = new Intent(this,PlantillaActivity.class);
        i.putExtra("PLANTILLA",e.getPlantilla());
        startActivity(i);
    }
}
