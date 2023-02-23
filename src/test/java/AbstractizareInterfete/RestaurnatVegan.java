package AbstractizareInterfete;

public class RestaurnatVegan extends Restaurant implements InterfaceRestaurantVegan{
    public RestaurnatVegan(String denumire, String felPrincipal, Integer numarStele) {
        super(denumire, felPrincipal, numarStele);
    }

    @Override
    public void cresteLegume() {
        System.out.println("Acest restaurant cultiva legume");
    }

    @Override
    public void cumparaZarzavat() {
        System.out.println("Acest restaurant cumpara zarzavat pentru uz interen");
    }

    @Override
    public void preparaLegume() {
        System.out.println("Acest restaurant preoara legumne");
    }
}
