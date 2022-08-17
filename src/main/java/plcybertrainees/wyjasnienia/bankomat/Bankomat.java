package plcybertrainees.wyjasnienia.bankomat;

import java.util.Scanner;

public class Bankomat extends BankomatInterface{


    public String opcjaDoWykonanja() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Obierz opcje a-wpłać gotówkę,b-wypłać gotówkę,c-sprawdzenie stanu konta,d-przerwij operację");

        String opcja = scan.next();
        switch (opcja) {
            case "a":
                wplataGotuwki();
                opcjaDoWykonanja();
                break;
            case "b":
                wyplataGotuwki();
                opcjaDoWykonanja();
                break;

            case "c":
                spawdzenieStanuKonta();
                opcjaDoWykonanja();

                break;

            case "d":
                przerywiOperacje();

                break;

            default:
                opcjaDoWykonanja();
        }
        return ("");
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
