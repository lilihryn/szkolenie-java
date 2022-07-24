package plcybertrainees.wyjasnienia;
//Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta,
//parzystość sprawdzamy przez znak % 2 inaczej sprawdzamy jej podzielność przez 2
//np. 2 % 2

import java.io.InputStream;

public class Parzystosc {

    public InputStream sprawdzanieParzystosci(int parne) {

        if (parne % 2 == 0) {
            System.out.println("Parzysta.");
        } else {
            System.out.println("Nie parzysta.");
        }
        return System.in;
    }

}
