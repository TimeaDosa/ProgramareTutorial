package AbstractizareInterfete;

public class Angajat extends Persoane implements InterfaceAngajat {


    public Angajat(String nume, String adresa, Integer varsta) {
        super(nume, adresa, varsta);
    }

    @Override
    public void munceste() {
        System.out.println("Angajatul munceste");
    }

    @Override
    public void primesteSalar() {
        System.out.println("Angajatul primeste salar");
    }

    @Override
    public void mergeAcasa() {
        System.out.println("Angajatul merge acasa");
    }
}
