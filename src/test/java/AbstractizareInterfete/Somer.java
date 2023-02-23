package AbstractizareInterfete;

public class Somer extends Persoane implements InterfaceSomer {
    public Somer(String nume, String adresa, Integer varsta) {
        super(nume, adresa, varsta);
    }

    @Override
    public void nuMunceste() {
        System.out.println("Somerul refuza sa lucreze");
    }

    @Override
    public void primesteAjutorSocial() {
        System.out.println("Somerul primeste ajutor social de la stat");
    }

    @Override
    public void pierdeVremea() {
        System.out.println("Somerul pierde vremea toata ziua");
    }
}
