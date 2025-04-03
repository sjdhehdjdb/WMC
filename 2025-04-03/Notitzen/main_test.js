import { assertEquals } from "@std/assert";
import { Notitzen } from "./main.js";

Deno.test(function addTest(){

})


Deno.test(function fehler_leer0(){
  const notizen = new Notizen();
  try {
    notizen.erfassen("Brot kaufen");
} catch (e) {
    console.log(e.message);
}
notizen.ausgeben();
});


Deno.test (function felher_leer1(){
    const notizen = new Notizen();
   
        notizen.erfassen("Brot kaufen");
        notizen.erfassen("Brot 1 kaufen");
        notizen.erfassen("Brot 2 kaufen");
        notizen.ausgeben(Katagorie);
    } );
    


    Deno.test (function felher_leer2_null(){
        const notizen = new Notizen();
        try {
            notizen.erfassen("Brot kaufen");
            notizen.erfassen("Brot 1 kaufen");
            notizen.erfassen("Brot 2 kaufen");
            notizen.ausgeben(Katagorie);

            notizen.erfassen(null);
            throw new Error ("Fheler: Notiz darf nicht null sein!")

        } catch (e) {
            console.log(`Alles Gut: Null erfassen warf einen Fehler: ${e.message}`);
        }
       notizen.ausgeben(Katagorie);
    });

Deno.test (function fehler_leer3() {
    const notizen = new Notizen();
    notizen.erstellen("Brot kaufen");
    notizen.erstellen("Brot 1 kaufen");
    notizen.erstellen("Brot 2 kaufen");
    notizen.erstellen("Javascript lernen", "Programmirerung");
    notizen.ausgeben();
});