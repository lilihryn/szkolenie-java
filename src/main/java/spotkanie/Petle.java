package spotkanie;

import plcybertrainees.kalkulator.Dodawanie;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Petle {

    public void wyswietlenie1d0100() {


        for (int i = 1; i <= 100; i++) {
            if (i < 100) {
                System.out.print(i + ",");

            } else {
                System.out.print(i + ".");
            }
        }
        System.out.println();

    }
    public void dodawanieElementowlisty(List<Double> Lista){
        Double result=0.0;
        for(Double element:Lista){
            System.out.println("Teraz wykonuje operacje: "+ element+ result);
            result= Dodawanie.add(result,element);
           // result=result+element;

        }
        System.out.println("Wynik dodawanialisty: "+result);
    }

    //utworzenie metody, która wypelni zadany set

    public void wyswietlSet() {
        Set<Integer>intSet= new HashSet<>(Set.of(1,2,3,4,5,6,7,8,9,10,11 ));
        for (Integer element:intSet) {
            System.out.print("To jest element setu"+element);

        }}
}

// Petle petle=new Petle();
//  petle.wyswietlenie1d0100();( w simple app);nie może być main string args, musze byc zadeklarowano tobą przed tym//
//system.out.print>w rządek
//system.out.println>w kolumnę