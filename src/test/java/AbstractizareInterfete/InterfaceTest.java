package AbstractizareInterfete;

import org.testng.annotations.Test;

public class InterfaceTest {

    @Test
    public void metodaTest(){

        Angajat Angajat1 = new Angajat("Ionut", "Adresa Test", 35);
        Angajat1.munceste();

        Student Student1 = new Student("Timi", "Adresa",30);
        Student1.invata();

        AngajatStudentSomer AngajatStudentSomer1 = new AngajatStudentSomer("Marin", "Test", 45);
        AngajatStudentSomer1.doarme();
        AngajatStudentSomer1.invata();
        AngajatStudentSomer1.munceste();
    }

}
