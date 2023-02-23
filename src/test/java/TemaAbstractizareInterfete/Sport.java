package TemaAbstractizareInterfete;

public class Sport {
    private String nume;
    private String talent;
    private Integer varsta;

    public Sport(String nume, String talent, Integer varsta) {
        this.nume = nume;
        this.talent = talent;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getTalent() {
        return talent;
    }

    public void setTalent(String talent) {
        this.talent = talent;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }
}
