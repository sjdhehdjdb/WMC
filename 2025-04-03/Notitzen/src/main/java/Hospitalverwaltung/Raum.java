package Hospitalverwaltung;

import java.util.LinkedList;

public class Raum {
  private String raum;
  private int capacity;

    public Raum(String raum, int capacity) {
        this.raum = raum;
        this.capacity = capacity;
    }


    public String getRaum() {
        return raum;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) throws HospitalException {
        if(capacity >= 1){
            this.capacity = capacity;
        }
        else {
            throw new HospitalException("Fehler ungeltige zahl!");
        }

    }

    public void setRaum(String raum) throws HospitalException {
        if(raum != null && !raum.isBlank()){
            this.raum = raum;
        }
        else {
            throw new HospitalException("Fehler raum name kann nicht leer sein!");
        }
    }
}