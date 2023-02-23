package ValueType;

import org.testng.annotations.Test;

public class ValueInt {
    public int Variabila1;
    public Integer Variabila2;
    public double Variabila3;
    public Double Variabila4;

    @Test
    public void metodaTest(){
        Variabila1 = 5;
        Variabila2 = 11;

        System.out.println(Variabila1);
        Calcul(Variabila1);
        System.out.println(Variabila1);

        Jucarie Papusa = new Jucarie("Barbie");
        Papusa.Info();
        Papusa.setNume("Masinuta");
        Papusa.Info();
    }
    public void Calcul(Integer x){
       x = x+1;
        System.out.println(x);
    }
}
