/*//1.Konstrukcja klas i metod
package plcybertrainees;
//1. Konstrukcja klass i metod package pl.cyber.trainees;
// oreślenie pakietu wramach projektu, gdzie //
// znajduje się nasza klasa. //pole package ustawia się automatycznie jeśli nasz plik zawiera się w odpowiedniej strukturze
// katalogów tj src/main/java/......
// w naszym przykładzie src/main/java/pl.cyber.trainees

//region miejsca na importy
//poprzez import dajemy informacje ze z konkretnej biblioteky mozemy korzystac w naszej aplikacji
//import.java.math*; importować bez wyjątky
//endregion
//region miejsce na importy import java.io.File;
// importy zazwyczaj dodają się same ewemtualnie można je dodać poprzez Ctrl + Enter
// poprzez importy powinniśmy rozumieć użycie dodatkowych bibliotek w naszej klasie import java.math.*;
// z * mówimy że chcemy zaimportować wszystkie biblioteki wramach pakietu (package) w tym przypadku java.math
// endregion,

//linia public class SimpleApp opisuje definicje klasy o nazwie SimpleApp
//modyfikator dostępu klasy public/private/protected/default. Najczenscie 2 pierwszych

//class- słowo kluczowe okresląjące definicje klasy
//SimpleApp nazwa klasy, może być dowolna, zgodna z 2ma warunkami:
//1) nazwa pliku i nazwa klasy odnakowe
//2) zawsze piszemy CamelCase'm
//cały kod kod muszę być w{}, poza nimi nie może być żadnego kodu, przed klasem import oraz package
public class SimpleApp {
    //w ramach klasy deklarujemy zmienne  globalne oraz metody;
    // public static string SEPARATOR_SPACJA=" ";- zmienna dostepna w calej klasie
    //konstukcja takiej zmiennoj
    //modyficator dostępu(public), jaka jest zmienna(Static, typ dannych(String),
    // nazwa zmieenoj(SEPARATOR_SPACJA),wylączne z wielkich liter,pomięzdy slów_
    //następne przypisujem wartośći zmiannoj;;;;;srednik


    // deklaracja metod
    //metoda uruchomieniowa występuje tylko raz w całym projekcie
    // konstrukcja: modyfikator dostepu zawsze public
    //słowo kluczowe zawsze static
    //typ metody zawsze void
    //nazwa zawsze main
    // ale zreguly zawsze tablica args (String[] args);
    public static void main(String[] args) {

        // w ramach metody urochomieniowej możemy deklarować zmienne oraz pisać kod
        // ale dobrym praktyką jest aby metoda urochomieniwa wywolywala konkretne klasy

    }

    // metody funkcjonalne deklarujemy w taki sposob
    //nie mogą być static
    //typ swracających informacji
    // typ danych,jeśli chcemy aby metoda zwracala konkretny typ dannych
    // i była możliwa do użycia w innym miejscu np.klasy lub projektu

    //pierwsze slowo z malej litery
    public String nazwaMetody() {
        return "";
    }

    private Integer kolejnaMetoda() {
        //deklarowanie zmiennych
        //instrukcje warunkowe
        //pętli
        //używanie konstruktorów
        return 0;
    }

    // void jeśli metoda nic nie zwraca
    public void wyswitliTekst(String tekst) {
        System.out.println("tekst");
    }

    //uwaga należy pilnowac klamr metody aby nie pisać metody w metodie
    //nowa metoda w tym miejscu
    //ilość metod jest dowolna, ale (książka Czysty kod) wilkość klasy nie powynna przekroczyć 200 linij(jesteśmy na 51)
    // nazwa metody musze mówić co konkretnie ta metoda robie
    public void wyswietlTekst(String tekst) {
        System.out.println(tekst);
    }
}*/
//1. Konstrukcja klass i metod

package plcybertrainees; // oreślenie pakietu wramach projektu, gdzie
// znajduje się nasza klasa.
//pole package ustawia się automatycznie jeśli nasz plik zawiera się w odpowiedniej strukturze
//katalogów tj src/main/java/......
//w naszym przykładzie src/main/java/pl.cyber.trainees

//region miejsce na importy

import plcybertrainees.wyjasnienia.Basics;
import plcybertrainees.wyjasnienia.BasicsInteger;
import plcybertrainees.wyjasnienia.InstrukcjeWarunkowe;
//endregion

