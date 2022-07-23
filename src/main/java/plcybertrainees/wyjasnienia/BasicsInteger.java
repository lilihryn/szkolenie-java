package plcybertrainees.wyjasnienia;

public class BasicsInteger {
    // metoda która wyświetli liczbe z podanego parametru
    //wprowadzona liczba to: 1234



  /*  public void wyswietlCale(Integer cale) {

        System.out.println("Wprowadzona liczba " + cale);
    }moja sproba
*/

    /* warte zapamiątanie
    konstrukcja klasy

    public class NazwaKlasy{
    }


    konstrukcja metody w klasie
    public class NazwaKlasy{
    public void NazwaMetody(){
    }
    }
    blędne konstrukcje metod
    public class NazwaKlasy{

    publicString metodaA();niema nawisów, początku i końca
    String public metodaB(){}- najpierw modyfikator wtedy typ dannych
    }
    */
    //rozwiązanie
    public void wyswitelLiczbe(Integer liczbaDoWyswietlenia) {
        System.out.println(liczbaDoWyswietlenia);
    }

    public void wyswietlLiczbe2(Integer liczbaDoWyswietlenia) {
        System.out.println("Wprowadzona liczba to" + liczbaDoWyswietlenia);
    }
    // utorzyć metody która przymuje 3 parametry String,Integer,Integer
    //String "Wynik dodawania"
    //Integer liczba która bedemy dodawać

    public void dodawanieParametrow(String c, Integer a, Integer b) {
//        System.out.println(c);
//        System.out.println(a+b);
        //konstrukcja konkatenacji stringów/stringów z liczbami/stringów z wyrażeniami arytmetycznymi
        System.out.println(c + (a + b));
    }
    //Utworzyć metodę która zawraca wynik dodawania dwóch integerów
    //w klasie SimpleApp powinniśmi prekazać ten wynik do metody Basics, wyswietlText();

    public Integer sumaIntow(Integer a, Integer b){
        return a+b;
    }
}
//klasa praca domowa w ramie utworzyć 6 metod praca domowa


