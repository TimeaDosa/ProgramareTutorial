package OOPMostenire;

public class MASINA {

//OOP = Object Oriented Programing (Programare Orientat Obiect);
//4 concepte = MOSTENIRE, ABSTRACTIZARE, CAPSULARE, POLIMORFISM;

//MOSTENIRE = conceptul prin care o clasa mosteneste o alta clasa (Bunicii <- Nepoti);
//Clasa care mosteneste (nepotii) se numeste clasa copil;
//Clasa acre este mostenita (bunicii) se numeste clasa parinte
//Mostenirea se face cu cuv. extends;
//In JAVA o clasa poate sa mosteneasca o singura clasa;
//In PHYTON poti mosteni mai multe clase;
//In momentul in care o clasa mosteneste o alta clasa trebuie sa apelam constructarul din parinte;
//In momentul in care o clasa mosteneste o alta clasa -> putem accesa orice variabila/ metoda din clasa parinte;


//Aplicam conceptia de incapsularea datlor;
//Incapsularea datelor = conceptul prin care tine departe de exterior valorilor pe care nu vrem sa le modificam;
//Cand favem o clasa cu variabile nu mai facem cu public ci cu private;
//Private = acces control care restrictioneaza vizibilitatea variabile la nivel de clasa unde este declarata;
//Ca sa accesam / modificam valorile unor varibile private ne folosim de conceptul get si set;

//Polimorfismul= conceptul prin care o metoda poate avea mai multe forme: Dinamic si Static;
//Polimorfism este de 2 tipuri: Dinamic (Override) si Static (Overload);
//Polimorfism dinamic: intr-o ierarhie de clase obtinute prin mostenire o metoda poate avea mai multe implementari;
//Polimorfism dinamic se aplica mereu cu mostenirea;
//Polimorfism static: o metoda se poata diferentia prin numarul sau tipul parametrilor;



    private String Brand;
    private String Model;
    private String Transmisie;
    private Integer Pret;

    public MASINA(String brand, String model, String transmisie, Integer pret) {
        Brand = brand;
        Model = model;
        Transmisie = transmisie;
        Pret = pret;
    }

    //Get si Set;
    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setTransmisie(String transmisie) {
        Transmisie = transmisie;
    }

    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public String getTransmisie() {
        return Transmisie;
    }

    public Integer getPret() {
        return Pret;
    }

    public void InfoMASINA(){
        System.out.println("Brandul este " + Brand);
        System.out.println("Modelul este " + Model);
        System.out.println("Transmisia este " + Transmisie);
        System.out.println("Pretul este " + Pret);
    }

//Polimorfism Dinamic - exemplu;

    public void ConducMasina(){
        System.out.println("Masina se poate conduce ");
    }

}
