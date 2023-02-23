package Structuri;

import org.testng.annotations.Test;

public class CURS {

    //Structurile in programare sunt de 2 feluri: Alternative si Repetitive;
    //Structuri Alternative = se pot realiza folosind : if then else, switch case;
    //Structuri Repetitive (loop) = se pot realiza folosind: for, while, do while, for each;

    @Test
    public void MetodaTest (){

        //VerificareNumar(15);
        //VerificareNumar(3);
        //VerificareNumar(10);
        //VerificareNumar(0);
        //VerificareNumar(-2);
        //VerificareNumarParPozitiv(4);
        //VerificareNumarParPozitiv(5);
        //VerificareNumarParPozitiv(-2);
        //VerificareNumarParPozitiv(-3);
        //VerificareNumarParPozitiv(0);
        ZiuaSaptamana(4);
        ZiuaSaptamana(2);
    }

    //Verificam daca un numar este mai mare decat 10.

    public void VerificareNumar(Integer Numar){

        if (Numar > 10){
            System.out.println("Numarul este mai mare decat 10");
        }
        else{
            System.out.println("Numarul nu este mai mare decat 10");
        }
    }

    //Verificam daca un numar este par si pozitiv;

    public void VerificareNumarParPozitiv(Integer Numar){

        if (Numar > 0){
            if (Numar % 2 == 0){
                System.out.println("Numarul este par si pozitiv");
            }
            else{
                System.out.println("Numarul este impar si pozitiv");

            }
        }
        else{
            if (Numar % 2 == 0){
                System.out.println("Numarul este par si negativ");
            }
            else{
                System.out.println("Numarul este impar si negativ");

            }
        }

        if (Numar == 0){
            System.out.println("Numarul este egal cu 0");
        }


        }

        //Fcaem o metoda cu switch case;
        //Afisam ziua curenta si saptamana.

        public void ZiuaSaptamana(Integer Numar){
            switch (Numar){
                case 1:
                    System.out.println("Luni");
                    break;
                case 2:
                    System.out.println("Marti");
                    break;
                case 3:
                    System.out.println("Miercuri");
                    break;
                case 4:
                    System.out.println("Joi");
                    break;

            }
        }



}

//Diferenta principala dintre mai multe if-uri si mai multe case-uri - e ca la if-uri nu conteaza ca nu mai o conditie
//e buna, el are ca rol sa treaca prin totate, pana cand la case-uri "sare direct" la ala care il intereseaza;
//Alta diferenta este mai organizat case-uri. Dezavantaj, trebuie sa bagam break- pentru a separa la enumerare;
//Si la mentenanta e mai usor de intretinut mai multe case-uri;