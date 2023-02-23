package ObiectConstructor;

import org.testng.annotations.Test;

import java.util.List;

public class MANCARE {

//Constructor = are ca rol sa initalizeze variabilele unei clase;
//Constructorul are mareu acelasi nume cu clasa;
//Intr-o clasa putem sa avem o multime de constructori (delimitati prin numarul de parametri/ tip parametri);
//De cele mai multe ori constructorul este public;
//Daca intr-o calsa nu am declarat un constructor => exista unul by deafault care nu are parametri;

//Obiect = instanta unei clase;
//Dintr-o clasa putem face o multime de obiecte;
//Obiectele se diferentiaza prin numele lor;
//In momentul in care initializam un obiect => se apeleaza constructorul clasei;


    public String Nume;
    public String Descriere;
    public List<String> Ingrediente;
    public Integer Calorii;
    public Boolean DePost;


    //Declaram un constructor cu parametri;
    public MANCARE(String Nume, String Descriere, List<String> Ingrediente, Integer Calorii) {
        this.Nume = Nume;
        this.Descriere = Descriere;
        this.Ingrediente = Ingrediente;
        this.Calorii = Calorii;
    }

    public MANCARE(String nume, String descriere, List<String> ingrediente, Integer calorii, Boolean dePost) {
        Nume = nume;
        Descriere = descriere;
        Ingrediente = ingrediente;
        Calorii = calorii;
        DePost = dePost;
    }

    public void InfoMancare() {
        System.out.println("Numele mancarii este " + Nume);
        System.out.println("Descrierea mancarii este " + Descriere);
        System.out.println("Ingredientele pentru mancare sunt ");
        for (Integer index = 0; index < Ingrediente.size(); index++) {
            System.out.println(Ingrediente.get(index));
        }
        System.out.println("Caloriile pentru mancare sunt " + Calorii);

        if (DePost != null && DePost){
            System.out.println("Mancarea este de post" + DePost);
        }
    }
}
