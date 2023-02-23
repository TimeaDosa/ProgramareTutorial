package TemaAbstractizareInterfete;

public class SportHandball extends Sport implements InterfaceHandball{
    public SportHandball(String nume, String talent, Integer varsta) {
        super(nume, talent, varsta);
    }

    @Override
    public void ceFoloseste() {
        System.out.println("Foloseste o minge de dimensiuni reduse");
    }

    @Override
    public void undeJoaca() {
        System.out.println("Se joaca intr-o sala de sport");
    }

    @Override
    public void cineJoaca() {
        System.out.println("Poate juca persoanele carora le place acest sport");

    }
}
