package TemaAbstractizareInterfete;

public class SportFotbal extends Sport implements InterfaceFotbal{
    public SportFotbal(String nume, String talent, Integer varsta) {
        super(nume, talent, varsta);
    }

    @Override
    public void echipaUndeJoaca() {
        System.out.println("Joaca la echpa Test");
    }

    @Override
    public void ceFoloseste() {
        System.out.println("Foloseste o minge");
    }

    @Override
    public void salar() {
        System.out.println("Are salar mare");
    }
}