//Linia public class SimpleApp. Opisuje definicję klasy o nazwie SimpleApp.
//modyfikator dostępu klasy public / private
//class - słowo kluczowe określające definicję klasy
//SimpleApp - nazwa klasy tutaj nazwa może być dowolna, aby była zgodna z dwoma warunkami:
//1) Nazwa pliku i nazwa klasy musi się równać
//2) Nazwy klas zawsze piszemy CamelCase'm z zastrzeżeniem że pierwsza litera i każda kolejna nowego wyrazu jest pisana
//z wielkiej litery

//Cały kod w klasie powinien być zapisany w jej ramach które określone są poprzez nawiasy {} poza klasą
//nie może być żadnego kodu, natomiast przed klasą możemy jedynie pisać import'y oraz package.
public class SimpleApp {

    //w ramach klasy deklarujemy zmienne globalne oraz metody
    public static String SEPARATOR_SPACJA = " "; //zmienna globalna dostępna w całej klasie.
    //konstrukcja zmiennych globalnych
    //modyfikator dostępu
    //słowo kluczowe static - określa że nasza zmienna jest statyczna
    //TypDanych
    //nazwa zmiennej. Dobrą praktyką jest aby nazwa zmiennej globalnej była pisana wyłącznie z wielkich liter a kolejne słowa
    //oddzielone zostały znakiem '_'
    //następnie przypisanie wartości

    //Deklaracja metod
    //W przypadku metody uruchomieniowej powinna ona występować tylko raz w całym projekcie
    //Konstrukcja metory uruchomieniowej:
    //modyfikator dostępu zawsze jako public
    //słowo kluczowe static
    //typ  metody zawsze void
    //nazwa metody zawsze main
    //parametry wejściowe metody, może ich nie być
    // ale z reguły powinna być to tablica args (tj. String[] args)
    public static void main(String[] args) {
        Basics testKonstr = new Basics(124);


        //UWAGA należy pilnować {} metody aby nie piesać tzw. metody w metodzie
        //W ramach metody uruchomieniowej możemy deklarować zmienne oraz pisać kod,
//    natomiast dobrą praktyką jest aby metoda uruchomieniowa wywoływała konkretne klasy
        // z kodem, który chcemy uruchomić.

        //pierwsze rozwiązanie
        Basics basics = new Basics();
        basics.wyswietlTekst1("Jakiś tekst do wyświetlenia");

//drugie rozwiązanie
        Basics basics2 = new Basics(" Nowy tekst do wyświetlenia ");
        basics2.wyswietlTekst2("Jakiś tekst do wyświetlenia");


//trzecie rozwiązanie
        Basics basics3 = new Basics("tekst1", "tekst2", " tekst3");
        basics3.wyswietlTekst3("Jakiś tekst do wyświetlenia");

        BasicsInteger basicsInteger = new BasicsInteger();
        basicsInteger.wyswitelLiczbe(1234);
        basicsInteger.wyswietlLiczbe2(1234);

        Integer a = 1;
        Integer b = 1;
        String c= "Wyswietl tekst";
        //ctrl space po kropce podaje metody ktore mamy w kodie

        basics.wyswietlTekst1(c + " "+basicsInteger.sumaIntow(a, b));
        InstrukcjeWarunkowe instrukcjeWarunkowee=new InstrukcjeWarunkowe();
       instrukcjeWarunkowee.sprawdzenieRownosci(5);
    }

    //Należy pamiętać, że metody funkcjonalne deklarujemy w taki sposób:
    //nie mają słowka static
    //modyfikator dostępu może być public /private / protected/ default
    //Typ zwracajych informacji, aczkolwiem może metoda nic nie zwracać.
    //void - jeśli metoda nic nie zwraca
    //String/Integer/BigDecimal/Model/........ jeśli chcemy aby nasza metoda zwracała
    //konkretny typ danych i była możliwa bo użycia w innym miejscu np. klasy lub projektu
    //Należy pamiętać aby nazwy metod były pisane camelCase'm z zastrzeżeniem
    // że pierwsza litera jest mała
    public String nazwaMetody() {
        return ""; //return zawsze musi się pojawić jeśli nasza metoda jest inna niż void
    }

    public void wyswietlTekst(String tekst) {
        System.out.println(tekst);
    }

    private Integer kolejnaMetoda() {

        //w tym miejscu możliwe jest deklarowanie zmiennych
        //używanie instrukcji warunkowych
        //uzywanie pętli
        //uzywanie innych metod lub odwołanie do metod innych klad poprzez wcześniejszą deklaracje
        return 0;
    }

    //w tym miejscu możemy deklarować kolejne metody ich ilość jest dowolna.
    //Zalecana wielość klasy nie powinna przekroczyć 200 linii pliku

}