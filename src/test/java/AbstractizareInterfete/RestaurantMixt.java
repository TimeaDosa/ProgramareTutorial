package AbstractizareInterfete;

public class RestaurantMixt extends Restaurant implements InterfaceRestaurantVegan, InterfacerRestaurantCarne{
    public RestaurantMixt(String denumire, String felPrincipal, Integer numarStele) {
        super(denumire, felPrincipal, numarStele);
    }

    @Override
    public void cresteLegume() {
        System.out.println("Acest restaurant cultiva legume ");
    }

    @Override
    public void cumparaZarzavat() {
        System.out.println("Acest restaurant cumpara zarzavat pentru uz interen");
    }

    @Override
    public void preparaLegume() {
        System.out.println("Acest restaurant preoara legumne");
    }

    @Override
    public void cumparaCarne() {
        System.out.println("Cumpara carne pentru preparat");
    }

    @Override
    public void cresteAnimale() {
        System.out.println("Creste animale pentru productie proprie");
    }

    @Override
    public void preparaCarne() {
        System.out.println("Prepara carnea pentru gratar");

    }
}
