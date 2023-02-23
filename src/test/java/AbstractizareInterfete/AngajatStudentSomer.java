package AbstractizareInterfete;

public class AngajatStudentSomer extends Persoane implements InterfaceStudent, InterfaceAngajat, InterfaceSomer{
    public AngajatStudentSomer(String nume, String adresa, Integer varsta) {
        super(nume, adresa, varsta);
    }

    @Override
    public void munceste() {
        System.out.println("Angajatul Student munceste si invata");
    }

    @Override
    public void primesteSalar() {
        System.out.println("Angajatul Student primeste si bani");
    }

    @Override
    public void mergeAcasa() {
        System.out.println("Angajatul Student merge si acasa");
    }

    @Override
    public void invata() {
        System.out.println("Angajatul Student mai si invata");
    }

    @Override
    public void doarme() {
        System.out.println("Angajatul Student mai si doarme");
    }

    @Override
    public void primesteBursa() {
        System.out.println("Angajatul Student primeste bursa de merit");
    }

    @Override
    public void nuMunceste() {
        System.out.println("Somerul Student nu munceste si nu invata");
    }

    @Override
    public void primesteAjutorSocial() {
        System.out.println("Somerul Student primeste ajutor social de la stat");
    }

    @Override
    public void pierdeVremea() {
        System.out.println("Somerul Student pierde vremea aiurea");
    }
}
