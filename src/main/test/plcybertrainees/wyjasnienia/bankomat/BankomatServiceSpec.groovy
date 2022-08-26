package plcybertrainees.wyjasnienia.bankomat


import spock.lang.Specification

class BankomatServiceSpec extends Specification {

    private BankomatService underTest = new BankomatService()
    private Bankomat bankomat
    void setup(){
        bankomat=Mock()
    }

    def "Sprawdzam wybrana pozycja nr0"() {
        when:

        def result = underTest.menu2(0, null)
        then:
        noExceptionThrown()
        result == true
        //!result

    }
    def "Powinien dokonać wplaty gotuwke"(){
        given:
        bankomat.stanKonta()>>50//oczekujemy wartośći od metody bankomat
        def karta=new Karta(1234,1234,1000)
        when:
        underTest.dokonajWplaty(50,karta)
        then:
        noExceptionThrown()
        bankomat.stanKonta()==50
        karta.stanKonta()==1050
    }
    def "Powinien dokonać wyplaty gotuwke"(){
        given:
        bankomat.stanKonta()>>50//oczekujemy wartośći od metody bankomat
        def karta=new Karta(1234,1234,1000)
        def bankomat=new Bankomat()
        underTest=new BankomatService(bankomat)
        bankomat.wplacGotuwke(1000)
        when:
        underTest.dokonajWyplaty(50,karta)
        then:
        noExceptionThrown()
        bankomat.stanKonta()==950
        karta.stanKonta()==950
    }
    def "Wyswietliamy pozycje 3 z menu2"(){
        given:

        def karta=new Karta(1234,1234,1000)
        def bankomat=new Bankomat()
        underTest=new BankomatService(bankomat)
        bankomat.wplacGotuwke(1000)
        when:
        underTest.menu2(3,karta)
        then:
        noExceptionThrown()
        bankomat.stanKonta()==1000

    }

}