package plcybertrainees.wyjasnienia;

import plcybertrainees.wyjasnienia.Wyjatek.MojPierwszyException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Wyjatki {
    public void uruchom() throws Exception {


//        dzielenieLiczb();
        dzielenieLiczb2();
        pierwiastek();
        pierwiastekAlternatywa();
        pierwiastek2();
        //wyswietlString(null);
        //Zadanie3(null);
        //wyswietlString2();
        try {
            pobierzInformacjeZPliku();
        } catch (MojPierwszyException e) {
            System.out.println("Komunikat pobierz informacje z pliku");
        }

        try {
            pierwszaMetoda();
        } catch (MojPierwszyException e) {
            System.out.println("Komunikat pierwsza metoda");
        }
    }
    // IndexOutOfBoundsException
    //IOException
    //IllegalArgumentException
    //throw new IOException();>> wywolanie wyjatku w kodzie
    //2 rodzaje wyjatkow
    //1-checked-programista zawsze musze otwórzyć, bez czego program nie zadziala
    // naprzyklad IOException, ponieważ dziedzicze on po klasie Exception
    //2-unchecked-'nie zagrażające dzialaniu aplikacji',
    // tego typu wyjatek może być wżuczony przez aplikacje i aplikacja nadal bede dzialala nie zależnie od niego
    //naprzyklad  IndexOutOfBoundsException ponieważ dziedzicze po klasie RuntimeException
    //Exception in thread "main" java.lang.ArithmeticException: / by zero
    //	at plcybertrainees.wyjasnienia.Wyjatki.dzielenieLiczb(Wyjatki.java:34)
    //	at plcybertrainees.wyjasnienia.Wyjatki.uruchom(Wyjatki.java:7)
    //	at plcybertrainees.SimpleApp.main(SimpleApp.java:138)

    /*
    obsługa wyjątkow
    poprzez słowo kłuczowe>> throws
    priate void  dzielenieLiczb(Integer a, Integer b) throws IOException{
    }StrackTrace-iformacja o wyjatku w terminale
     */
    private void dzielenieLiczb() throws IOException {
        // użyć scannera, dwie zmienne od użytkownika i wykonać dzielenie liczb

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj cale a");
        Integer a = scanner.nextInt();
        System.out.println("Podaj cale b");
        Integer b = scanner.nextInt();

        System.out.println("Wynik dzielenia:" + a / b);
        throw new IOException("Test");// musze być od początku, w simple app, w klasie uruchom, w metodie i w srodku metody

        /*
        Obsluga w zalecany sposób
        konstrukcja try/catch

        try{ kod który może generować jakiś exception, może być checked oraz unchecked
        throw newIOException("test");
        }
        catch(IOException ex){
        System.out.println("Wiadomość);
        }
        try{  System.out.println("Wynik dzielenia:" + a / b);
        }
        catch(AritmethicException ex){
        System.out.println("NIedozwolone dzielenie przez 0");
        }

         */
    }

    private void dzielenieLiczb2() {
        // użyć scannera, dwie zmienne od użytkownika i wykonać dzielenie liczb

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj cale a");
        Integer a = scanner.nextInt();
        System.out.println("Podaj cale b");
        Integer b = scanner.nextInt();
        try {

            System.out.println("Wynik dzielenia:" + a / b);
        } catch (ArithmeticException ex) {
            System.out.println("Dzielenie przez null");
        }


    }
    //rozwiencie konstrukcji try/catch
    /* try{System.out.println("Wynik dzielenia:" + a / b);}
    catch(RuntimeException ex){
     System.out.println("ojej");}
     catch(Exception ex){
     System.out.println("Cos sie stalo");}
     catch(IllegalArgumentException ex){
     System.out.println("Podaj poprawne informacje");
     }
     catch(RuntimeException ex|IllegalArgumentException ex){
     System.out.println("Podaj poprawne informacje");
     }
     możemy stosować konstrukcji uniwersalnej finally

     try{
     throw new IOException("test");
     }
     finally{
     System.out.println("Podaj poprawne informacje");
     }
     block finally bede wykonany tak czy inaczej, bez wzglądu na te czy zostal obslużony wyjątek


     DOBRE PRAKTYKI PRZY UŻYWANIU WYJĄTKÓW
     1) block try musze miec jaknajmniej kodu do weryfikacji;
     2) powinniśmi używać szczególowych wyjątków np IllegalArgumentException zamiast Exception
     3) w bloku catch należy podać najbardziej szczególowe informacje o problemie z ich opisem
     4) używamy wyjątków typu checked
     */

    //zadanie pobrać od użytkownika liczby i wyswietli jej piewiastek
    // jezeli liczba ujemna to nalezyc rzuczć IllegalArgumentException
    //oraz ciąg znaków która nie jest liczbą


    private void pierwiastek() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe dla pierwistka");
        Integer c = 0;
        try {
            c = scanner.nextInt();//<-- try{} catch() do weryfikacji czy nie mamy InputMismatchException
        } catch (InputMismatchException ex) {
            System.out.println("Zostala podana ina wartość");

        } catch (Exception ex) {
            System.out.println("Inny bląd");
        }


        //if(c<0){
//        throw new IllegalArgumentException();


        if (c > 0) {
            System.out.println("Pierwiastek " + Math.sqrt(c));


        } else {
            System.out.println("Liczba muszę być dodatnia");
        }

    }

    private void pierwiastek2() {
        Scanner scan = new Scanner(System.in);
        Integer liczba = null;
        try {
            liczba = scan.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Została podana inna wartość niż liczba!!");
            liczba = 0;
        }

        if (liczba < 0) {
            throw new IllegalArgumentException("Została podana liczba ujemna!");
        }

        System.out.println("Pierwiastek liczby " + liczba + " to: " + Math.sqrt(liczba));
    }

    private void pierwiastekAlternatywa() {
        Scanner scan = new Scanner(System.in);
        String liczba = scan.next();

        try {
            if ("".equals(liczba) || Integer.parseInt(liczba) < 0) {
                throw new IllegalArgumentException("Została podana liczba ujemna!");
            }
        } catch (NumberFormatException e) {
            System.out.println(" Get Message: " + e.getMessage());
            System.out.println(" Get StackTrace: ");
            for (StackTraceElement element : e.getStackTrace()) {
                System.out.println(element);
            }
            System.out.println();
            throw new IllegalArgumentException("Została podana inna wartość niż liczbowa jej wartość: " + liczba);
        }
        System.out.println("Pierwiastek liczby " + liczba + " to: " + Math.sqrt(Integer.parseInt(liczba)));
    }

    //Zadanie 3
    //Przekaż do tej metody null i zobacz, jaki wyjątek został zgłoszony.
    //metoda powinna przyjąc parametr oraz zwrócić wartość
    //przekazały String a returnem string.length()


    //Zadanie 4
    //Rozwinięcie zadania 3
    // obsłużenie tego wyjątku

  /*  private Integer wyswietlString(String s) {

        return s.length();
    }

    private Integer wyswietlString2() {
        String scan = null;
        return scan.length();
    }


    private Integer Zadanie3(String s) {

        try {
            return s.length();
        } catch (NullPointerException e) {
            System.out.println("Zostala podana wartość null");
        }
        return 0;
    }*/

    private void pobierzInformacjeZPliku() throws MojPierwszyException {
        Scanner scan;
        try {
            scan = new Scanner(
                    new File("src/main/java/resources/test.txt")
            );
        } catch (FileNotFoundException e) {
            throw new MojPierwszyException("Komunikatnaszego blędu");//korzystam z menu inteliji przy blądach
        }
        System.out.println(scan.nextLine());
    }

    //2 metody 2 rodzaje exceptions
    // checked dzidziće po exception
//unchecked dziedzicze po runtimeexception
//pierwsza metoda powinna wykonywać dzielenie
//zwraca przygotowany przez nas Exception typu check (uwaga throws)
    private void pierwszaMetoda() throws MojPierwszyException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj cale w metodie1 a");
        Integer a = scanner.nextInt();
        System.out.println("Podaj cale w metodi1 b");
        Integer b = scanner.nextInt();
        try {

            System.out.println("Wynik dzielenia:" + a / b);
        } catch (ArithmeticException ex) {
            throw new MojPierwszyException("Niepoprawne dzielenie");
        }

    }
}
