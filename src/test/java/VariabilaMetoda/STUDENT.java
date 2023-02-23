package VariabilaMetoda;

import org.testng.annotations.Test;

public class STUDENT {

    //Asta este un comentariu;
    //Clasa= un sablon care contine variabile si metode;
    //Intr-un fisier java putem avea mai multe clase diferentiate prin numele lor (nu ii un lucrui bun
    //sa ai mai multe clase intr-un fisier);
    //O clasa trebuie sa aiba un nume;
    //O clasa se recunoaste dupa cuvantul "class";
    //Tot timpul o clasa trebuie sa fie publica;
    //Variabila = atributul unei clase;
    //Variabilele sunt de doua feluri: global si local;
    //Variabila globala = este vizibila peste tot in program;
    //Variabila locala = este vizibila doar in locul unde o declari;


    public String Nume;
    public String Prenume;
    public String Adresa;
    public Integer Varsta;
    public Double Inaltime;
    public Float Greutate;
    public Character Sex;
    public Boolean Este_angajat;

    //Metoda = actiune la nivel de clasa
    //Metodele sunt de doua feluri: Void, Return



    @Test
    public void Presentare_student()
    {
        Nume = "Dosa";
        Prenume = "Timi";
        Adresa = "Timisoara nr.0";
        Varsta = 26;
        Inaltime = 1.49;
        Greutate = 46f;
        Sex = 'F';
        Este_angajat = false;

        //print afiseaza pe tastatura si ramane pe acelasi rand
        //Println afiseaza si sare la randul urmator
        //Daca vrem sa legam doua siruri de caractere folosim conceptul de concatenare (+)

        System.out.println("Numele studentului este: " + Nume);
        System.out.println("Prenumele studentului este: " + Prenume);
        System.out.println("Adresa este: " + Adresa);
        System.out.println("Inaltimea este: " + Inaltime);
        System.out.println("Greutatea este: " + Greutate);
        System.out.println("Sexul este: " + Sex);
        System.out.println("Studentul este angajat?: " + Este_angajat);


    }
    @Test
    public void Adaugare_nume()
    {
        //Declaram o variabila locala
        String Prenume2 = "Sara";
        Nume = "Matei";
        Prenume = "Andrea";

        System.out.println("Numele complet este: " + Nume+" " + Prenume2 +" "+ Prenume);
        System.out.println("Bonus de Craciun este: " + String.format("%.3f", getBonus()));


    }

    //Facem o metoda cu return (este facut cu scopul ca el sa-ti returneze o informatie si mai de parte tu sa
    // stabilesti ce sa faci cu informatia respectiva);
    //Este o conventie in programare se zice ca metodele cu return trebuie sa dai un nume mai sugestiv- se adauga
    //un get in fata; ex: getSalar, getBonus, getNume etc.;
    //get = da-mi;

    public Double getBonus ()
    {
        Double Bonus = 1.000;
        return Bonus;

    }


}

