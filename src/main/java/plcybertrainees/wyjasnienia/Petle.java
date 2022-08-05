package plcybertrainees.wyjasnienia;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Petle {
    /*
    for i foreach
    int i=0 inicjalizacja parametru poczatkowego do przegodzenia po pętle
    i<5 warunek spelnienia kolejnego przejscia
    for(int i=0;i<5;i++){
    kod wykonania
    println
    dodawanie do listy elementy
    }
    foreach
    for(TypDanych elementListy:Lista){
    uwaga1
    usuwanie elementów  z listy
    for (int i-0;i<5;i++){
    lista.get(i)


    }
     */
    // Zadanie nr 1 // Wykonać metodę która przyjmie jako parametr List<BigDecimal>,
// następnie wykona następujące zagadnienia:
// a) wyświetli każdy element listy jeden po drugim
// b) każdy element listy doda do siebie.
    public void urochom() {
        List<BigDecimal> lista = new ArrayList<>();
        lista.add(BigDecimal.valueOf(10.0));
        lista.add(BigDecimal.valueOf(2.0));
        lista.add(BigDecimal.valueOf(5.6));
        lista.add(BigDecimal.valueOf(21.8));
        lista.add(BigDecimal.valueOf(2.1));
        lista.add(BigDecimal.valueOf(41.0));
        lista.add(BigDecimal.valueOf(14.0));
        lista.add(BigDecimal.valueOf(1.0));
        lista.add(BigDecimal.valueOf(4.0));
        rozwiazanieZadania1(lista);
        choinkaProsta();
        choinkaRozbudowana(3);
        choinkaRozbudowana2(3);
        wyswietkKratne5();
        pierwszyProgramWhile();
        programSilnia();


//metoda
        //utworzenie i deklaracja listy
    }

    public void rozwiazanieZadania1(List<BigDecimal> list) {
        BigDecimal sumaLiczb = BigDecimal.ZERO;

        for (BigDecimal liczba : list) {
            System.out.println("Element listy" + liczba);
            sumaLiczb = sumaLiczb.add(liczba);


        }
        System.out.println("Suma liczb" + sumaLiczb);
    }
    //Zadanie choinka
    //potrzebuje dwa fory
    //metoda bedzie przyjmować parametr jako wysokość

    private void choinkaProsta() {
        System.out.println("  *");
        System.out.println(" ***");
        System.out.println("*****");

    }

    private void choinkaRozbudowana(Integer wysokoscChoinki) {
    /*
    int <-> Integer
    double <-> Double
    BigInteger, BigDecimal
    long <-> Long
    etc.
     */

        for (int wysokosc = 0; wysokosc < wysokoscChoinki; wysokosc++) {
            for (int szerokosc = 0; szerokosc < wysokoscChoinki * 2; szerokosc++) {
                if (szerokosc < (wysokoscChoinki - wysokosc) || szerokosc > (wysokoscChoinki + wysokosc)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }


    private void choinkaRozbudowana2(Integer wysokoscChoinki) {

        Integer maksymalnaLiczbaGwiazdek = (wysokoscChoinki * 2) - 1;
        System.out.println("Liczba gwiazdek w podstawie: " + maksymalnaLiczbaGwiazdek);
        System.out.println();

        for (int x = 1; x <= maksymalnaLiczbaGwiazdek; x += 2) {//x=x+2//x++
            Integer spacje = (maksymalnaLiczbaGwiazdek - x) / 2;
            for (int y = 0; y < spacje + x; y++) {
                if (y < spacje) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    // zadanie utworzyc metode która przejdzie(iteruje) liczbach od 1 do 100,
// natomiast wyświetli tylko te które są podzielne przez 5
//oraz dodaje ich do siebie
    private void wyswietkKratne5() {
        Integer sumaLiczb = 0;
        Integer iloscLiczb = 0;

        for (int cale = 1; cale <= 100; cale++) {//inicializacja i deklaracja;do kiedy;warunek++ albo--
            if (cale % 5 == 0) //% modulo poszukiwanie reszty dzielenie kóre jest 0
            {
                System.out.println("Podzielne przez 5 " + cale);//zawsze spacja
                sumaLiczb += cale;//dodaje ich do siebie
                iloscLiczb += 1;//sprawdzaje ilosc liczb kratnych 5
            }

        }
        System.out.println(sumaLiczb);
        System.out.println(iloscLiczb);


    }

    //petle
    // WHILE oraz do While
    //while- slowo kluczowe okreslajace deklaracje petli while
    // do -- slowo kluczowe okreslajace deklaracje petli do while
    //(condition)-warunek okreslajace zakonczenije dzialania petli
    /*
    while(condition){
    //blok kodu}


    do{blok kodu}
    while(condition);

    int liczba=1;
    while(liczba<1){
    println("to jest liczba: "+liczba);
    }

    do{
    println("to jest licba: "+ liczba);
    liczba++;
    }while(liczba<1)
     */
    private void pierwszyProgramWhile() {
        int liczba = 0;
        while (liczba < 1) {
            System.out.println("while,to jest liczba: " + liczba);
            liczba++;
        }
        do {
            System.out.println("do while, to jest liczba: " + liczba);
            liczba++;
        } while (liczba < 1);
    }

    /*private void sumaLiczbZForiWhile() {
        Integer sumaFor=0;
        Integer sumaWhile=0;
        Integer sumalicznikWhile=0;


        for (int i = 0; i<= 10; i++) {
            System.out.println("Suma jest: " + sumaFor);
            sumaFor += i;
        }
        int i=0;
        sumalicznikWhile
        while (i<10) {
            sumaWhile += i;
            System.out.println("Suma liczb: " + sumaWhile);
        }
        do{ System.out.println("Suma liczb: " + sumaWhile);
           i++;
            sumaWhile+=i;}while (i<10);

    }
}

*/
    private void programSilnia() {//faktorial iteracyjnie
        Integer s = 1;
        Integer i = 1;
        Integer n = 4;//n!

        while (i <= n) {

            s *= i;//s=s*i;
            i++;//i=i+1;
        }
        System.out.println("n!" + s);
        System.out.println("n!" + silnikRekurencja(4));

    }
    private Integer silnikRekurencja(Integer n){//faktorial rekuracijne
        if (n>1){
            return n*silnikRekurencja(n-1);
        }else{
            return 1;
        }
    }
    // metoda ciąg Fibonacciego; 2 metody n-1 n+2, przez rekurencje praca domowa***

    //TABLICY new


}