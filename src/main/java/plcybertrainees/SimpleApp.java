package plcybertrainees;

import plcybertrainees.dziedziczenie.Kolor;
import plcybertrainees.dziedziczenie.model;
import spotkanie.Petle;

import java.util.*;

public class SimpleApp {


    public static void main(String[] args) {
        model modelPojazdu1 = new model();
        var modelPojazdu2 = new model("VW", "2020",
                "przod", "Passat", 1000,
                2.0, Kolor.ZIELONY);
        var modelPojazdu3 = new model("VW", "2020",
                "przod",
                "Passat", 3000, 2.0,
                Kolor.ZIELONY);

        modelPojazdu1.setKolor(Kolor.CZERWONY);
        modelPojazdu1.setMarka("VW");
        modelPojazdu1.setRocznik("2021");
        modelPojazdu1.setNaped("przod");
        modelPojazdu1.setPojemnoscSilnika(2.1);
        modelPojazdu1.setNazwa("Passat");
        modelPojazdu1.setPrzebieg(1000);

        List<String> strings = new ArrayList<String>();
        strings.add("pierwszy");
        strings.add("drugi");
        System.out.println(strings.get(1));


        Petle petle = new Petle();
        petle.wyswietlenie1d0100();
        List<Double> listaDouble = new ArrayList<>(Arrays.asList(
                1.0,
                2.0,
                5.0,
                10.0,
                20.0
        ));
        listaDouble.add(30.0);
        petle.dodawanieElementowlisty(listaDouble);

        petle.wyswietlSet();
//        Set<Integer> wyswietlSet=new HashSet<>(
//        );
//        wyswietlSet.add(1);


// Arrays.asList oczekuje zmianne double jak zadeklarowane w liscie
/*instrukcja warunkowe:
     if- wybór na podstawie warunku typu boolean
     if(condition){
     //kod}
     else{
     /inny kod}

      if(condition){
     //kod}
     else if(condition2){
     /inny kod}
     pętle:
     for/forech

     pętle:
     for stosujemy do prostych wyliczeń
     for(int i=0;i<10;i++){
     int=0-wartoć startowa pętli
     i<10 do kiedy
     i++ sposób zmieny wartośći i

     wyjątek i++ > i=i+1;
             i-- >i=i-1;
     foreach-do list
     foreach(){
     /kod do wykonania}

     foreach(String element;strings)

     Set
     HashSet()
     TreeSet()
     Deklaracja
     Set<String>nazwaSet=new Hash<>();
     Przypisanie wartości
     nazwaSet.add("pierwszy");

     metody:
     size()-listy,sety: ilość elementów
     lista.size();
     nazwaSet.size();
 */


        System.out.println(modelPojazdu1.toString());
        System.out.println(modelPojazdu2);
        System.out.println(modelPojazdu1.getMarka());
        System.out.println(modelPojazdu1.getKolor());
        System.out.println(modelPojazdu1.getNaped());
    }
}

