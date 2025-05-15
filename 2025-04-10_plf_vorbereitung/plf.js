class Person {
    constructor(name, gender, groesseM, gewichtKG){
        if(gender !== "m" && gender !== "f"){
            throw new Error ("Invalid Gender");
        }
        this.name = name;
        this.gender = gender;
        this.groesseM = groesseM;
        this.gewichtKG = gewichtKG;
    }

    toString() {
        const cm = Math.round(this.groesseM * 100);
        return `${this.name} (${cm}cm, ${this.gewichtKG}kg)`;
    }

    getBmi() {
  const bmi = this.gewichtKG / (this.groesseM ** 2);
  return Math.floor(bmi * 100) / 100;
}

vorName() {
  return this.name.split(" ")[0];
}

nachName() {
  return this.name.split(" ")[1];
}

groesseCM() {
  return Math.round(this.groesseM * 100);
}

getGewichtType() {
        const bmi = this.getBmi();

        if (this.gender === 'f') {
            if (bmi < 19) return 'Untergewicht';
            if (bmi <= 24) return 'Normalgewicht';
            return 'Übergewicht';
        } else {
            if (bmi < 20) return 'Untergewicht';
            if (bmi <= 25) return 'Normalgewicht';
            return 'Übergewicht';
        }
    }

     
}
export { Person };
 