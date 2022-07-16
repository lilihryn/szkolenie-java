package plcybertrainees.service;

import plcybertrainees.dziedziczenie.Kolor;
import plcybertrainees.dziedziczenie.Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OdczytDannych {
    //public String wprowadzonaWartoscZKlawiatury(){
    //wartosci ktore poda uzytkownik
    //Scanner
    //System.in-objekt reprezentujacy InputStream(przetwarzanie dannych)
    //Scanner scan= new Scanner(System.in);
    //return scan.nextLine();


    public String wprowadzonaWartoscZKlawiatury() {
        // Scanner -- obiekt pozwalający na odczyt danych z klawiatury
        //System.in - obiekt reprezentujący InputStream, odpowiada z przetwarzanie danych
        Scanner scan = new Scanner(System.in);

        return scan.nextLine();
    }

    public String daneZPliku(File plikZew) throws FileNotFoundException
    //mowi aplikacji pojawlajacy bląd przenieść do miejsca w którem jest to wykonane

    //obslugiwanie wyjatków
    {
        Scanner scan = new Scanner(plikZew);
        return scan.nextLine();
    }

    public Model daneOModeluPojazdu(File plikZew) throws FileNotFoundException
    {
        Model modelPojazdu=new Model();
        Scanner scan = new Scanner(plikZew);
        String LiniaWPliku= scan.nextLine();
        String[] tablicaPliku=LiniaWPliku.split(",");
        modelPojazdu.setMarka(tablicaPliku[0]);
        modelPojazdu.setRocznik(tablicaPliku[1]);
        modelPojazdu.setNaped(tablicaPliku[2]);
        modelPojazdu.setNazwa(tablicaPliku[3]);
        modelPojazdu.setPrzebieg(Integer.valueOf(tablicaPliku[4]));
        modelPojazdu.setPojemnoscSilnika(Double.valueOf(tablicaPliku[5]));
        modelPojazdu.setKolor(Kolor.valueOf(tablicaPliku[6]));


        return modelPojazdu;
    }
}




