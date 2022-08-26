package plcybertrainees.wyjasnienia.bankomat;

import java.util.*;

public class BankomatService {
    Scanner scanUser = new Scanner(System.in);
    Bankomat bankomat = new Bankomat();



    private boolean menu(final Integer pozycja, final Karta karta) {

        Integer kwota = 0;
        try {
            switch (pozycja) {//Ctrl+. mozna zwinuc kod
                case 1:
                    System.out.println("1. Wpłaćam Gotówkę");
                    System.out.println("Prosze podacz kwote wplaty:");
                    kwota = scanUser.nextInt();
                    sprawdzWprowadzneKwoty(kwota);
                    bankomat.wplacGotuwke(kwota);
                    break;
                case 2:
                    System.out.println("2. Wypłaćam Gotówkę");
                    System.out.println("Prosze podacz kwote wyplaty:");
                    kwota = scanUser.nextInt();
                    sprawdzWprowadzneKwoty(kwota);
                    bankomat.sprawdzWyplate(kwota);
                    bankomat.wyplacGotuwke(kwota);
                    break;
                case 3:
                    System.out.println("3. Sprawdźam stan konta");
                    System.out.println("Bankomat posiada:  " + bankomat.stanKonta());
                    break;
            }
        } catch (InputMismatchException e) {
            throw new BusinessException("Nie podano prawidlowej liczby wplata/wyplata");
        }


        return pozycja != 4;
    }

    private void sprawdzWprowadzneKwoty(final Integer kwota) {
        List<Integer> lista = List.of(10, 20, 50, 100, 200, 500);
        if (!lista.contains(kwota)) {
            // !.lista.contains-not contains
            throw new BusinessException("Wprowadz poprawna kwote z zakresu:" + lista);

        }
    }

    public void uruchomRozwiazanie1() {
        boolean czyKontynuowac;
        Karta karta=null;

        do {
            System.out.println("Wybierz dostępną opcję:");
            System.out.println("1. Wpłać Gotówkę");
            System.out.println("2. Wypłać Gotówkę");
            System.out.println("3. Sprawdź stan konta");
            System.out.println("4. Przerwij Operację");

            Integer userInfo = 4;
            try {
                userInfo = scanUser.nextInt();
            } catch (InputMismatchException e) {
                throw new BusinessException("Nie podano prawidlowej liczby z menu");
            }
            czyKontynuowac = menu2(userInfo,karta);

        } while (czyKontynuowac);

    }

    private boolean menu2(final Integer pozycja, Karta karta) {

        Integer kwota = 0;

        try {
            switch (pozycja) {//Ctrl+. mozna zwinuc kod
                case 1:
                    System.out.println("1. Wpłaćam Gotówkę");
                    System.out.println("Prosze podacz kwote wplaty:");
                    kwota = scanUser.nextInt();
//                    sprawdzWprowadzneKwoty(kwota);
//                    bankomat.wplacGotuwke(kwota);
//                    karta.wplacGotuwke(kwota);
                    dokonajWplaty(kwota,karta);
                    break;
                case 2:
                    System.out.println("2. Wypłaćam Gotówkę");
                    System.out.println("Prosze podacz kwote wyplaty:");
                    kwota = scanUser.nextInt();
//                    sprawdzWprowadzneKwoty(kwota);
//                    bankomat.sprawdzWyplate(kwota);
//                    karta.sprawdzWyplate(kwota);
//                    bankomat.wyplacGotuwke(kwota);
//                    karta.wyplacGotuwke(kwota);
                    dokonajWyplaty(kwota,karta);

                    break;
                case 3:
                    System.out.println("3. Sprawdźam stan konta");
                    System.out.println("Bankomat posiada:  " + bankomat.stanKonta());
                    break;
                case 4:
                    System.out.println("4.Saldo  karty");
                    System.out.println("Na karcie posiadasz:  " + karta.stanKonta());
                    break;
            }
        } catch (InputMismatchException e) {
            throw new BusinessException("Nie podano prawidlowej liczby wplata/wyplata");
        }


        return pozycja != 4;
    }

    public void uruchomRozwiazanie2() {
        List<Karta> karty = List.of(
                new Karta(12345678, 1234, 1000),
                new Karta(33345678, 9876, 2000));
        boolean czyKontynuowac;//ma wartosc poczatkowa
        boolean czyPrawidlowaKarta=false;
        Karta karta=null;


        System.out.println("Wloz karte");
        Integer nrKarty= scanUser.nextInt();
        System.out.println("Podaj pin");
        Integer pinKarty= scanUser.nextInt();
        for(Karta el: karty){
            if(el.getNrKarty().equals(nrKarty)){
                if(el.sprawdzPin(pinKarty));
                czyPrawidlowaKarta=true;
                karta=el;
            }
        }
        if(!czyPrawidlowaKarta||karta==null){
            throw new BusinessException("Wprowadzone bledne dane karty");
        }
        //używanie stream- metody allMatch(czy wszystkie kody w liście zgadzają się w jakiś sposób
        //karta=karty.stream().allMatch(karta1 -> instanceof Karta);

        //filtrowanie z listy za kryteriem
        //->wyrażenie lambda-obiekt wejszczowy(karta),może mieć różny typ dannych
        //findAny,findFirst
       // karta=karty.stream().filter(Objects::nonNull)
       //         .filter(element->element.getNrKarty().equals(nrKarty))
          //      .findFirst()
        //.orElseThrow(()->{throw new BusinessException("Wprowadzone bledne dane do karty");});


        do {
            System.out.println("Wybierz dostępną opcję:");
            System.out.println("1. Wpłać Gotówkę");
            System.out.println("2. Wypłać Gotówkę");
            System.out.println("3. Sprawdź stan konta");
            System.out.println("4. Sprawdz stan konta");
            System.out.println("0. Przerwij Operację");

            Integer userInfo = 0;
            try {
                userInfo = scanUser.nextInt();
            } catch (InputMismatchException e) {
                throw new BusinessException("Nie podano prawidlowej liczby z menu");
            }
            czyKontynuowac = menu(userInfo, karta);

        } while (czyKontynuowac);

    }
    private void dokonajWplaty(final Integer kwota, final Karta karta) {
        sprawdzWprowadzneKwoty(kwota);

        bankomat.wplacGotuwke(kwota);
        karta.wplacGotuwke(kwota);

    }

    private void dokonajWyplaty(final Integer kwota,final Karta karta) {
        sprawdzWprowadzneKwoty(kwota);
        bankomat.sprawdzWyplate(kwota);
        karta.sprawdzWyplate(kwota);
        bankomat.wyplacGotuwke(kwota);
        karta.wyplacGotuwke(kwota);

    }
}
