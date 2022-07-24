package plcybertrainees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PracaDomowa {
    //1) do wykonanaia zadanie, które polega na pobraniu od użytkownika informacji wprowadzonych z klawiatury.
    //    a) 5 razy Integer
    //    b) 5 razy BigDecimal
    //  dla każdej opcji powyżej wykonać dodawanie wprowadzonych liczb, mnożenie przez 10 każdej z liczb oraz dzielenie przez 2 każdej z liczb
    //  Wyniki zaprezentować w postaci:
    //  Dodawanie liczb [a, b, c, d, e]: w
    //  Mnożenie przez 10 liczb:
    //  a*10: w
    //  b*10: w
    //  c*10: w
    //  d*10: w
    //  e*10: w
    //  etc.
    public static void main(Integer[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cale a");
        Integer caleA = scanner.nextInt();
        System.out.println("Cale b");
        Integer caleB = scanner.nextInt();
        System.out.println("Cale c");
        Integer caleC = scanner.nextInt();
        System.out.println("Cale d");
        Integer caleD = scanner.nextInt();
        System.out.println("Cale e");
        Integer caleE = scanner.nextInt();

        List<Integer> lista1 = new ArrayList<>();
        lista1.add(caleA);
        lista1.add(caleB);
        lista1.add(caleD);
        lista1.add(caleE);
        lista1.add(caleC);

        Integer dodawanie = caleA + caleB + caleC + caleD + caleE;
        System.out.println("Dodawanie liczb [a, b, c, d, e]: w" + dodawanie);

        for (int i = 0; i < lista1.size(); i++) {
            if (i > 0) {
                System.out.println(i + "a*10: w" + (caleA * 10) +
                        "    b*10: w" + (caleB * 10) +
                        "     c*10: w" + (caleC * 10) +
                        "     d*10: w" + (caleD * 10) +
                        "     e*10: w" + (caleE * 10));
            }
        }

        /*List<Integer> lista1;
        lista1 = new ArrayList<>();
        lista1.add(caleA);
        lista1.add(caleB);
        lista1.add(caleD);
        lista1.add(caleE);
        lista1.add(caleC);
        Integer wynikDodawania=caleA+caleB+caleC+caleD+caleE;
        public void dodawanieElemetowListy ( List<Integer> lista1) {
            Integer result = 0;
            for (Integer element : lista1) {
                System.out.println("Dodawanie liczb [a, b, c, d, e]: w: " + element + result);
                result = Dodawanie.add(result, element);
                result = result + element;

            }
            System.out.println("Wynik dodawanialisty: " + result);
        }
        public void mnozenie10 (List < Integer > lista1) {
            Integer result = 1;
            for (Integer element = null; lista1) {
                result = element * 10;
            }
            System.out.println("Mnożenie przez 10 liczb:a*10: w" + result+
                    "b*10: w " + result+
                    "c*10: w " + result+
                    "d*10: w " + result+
                    "e*10: w" + result);
        }

    }

package plcybertrainees;

import plcybertrainees.kalkulator.Dodawanie;
import plcybertrainees.service.OdczytDannych;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class PracaDomowa {
    //1) do wykonanaia zadanie, które polega na pobraniu od użytkownika informacji wprowadzonych z klawiatury.
    //    a) 5 razy Integer
    //    b) 5 razy BigDecimal
    //  dla każdej opcji powyżej wykonać dodawanie wprowadzonych liczb, mnożenie przez 10 każdej z liczb oraz dzielenie przez 2 każdej z liczb
    //  Wyniki zaprezentować w postaci:
    //  Dodawanie liczb [a, b, c, d, e]: w
    //  Mnożenie przez 10 liczb:
    //  a*10: w
    //  b*10: w
    //  c*10: w
    //  d*10: w
    //  e*10: w
    //  etc.
    public static void main(Integer[] args) throws FileNotFoundException {
        OdczytDannych odczytDannych = new OdczytDannych();

        Integer caleA = Integer.valueOf(odczytDannych.wprowadzonaWartoscZKlawiatury());

        Integer caleB = Integer.valueOf(odczytDannych.wprowadzonaWartoscZKlawiatury());

        Integer caleC = Integer.valueOf(odczytDannych.wprowadzonaWartoscZKlawiatury());

        Integer caleD = Integer.valueOf(odczytDannych.wprowadzonaWartoscZKlawiatury());

        Integer caleE = Integer.valueOf(odczytDannych.wprowadzonaWartoscZKlawiatury());



        List<Integer> lista1;
        lista1 = new ArrayList<>();
        lista1.add (caleA);
        lista1.add(caleB);
        lista1.add(caleD);
        lista1.add(caleE);
        lista1.add(caleC);

        public void dodawanieElemetowListy(List<Integer> lista1){
            Integer result = 0;
            for (Integer element :lista1) {
                System.out.println("Dodawanie liczb [a, b, c, d, e]: w: " + element + result);
                result = Dodawanie.add(result, element);
                result=result+element;

            }
            System.out.println("Wynik dodawanialisty: " + result);
        }
        public void mnozenie10(List<Integer>lista1){
            Integer result=1;
            for (Integer element; lista1){


            }
            System.out.println("Mnożenie przez 10 liczb:a*10: w"+ result
                    "b*10: w "+ result
                    "c*10: w "+result
                    "d*10: w "+result
                    "e*10: w"+result);
        }

    }


}
}*/
    }
}