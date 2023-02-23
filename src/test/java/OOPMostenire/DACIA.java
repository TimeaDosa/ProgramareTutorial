package OOPMostenire;

import net.bytebuddy.agent.builder.AgentBuilder;

import java.sql.SQLOutput;
import java.util.List;

 public class DACIA extends MASINA{


    private String Culoare;
    private List<String> DotariExterioare;

     public String getCuloare() {
         return Culoare;
     }

     public void setCuloare(String culoare) {
         Culoare = culoare;
     }

     public List<String> getDotariExterioare() {
         return DotariExterioare;
     }

     public void setDotariExterioare(List<String> dotariExterioare) {
         DotariExterioare = dotariExterioare;
     }

     public DACIA(String brand, String model, String transmisie, Integer pret, String Culoare, List<String> DotariExterioare) {
//Super= apeleaza constructorul din clasa parinte;
        super(brand, model, transmisie, pret);
        this.Culoare= Culoare;
        this.DotariExterioare= DotariExterioare;
    }

    public void InfoDacia(){
        InfoMASINA();
        System.out.println("Culoarea este " + Culoare);
        System.out.println("Dotari Exterioare " + DotariExterioare);
    }

    public void CalcPretFinal(){
        Integer PretFinal;
        if(Culoare.contains("Metalizat")){
         PretFinal = getPret() + 500;
        }else {
            PretFinal = getPret() + 200;
            }

//Calculam pretul pe baza dotarilor;
        for (String Dotare: DotariExterioare){
            switch (Dotare){
                case "Geamuri electrice":
                    PretFinal = PretFinal + 200;
                    break;
                case "Aer conditionat":
                    PretFinal = PretFinal + 500;
                    break;
                case "Radio":
                    PretFinal = PretFinal + 10000;
                    break;
            }
        }
        System.out.println("Pretul final al masinii:" + PretFinal);
    }
//Suprascriu metoda din parinte;
     public void ConducMasina(){
         System.out.println("Dacia se poate conduce pe volan pe stanga");
         super.ConducMasina();
     }
 //model cand aplici intr-un copil polimorfismul dinamic si static
     //switch (getModel()){
         //case "Logan":
             //System.out.println("Loganul de conduce pe stanga");
             //break;
        //case "Sandero":
             //System.out.println("Sandero de conduce pe dreapta");
             //break;
}
