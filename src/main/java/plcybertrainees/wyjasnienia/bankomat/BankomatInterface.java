package plcybertrainees.wyjasnienia.bankomat;

import java.util.Scanner;

public class BankomatInterface {
    public static Double stanKonta = 0.0;

    void wplataGotuwki () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kwote do splaty");
        Double wplata = scanner.nextDouble();




        if(wplata%10==0){

            stanKonta = stanKonta + wplata;

            System.out.println("Stan konta po wplacie " + stanKonta);}
        else {
            System.out.println("Podaj prawidlowa suma 10,100,200");
        }



    }

    void wyplataGotuwki() throws StanKontaException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kwote do wyplaty");
        Double wyplata = scanner.nextDouble();
        if (wyplata <= stanKonta) {
            stanKonta = stanKonta - wyplata;
            System.out.println("Stan konta po wyplacie " + stanKonta);

        }if(wyplata>stanKonta){
            throw new StanKontaException("",stanKonta );


        }



    }

    void spawdzenieStanuKonta() {
        System.out.println("Stan konta" + stanKonta);



    }

    void przerywiOperacje() {

        System.out.println("Do widzenia!");


    }

    public void uruchom  () {


        wplataGotuwki();
        wyplataGotuwki();
        spawdzenieStanuKonta();
        przerywiOperacje();
    }





/*
    Utowrzyć Bankomat

Do wykonania prosta obsługa bankomatu.
1) Dzięki użyciu instrukcji warunkowej musimy zaimplementować menu wyboru opcji:
    a) wpłać gotówkę
    b) wypłać gotówkę
    c) sprawdzenie stanu konta
    d) przerwij operację

2) Należy wykonać kod aplikacji dla wszystkich opcji.
   Aplikacja powinna wyświetlać menu do momentu, gdy nie wybierzemy opcji 'przerwij operację', wtedy aplikacja powinna przestać działać.
3) Początkowy stan konta bankomatu powinien wynosić 0, jednocześnie możemy wpłacać na stan konta wyłącznie następujące liczby (10, 20, 50, 100, 200, 500)
4) Wypłacać gotówkę możemy wyłącznie następujące liczby (10, 20, 50, 100, 200, 500), jeśli wypłata gotówki ma przekroczyć minimalny stan konta powinien zostać wyświetlony
   wyjątek StanKontaException z opisem "Niewystarczająca ilość środków w bankomacie"
5) Sprawdzenie stanu konta powinno zwrócić ilość gotówki zdeponowanej w bankomacie.
6) Po wykonaniu opcji a - c powinna aplikacja wrócić do menu.

     */




}
