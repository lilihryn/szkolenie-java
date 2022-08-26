package plcybertrainees.wyjasnienia.bankomat


import spock.lang.Specification

class BankomatServiceSpec extends Specification {

    private BankomatService underTest = new BankomatService()

    def "Sprawdzam wybrana pozycja nr0"() {
        when:

        def result = underTest.menu2(0, null)
        then:
        noExceptionThrown()
        result == false
        //!result

    }


}