package AccessControll2;

import AccessControl.Sport;

public class Tenis extends Sport {

    public void metoda(){
        Sport sport = new Sport();
        sport.metodaPublica();

    //deducem faptul ca, protected ii vizibil la conceptul de mostenire daca avem clase in acelasi pachet sau pachet diferit
    //insa daca vorbim de conceptul de obiect in momentul in care iesim din afara pachetului protected nu mai este vizibil;



    }
}
