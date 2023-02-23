package AbstractizareInterfete;

public class RestaurantCarne extends Restaurant implements InterfacerRestaurantCarne{
    public RestaurantCarne(String denumire, String felPrincipal, Integer numarStele) {
        super(denumire, felPrincipal, numarStele);
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
