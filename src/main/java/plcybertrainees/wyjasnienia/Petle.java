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

    private void choinkaProsta(){
        System.out.println("  *");
        System.out.println(" ***");
        System.out.println("*****");

    }
    private void choinkaRozbudowana(Integer wysokoscChoinki){
        Integer iloscGwiazdekWPodstawie=(wysokoscChoinki*2)+1;
      for(int wysokosc=0;wysokosc<=wysokoscChoinki;wysokosc++){


    }

}}


