package OOPMostenire;

public class BMW extends MASINA {

    public Boolean Semnalizare;

    public BMW(String brand, String model, String transmisie, Integer pret, Boolean Semnalizare) {
        super(brand, model, transmisie, pret);
        this.Semnalizare = Semnalizare;
    }

    public void InfoBMW() {
        InfoMASINA();
        System.out.println("Are semnalizare?" + Semnalizare);
    }

    //Polimorfism Static;
    public void AfisareMasina() {
        System.out.println("Polimorfism fara parametrii");
    }

    public void AfisareMasina(String Valoare) {
        System.out.println("Polimorfism fara parametrii");
    }

    public void AfisareMasina(Integer Valoare) {
        System.out.println("Polimorfism fara parametrii");
    }
}
