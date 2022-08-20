package plcybertrainees.wyjasnienia.bankomat

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class KartaSpec extends Specification {

    //nie musze miec modyfikatoru dostempu
    //ma import spock.lang.Specification;
    //extends Specification
    //na nazwie clasy (Karta)clickamy alt enter,wtedy podtwierdzamy ok,wtedy obieramy create test
    //test musze byc w main
    //mark directory as test saurse root
    //sprawdzaje tylko jednę klase Karty
    //dla tego zeby pracowala prawidlowo musimy zanicializowac prawidlow, zdefiniowac parametry klasy testowj

    private Karta underTest
    // w jeszyku spok niema typu dannych, nazwa zmiannej musze byc taka sama jak w obiekcie testowanym
    static def nrKartyStub = 12345678//preferowany sposób deklaracji zmiannych
    @Shared
    def pinKartyStub = 1234//inny sposob deklaracji zmiannych
    static def saldoStub = 0

    //modul metoda stratowa tak zwany uruchom
    void setup() {
        // underTest=new Karta(12345678,1234,0)
    }

    def "Subject"()
    //przypadek testowy"co dziala"(){}
    {
        //przypadki testowe,deklaracje sekcji testowej
        given:
        //sekcja w której robimy mokowanie objektów, inicializujemy zmienny lokalne dla przypadku testowego
        //jest sekcją niobowiazkową
        when:
        //sekcja w której wykonujemy nasz przypadek testowy i zazwyczaj powinnismy deklarowac w tym miejscu parametr który
        //bede naszym wynikiem;miejsce w którymsię dzieje test
        def result = "test"
        then:
        //sekcja w której weryfikujemy nasze zalożenie w ramch przypadku testowego
        noExceptionThrown()
        //jeżeli nie oczekujemy blądów(Exception)

        /*
            where: sekcja w której bedemy deklarowli wiele parametrów wejsciowych, oraz przewidywane ich wyniki

             struktura:
             where:
             parametr1|parametr2||wynik
             1241     |15677    || 4566
             */


    }

    def "Przyklad nie powiazany  z Karty"()

    {
        given:
        def zmienna1 = 2
        def zmienna2 = 5

        when:
        def result = zmienna1 + zmienna2
        print(result as String)

        then:

        noExceptionThrown()
        result != null
        result == 7


    }

    @Unroll
//wykorzystamy zwykle przy tworzeniu testów z where

    def "Przyklad nie powiazanyz Karty z where"()

    {

        when:
        def result = zmienna1 + zmienna2
        then:
        noExceptionThrown()
        result != null
        result == expectedResult
        where:
        zmienna1 | zmienna2 || expectedResult
        1        | 1        || 2
        10       | 100      || 110
        -10      | 10       || 0
        -100     | -100     || -200


    }

    def "Powinien prawidlowo utworzyc obiekt Karta przez konstruktor oraz zweryfikować jego parametry"()

    {

        when:
        def result = new Karta(nrKartyStub, pinKartyStub, saldoStub)

        then:


        noExceptionThrown()
        result != null
        result.nrKarty == nrKartyStub
        result.pinKarty == pinKartyStub
        result.saldo == saldoStub


    }

    def "Powinen prawidlowo utworzyć objekt Karta oraz zweryfikować czy użytkownik podal prawidlowo Pin.Happy Path"() {
        given:
        def pinFromUser = 1234
        underTest = new Karta(nrKartyStub, pinKartyStub, saldoStub)
        when:
        underTest.sprawdzPin(pinFromUser)
        then:

        noExceptionThrown()
    }

    def "Powinen prawidlowo utworzyć objekt Karta oraz zweryfikować czy użytkownik podal prawidlowo Pin.not Happy Path"() {
        given:

        underTest = new Karta(nrKartyStub, pinKartyStub, saldoStub)//co sie testuje
        when:
        underTest.sprawdzPin(pinFromUser)//szczególowe
        then:
        def err=thrown(expected)
        err.message==expectedMessage

        where:
        pinFromUser||expected|expectedMessage
        8888||KartaException|"Niepoprawny pin do karty"//musze być tak samo jak i w karta sprawdzPin
        9999||KartaException|"Niepoprawny pin do karty"
        1010||KartaException|"Niepoprawny pin do karty"
        7567||KartaException|"Niepoprawny pin do karty"

    }
    def"Saldo karty"(){
        given:
        underTest = new Karta(nrKartyStub, pinKartyStub, saldoStub)//co sie testuje
        when:
        def result=underTest.stanKonta()//breakpoint,gdzie chcemy sprawdzić
        then:
        noExceptionThrown()
        result==saldoStub
    }
    def"Wplata wyplata gotówke ,sprawdzanie stanu konta"(){
        given:
        underTest = new Karta(nrKartyStub, pinKartyStub, saldoStub)//co sie testuje
        when:
        underTest.wplacGotuwke(100)
        def result=underTest.stanKonta()//breakpoint,gdzie chcemy sprawdzić
        then:
        noExceptionThrown()
        result==100
    }
    // praca domowa test sprawdzania wyplaty+testy na klasy ktore mamy 2 sposoby happy path not happy path
}
