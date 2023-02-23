package ObiectConstructor;

import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MancareTEST {

    @Test

    public void MetodaTest(){
//Declaram un obiect de tipul "x";
        List<String> IngredienteSupaPui = Arrays.asList("apa", "morcovi", "pui", "taitei");
        MANCARE SupaPui = new MANCARE("Supa de Pui", "Supa de casa", IngredienteSupaPui, 300);
        SupaPui.InfoMancare();

        List<String> IngredienteSarmale = Arrays.asList("sare", "varza", "carne", "orez");
        MANCARE Sarmale = new MANCARE("Sarmale", "Traditionale", IngredienteSarmale, 3000);
        Sarmale.InfoMancare();

        List<String> IngredienteSarmalePost = Arrays.asList("sare", "varza", "ciuperci", "orez");
        MANCARE SarmalePost = new MANCARE("SarmalePost", "Traditionale", IngredienteSarmalePost, 400);
        SarmalePost.InfoMancare();
    }
}
