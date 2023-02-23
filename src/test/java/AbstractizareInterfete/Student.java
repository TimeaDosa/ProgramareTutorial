package AbstractizareInterfete;

public class Student extends Persoane implements InterfaceStudent{
    public Student(String nume, String adresa, Integer varsta) {
        super(nume, adresa, varsta);
    }

    @Override
    public void invata() {
        System.out.println("Studentul invata");
    }

    @Override
    public void doarme() {
        System.out.println("Studentul doarme");
    }

    @Override
    public void primesteBursa() {
        System.out.println("Studentul invata si primeste bani");
    }
}
