package ObiectConstructor;

import java.util.Arrays;
import java.util.List;

public class TELEFON {


    public String Brand;
    public String Model;
    public Integer AnFabricatie;
    public  String SistemOperare;
    public List<String> Caracterisitici;
    public Double Pret;

    public TELEFON(String brand, String model, Integer anFabricatie, String sistemOperare, List<String> caracterisitici, Double pret) {
        Brand = brand;
        Model = model;
        AnFabricatie = anFabricatie;
        SistemOperare = sistemOperare;
        Caracterisitici = caracterisitici;
        Pret = pret;
    }

    public TELEFON(String brand, String model, Integer anFabricatie, String sistemOperare, List<String> caracterisitici) {
        Brand = brand;
        Model = model;
        AnFabricatie = anFabricatie;
        SistemOperare = sistemOperare;
        Caracterisitici = caracterisitici;
    }

    public void VechimeTelefon(){

        if (AnFabricatie>=2020){
            System.out.println("Apropae nou");
        }
        if (AnFabricatie>=2015 && AnFabricatie<=2019){
            System.out.println("Uzat");
        }
        if (AnFabricatie<2015){
            System.out.println("Vechi");
        }


    }
    public void PretTelefon(){
        if (Pret!=null){
            System.out.println(Pret);
        }
         else {
            System.out.println("Telefonul este de prezenatre");
        }
    }

    public void DiscountTelefon(Double Reducere){
        if (Pret!=null){
            Double Diferenta = (Pret*Reducere)/100;
            Double PretNou = Pret-Diferenta;
            System.out.println("Noul pret al telefonului este "+PretNou);
        }
        else {
            System.out.println("Telefonul este de prezenatre");
        }

    }
}
