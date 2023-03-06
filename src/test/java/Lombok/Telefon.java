package Lombok;

import lombok.*;


//-> cu Lombok redcem foarte mult din liniile de cod la nivel de constructie
@Getter      //-> daca o adresez la niv. de clasa toate varibilele pe care il am in clasa "Telefon" vor contine metodele
             //de GET, !!fara ca eu se le fac jos.
             //-> (tot asa cum e indicat mai sus) se aplica si la SET
@Setter
@AllArgsConstructor  //->tine loc la constructorul pe care l-am sters
@NoArgsConstructor  //-> tine loc si legat de constructorul def. ala fara parametrii.
@ToString         //  @Override-> iti reprezinta informatii legate de continutul clasei
                  //(in cazul nostru la 5 variabile: brand, model,anFabricatie, material si camera;

public class Telefon {
    private String Brand;
    private String Model;
    private Integer AnFabricatie;
    private String Material;
    private String Camera;


}

