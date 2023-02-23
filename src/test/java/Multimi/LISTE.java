package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LISTE {

    //In JAVA toate elementele dintr-o multime trebuie sa fie de acelasi fel;
    //Daca vreau sa definesc o multime de String-uri, nu pot introduce si un Intriger -> aia nu are ce cauta acolo!!!;

    @Test
    public void MetodaTest (){
        //MultimeNumeArray();
        //MultimeNumeLista();
        //MultimeValori();
        TariOrase();

    }

    //Array (vectori);
    public void MultimeNumeArray(){
        String[] NumeCursanti = new String[7];
        NumeCursanti[0] = "Timi";
        NumeCursanti[1] = "Alex";
        NumeCursanti[2] = "Liliana";
        NumeCursanti[3] = "Cristi";
        NumeCursanti[4] = "Raul";
        NumeCursanti[5] = "Corina";
        NumeCursanti[6] = "Bogdan";
        for (Integer index = 0; index < NumeCursanti.length; index++){
            System.out.println(NumeCursanti[index]);

        }
    }

    //Lista;
    public void MultimeNumeLista(){
        List<String> NumeCursanti = new ArrayList<>();
        NumeCursanti.add("Timi");
        NumeCursanti.add("Alex");
        NumeCursanti.add("Liliana");
        NumeCursanti.add("Raul");
        for (Integer index = 0; index < NumeCursanti.size(); index++){
            System.out.println(NumeCursanti.get(index));

        }

    }

    //hashmap (se foloseste cand vrei sa definesti un anumit comportament; ex: X valoare face parte din categoria X);
    //key = value (cheie = valoare);

    public void MultimeValori(){
        //fotbal, cana, acadea
        HashMap<String, String> Obiecte = new HashMap<>();
        Obiecte.put("Sport", "fotbal");
        Obiecte.put("Obiect", "cana");
        Obiecte.put("Dulciuri", "acadea");
        for (String Key: Obiecte.keySet()){
            System.out.println(Key+ " " +Obiecte.get(Key));
        }


    }


    //Tari, orase;

    public void TariOrase(){
        List<String> OraseRomania = new ArrayList<>();
        OraseRomania.add("Timisoara");
        OraseRomania.add("Iasi");
        OraseRomania.add("Sibiu");
        OraseRomania.add("Cluj");
        List<String> OraseItalia = new ArrayList<>();
        OraseItalia.add("Roma");
        OraseItalia.add("Milano");
        OraseItalia.add("Naploi");
        OraseItalia.add("Venetia");
        List<String> OraseSpania = new ArrayList<>();
        OraseSpania.add("Barcelona");
        OraseSpania.add("Valencia");
        OraseSpania.add("Madrid");

        HashMap<String,List<String>> Tari = new HashMap<>();
        Tari.put("Romania", OraseRomania);
        Tari.put("Italia", OraseSpania);
        Tari.put("Spania", OraseSpania);
        for (String Key: Tari.keySet()){
            System.out.println(Key+ " " +Tari.get(Key));
        }

    }

}
