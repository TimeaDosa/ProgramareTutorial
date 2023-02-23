package AbstractizareInterfete;

public class Persoane {

    //Abstractizare = coceptul prin care definim com portamnetul unei clase;
    // Acest concept se poate realiza in JAVA cu interfete sau clase abstracte;
    // Interfata = colectie de metode care sunt doar abstracte (nu au body);
    //Recunostem o interfat dupa cuvantul Interface;
    //Intr-o interfata nu avem un constructor -> nu putem face un obiect;
    //Clasa care implementeaza interfata -> trebuie sa implementeze toate metodele interfetei;
    //O clasa abstracta poate sa implementeze o interfata;
    //O clasa poate sa implementeze in interfete
    //O interfata poate sa mosteneasca o alta interfata;
    //Toata metodele dintr=o interfata sunt publice;

    private String nume;
    private String adresa;
    private Integer varsta;

    public Persoane(String nume, String adresa, Integer varsta) {
        this.nume = nume;
        this.adresa = adresa;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }
}
