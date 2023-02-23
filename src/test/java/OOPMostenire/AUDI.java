package OOPMostenire;

import java.util.List;

public class AUDI extends MASINA{

    public List<String>DotariExterioare;
    public List<String>DotariInterioare;
    public AUDI(String brand, String model, String transmisie, Integer pret,List<String>DotariExterioare, List<String>DotariInterioare) {
        super(brand, model, transmisie, pret);

        this.DotariExterioare = DotariExterioare;
        this.DotariInterioare = DotariInterioare;
    }
    public void InfoAudi(){
        InfoMASINA();
        System.out.println("Dotarile interioare sunt" + DotariInterioare);
        System.out.println("Dotarile interioare sunt" + DotariExterioare);
    }

//Suprascriem metoda de conducere (ca si la Dacia);

    @Override
    public void ConducMasina() {
        System.out.println("Audi-ul se conduce pe dreapta");
        super.ConducMasina();
    }
}




