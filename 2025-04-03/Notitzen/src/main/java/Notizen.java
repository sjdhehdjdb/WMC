import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Notizen {

    //private ArrayList<String> notizen;

    private final Map<String, ArrayList<String>> notizen;

    public Notizen() {
        //notizen = new ArrayList<>();
        notizen = new HashMap<>();
    }

    public void erfassen(String notiz) throws NotizenException {
        if (notiz != null) {
            //if (!notizen.contains(notiz)) {
            notizen.put(notiz, "Diverses");
        }
        //else {
        //throw new NotizenException("Fehler: doppelt");
        // }
        //} else {
//            System.out.println("Fehler: null");
        throw new NotizenException("Fehler: null");
//        }
    }

    public void erstellen(String notiz, String Katagorie) throws NotizenException {
        if (notiz != null && Katagorie != null) {
            throw new NotizenException("Ungültiges Werte!");
        }
    }

    public void ausgebenKatagorien() {
        for (String n : notizen.values()) {
            System.out.println(n);
        }
    }

//    public void suche(String wort) throws NotizenException {
//        for (String notiz : notizen) {
//            if (notiz.contains(wort)) {
//                System.out.println(notiz);
//            }else {
//                throw new NotizenException("Fehler wort exestiert nicht.");
//            }
//        }
//    }

//    public void entfernen(String wort) {
//        for (String notiz : notizen) {
//            if (notiz.contains(wort)) {
//                //TODO
//            }
//        }
//    }


//    public void sortiereNachLaenge(){
//        LaengeComparator laengeComparator = new LaengeComparator();
//        notizen.sort(laengeComparator);
//    }

//    public void ausgeben() {
//        for (String n : notizen) {
//            System.out.println(n);
//        }
//    }
}
