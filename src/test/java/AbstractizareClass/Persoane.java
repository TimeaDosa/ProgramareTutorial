package AbstractizareClass;

public abstract class Persoane {
    //O clasa abstracta poate sau nu sa contina metode abstracte;
    //Clasa care mosteneste clasa abstracta => implementeaza toate metodele abstractele
    //Putem mosteni o singura clasa abstracta
    //O clasa abstracta poate implementa o fata;
    //Intr-o clasa abstracta poti avea un constructor => NU poti face un obiect;
    //Intr-o clasa abstracta putem avea metode: private, public, protected;
    //Metodele abstracte trebuie sa contina cuvantul abstract;


    //Definim metode abstracte
    public abstract void munceste();
    public abstract void primesteSalariu();
    public abstract void mergeLaCurs();
    public abstract void primesteBursa();
    public abstract void nuMuncesteSiNuInvata();
    public abstract void nuPrimesteSlarasiBursa();


    //Definim metode simple
    public void curs(){
        System.out.println("Asta e o metoda simpla");
    }


}

