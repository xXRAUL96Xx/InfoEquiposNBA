package com.example.profesoresi.infoequiposnba;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by profesoresi on 30/11/2016.
 */
public class EquipoAdapter extends BaseAdapter {
    Context contexto;
    Equipos equipos;

    public EquipoAdapter(Context contexto, Equipos equipos) {
        this.contexto = contexto;
        this.equipos = equipos;
    }

    @Override
    public int getCount() {
        return equipos.getEquipos().length;
    }

    @Override
    public Object getItem(int position) {
        return equipos.getEquipos()[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;
        if (convertView==null){
            convertView = LayoutInflater.from(contexto).inflate(R.layout.item_equipo, null);
            holder = new ViewHolder();
            holder.tvEquipo = (TextView) convertView.findViewById(R.id.tvEquipo);
            holder.tvTitulos = (TextView) convertView.findViewById(R.id.tvTitulos);
            holder.tvEstadio = (TextView) convertView.findViewById(R.id.tvEstadio);

            convertView.setTag(holder);
        } else{
            holder = (ViewHolder) convertView.getTag();
        }

        holder.tvEquipo.setText(equipos.getEquipos()[position].getNombre());
        holder.tvTitulos.setText(""+equipos.getEquipos()[position].getAnillos());
        holder.tvEstadio.setText(equipos.getEquipos()[position].getEstadio());

        return convertView;
    }
    private static class ViewHolder{
        TextView tvEquipo;
        TextView tvTitulos;
        TextView tvEstadio;
    }

}
