package at.aaron_frick.swp.AufgabenKW2.Nachmittag.Aufgabe_2;


import java.util.ArrayList;
import java.util.List;

public class PeopleTransporter {

    private List<sitz> sitze;


    public PeopleTransporter(int anzahl, String farbe, Boolean hatGurt){
        sitze = new ArrayList<>();
        for (int i = 0; i < anzahl; i++) {
            sitze.add(new sitz(farbe, hatGurt));
        }

        }

        public int getSitze()

    }

