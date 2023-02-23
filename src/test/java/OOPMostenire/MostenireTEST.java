package OOPMostenire;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class MostenireTEST {

    @Test

    public  void MetodaTest(){
  //Facem un obiect Dacia
        System.out.println("==obiectDacia==");
        List<String> DotariExterioareLogan = Arrays.asList("Geamuri electrice", "Aer conditionat");
        DACIA Logan = new DACIA("Dacia", "Logan", "Mannuala", 10000, "Alb Metalizat", DotariExterioareLogan);
        Logan.InfoDacia();
        Logan.CalcPretFinal();
        Logan.getBrand();
        Logan.ConducMasina();

        List<String> DotariExterioareSandero = Arrays.asList("Incalzire in volan", "Radio");
        DACIA Sandero = new DACIA("Dacia", "Sandero", "Automata", 13500, "negru", DotariExterioareSandero);
        Sandero.InfoDacia();

        List<String> DotariExterioareDokker = Arrays.asList("Aerbag", "Aer conditionat");
        DACIA Dokker = new DACIA("Dacia", "Dokker", "Manuala", 26000, "alb", DotariExterioareDokker);
        Dokker.InfoDacia();


        System.out.println("==obiectAudi==");
        List<String> DotariExterioareA3 = Arrays.asList("Geamuri electrice", "Aer conditionat");
        List<String> DotariInterioareA3 = Arrays.asList("Geamuri electrice", "Aer conditionat");
        AUDI A3= new AUDI("Audi", "A3", "Manuala",45000, DotariExterioareA3,DotariInterioareA3);
        A3.InfoAudi();
        A3.ConducMasina();

        List<String> DotariExterioareQ5 = Arrays.asList("Geamuri electrice", "Aer conditionat");
        List<String> DotariInterioareQ5 = Arrays.asList("Geamuri electrice", "Aer conditionat");
        AUDI Q5= new AUDI("Audi", "Q5", "Manuala",60000, DotariExterioareQ5,DotariInterioareQ5);
        Q5.InfoAudi();


        System.out.println("==obiectBMW==");
        List<String> DotariExterioarei7 = Arrays.asList("Geamuri electrice", "Aer conditionat");
        List<String> DotariInterioarei7 = Arrays.asList("Geamuri electrice", "Aer conditionat");
        BMW i7= new BMW("BMW", "i7", "Manuala",45000, true);
        i7.InfoBMW();
        i7.AfisareMasina("electric");
        i7.AfisareMasina(123);
    }
}
