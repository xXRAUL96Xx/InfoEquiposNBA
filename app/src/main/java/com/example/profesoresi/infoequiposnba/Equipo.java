package com.example.profesoresi.infoequiposnba;

/**
 * Created by profesoresi on 23/11/2016.
 */
public class Equipo {
    private String nombre;
    private int anillos;
    private int fundación;
    private String estadio;
    private String [] plantilla;

    public Equipo(String nombre, int anillos, int fundación, String estadio, String[] plantilla) {
        this.nombre = nombre;
        this.anillos = anillos;
        this.fundación = fundación;
        this.estadio = estadio;
        this.plantilla = plantilla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnillos() {
        return anillos;
    }

    public void setAnillos(int anillos) {
        this.anillos = anillos;
    }

    public int getFundación() {
        return fundación;
    }

    public void setFundación(int fundación) {
        this.fundación = fundación;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String[] getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(String[] plantilla) {
        this.plantilla = plantilla;
    }
}
