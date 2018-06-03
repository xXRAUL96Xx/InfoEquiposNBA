package com.example.profesoresi.infoequiposnba;

/**
 * Created by profesoresi on 23/11/2016.
 */
public class Equipos {
    private Equipo[] equipos;

    public Equipos() {
        equipos = new Equipo[4];
        String [] plantilla0 = {"Chris Andersen", "Kevin Love","James Jones", "Kyrie Irving","Mike Dunleavy",
                "Iman Shumpert","JR Smith","Channing Frye", "Jordan McRae",
                "Tristan Thompson", "DeAndre Liggins", "Kay Felder", "LeBron James", "Richard Jefferson", "Mo Williams"};
        equipos[0]= new Equipo("Cleveland Cavaliers",1, 1967,"Quicken Loans Arena",
                plantilla0);
        String [] plantilla1 = {"Ian Clark","Stephen Curry","Kevin Durant",
                "Draymond Green","Andre Iguodala","Damian Jones","Shaun Livingston",
                "Kevon Looney","James Michael McAdoo","Patrick McCaw","JaVale McGee",
                "Zaza Pachulia","Klay Thompson","Anderson Varejao","David West"};
        equipos[1]= new Equipo("Golden State Warriors",4, 1946,"Oracle Arena",
                plantilla1);
        String [] plantilla2 = {"LaMarcus Aldridge","Kyle Anderson","Davis Bertans",
                "Dewayne Dedmon","Bryn Forbes","Pau Gasol","Manu Ginobili","Danny Green",
                "Nicolas Laprovittola","David Lee","Kawhi Leonard","Patty Mills",
                "Dejounte Murray","Tony Parker","Jonathon Simmons"};
        equipos[2]= new Equipo("San Antonio Spurs",5, 1967,"AT&T Center",
                plantilla2);
        String [] plantilla3 = {"Alex Abrines","Steven Adams","Semaj Christon",
                "Nick Collison","Jerami Grant","Josh Huestis","Enes Kanter",
                "Joffrey Lauvergne","Anthony Morrow","Victor Oladipo",
                "Andre Roberson","Domantas Sabonis","Kyle Singler",
                "Russell Westbrook"};
        equipos[3]= new Equipo("Oklahoma City Thunder",1, 1967,"Chesapeake Energy Arena",
                plantilla3);

    }

    public Equipo[] getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipo[] equipos) {
        this.equipos = equipos;
    }
}
