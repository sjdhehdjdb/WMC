package Hospitalverwaltung;

import java.time.Year;

public class Mensch {
    private String name;
    private int geburtsjahr;
    private int geld;

    //------------------------------------ getter ------------------------

    public int getGeld() {
        return geld;
    }

    public String getName() {
        return name;
    }

    public int getGeburtsjahr() {
        return geburtsjahr;
    }

    //------------------------------------ setter ------------------------

    public void setGeld(int geld) throws HospitalException {;
        if(geld > 1000){
            this.geld = geld;
        }else {
            throw new HospitalException("Muss größer 1000 sein!");
        }
    }

    public void setGeburtsjahr(int geburtsjahr) throws HospitalException {
        if (geburtsjahr >= 1920 && geburtsjahr <= 2006) {
            this.geburtsjahr = geburtsjahr;
        } else {
            throw new HospitalException("Fehler: Unrealistische Alter oder bist unter 18!");
        }
    }

    public void setName(String name) throws HospitalException {
        if (name != null && !name.isBlank()) {
            this.name = name;
        } else {
            throw new HospitalException("Fehler: Name muss nicht leer sein!");
        }
    }



    public int BerechneAlter() {
        return geburtsjahr - Year.now().getValue();
    }


    public double geldAusgeben(int amountToGo) throws HospitalException {
    if (amountToGo < geld && amountToGo > 0){
        geld =  geld - amountToGo;
    }else {
        throw new HospitalException("Die wert muss keiner als vorhandene geld oder großer 0 sein!");
    }
    return geld;
    }


    public double geldBekommen(int amountToCome) throws HospitalException {
        if (amountToCome > 0){
            geld =  geld + amountToCome;
        }else {
            throw new HospitalException("Die wert muss großer 0 sein!");
        }
        return geld;
    }
}