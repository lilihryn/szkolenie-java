package plcybertrainees.wyjasnienia;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tablice {


    /*
    TypDanych[]nawiasem kwadratowym okresliamy że to jest tablica
    TypDanych[]nazwa_tablicy=new TypDanych(int) zakres_tablicy;

    np.
    Integer [] tablicaInt-newInteger[10];przypisywanie wartośći do tablicy

         1) deklaracja
         Integer[] tablicaInt=new Integer[10];
         Integer nowaTablica={1,2,3,4,19};

         2) Zalecana forma
         Integer[] nowaTablica=newIntetge[5];
         nowaTablica[0]=1;
         nowaTablica[1]=2;
         nowaTablica[2]=3;
         nowaTablica[3]=4;
         nowaTablica[4]=19;

     Wielonumerowe tablice w JAva
     TypDanych[][] nazwa_tablicy= new TypDanych(int) zakres_tablicy1][zakres_tablicy2];
     Integer[][] tablicaInt=new Integer[10][10];

     Integer[][]nowaTablica=new Integer[1][1];
     nowaTablica[0][0]=1;
     nowaTablica[0][1]=1;
     nowaTablica[1][0]=1;
     nowaTablica[1][1]=1;


     odwolanie sie do tablic
     System.out.println(nowaTablica[0]);
     System.out.println(nowaTablica[0][0]);


     */

    //z1 utworzyć tablice o wymiarże 5 elementów i przypisac do niej randomowe wartosci
    //wyszwitlenie wszystkich elementów tablicy whyle or for

    //z2 utworzyć tablice o wymiarże 5 elementów i przypisac do niej randomowe wartosci
    //random od 50 do 100
    //wyszwitlenie wszystkich elementów tablicy whyle or for

    public void uruchom() {
        nowaTablica();
        wyswietlTabliceZRandom();
        ListaZTablicy();
        tablicaWielowymierowa();
    }

    private void nowaTablica() {
        Integer[] nowaTablica = new Integer[5];
        nowaTablica[0] = 1;
        nowaTablica[1] = 2;
        nowaTablica[2] = 3;
        nowaTablica[3] = 4;
        nowaTablica[4] = 19;


        for (int i = 0; i < nowaTablica.length; i++) {
            System.out.println("Tablica jest: " + nowaTablica[i]);
        }
        Integer j = 0;
        while (j < nowaTablica.length) {
            System.out.println("To jest while: " + nowaTablica[j]);
            j++;
        }


    }

    private void wyswietlTabliceZRandom() {
        Integer[] tablica1 = new Integer[5];
        Random rand = new Random();
        for (int i = 0; i < tablica1.length; i++) {
            tablica1[i] = rand.nextInt(150) + 50;
        }
        Integer j = 0;
        while (j < tablica1.length) {
            System.out.println("To jest random: " + tablica1[j]);
            j++;
        }
    }

    private void ListaZTablicy() {
        List<Integer> Lista = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            Lista.add(rand.nextInt(150) + 50);
        }


    }

    private void tablicaWielowymierowa() {
        Integer[][] tablica1 = new Integer[10][10];
        Random rand = new Random();
        for (int i = 0; i < tablica1.length; i++) {
            for (int j = 0; j < tablica1.length; j++) {
                tablica1[i][j] = rand.nextInt(150) + 50;
                System.out.println("Random tablica wielowymierowa" + tablica1[i][j]);
            }

        }

    }
}
