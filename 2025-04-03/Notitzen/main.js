
export class Notizen {

    #notizen 

    constructor() {
        this.#notizen = new Map();
    }

    erfassen(notiz) {
        if (!notiz) {  
            throw new Error("Fehler: null");
        }
        const Katagorie = "Diverses";
        let liste = this.#notizen.get(Katagorie);
        if(!liste){
            liste = [];
            this.#notizen.set(Katagorie, liste);
        }
            liste.push(notiz);
        }
        
    
    

  erstellen( notiz, Katagorie) {
        if (!notiz || !Katagorie) {
            throw new Error("Fehler: Null");
        }
        if(!this.#notizen.has(Katagorie)){
            this.#notizen.set(Katagorie, []);

        }
        this.#notizen.get(Katagorie).push(notiz);
    }

    ausgebenKatagorien() {
        this.#notizen.keys().array.forEach(element => {
            
        });
    }

    ausgeben() {
        this.#notizen.keys().forEach((k) => {
            console.log(`Kategorie: ${k}`);
            const liste = this.#notizen.get(k);
            liste.forEach((n) => {
                console.log(`  ${n}`);
            });
        });
    }



}
