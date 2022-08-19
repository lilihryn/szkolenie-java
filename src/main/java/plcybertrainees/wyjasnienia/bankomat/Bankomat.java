package plcybertrainees.wyjasnienia.bankomat;

public class Bankomat {
    private Integer saldo;

    public Bankomat() {
        this.saldo = 0;
    }

    public Integer stanKonta() {
        return this.saldo;
    }

    public void wplacGotuwke(final Integer kwota) {
        this.saldo+=kwota;//=saldo+kwota;
    }

    public void sprawdzWyplate(final Integer kwota) {
        if(this.saldo-kwota<0){
            throw new StanKontaBankomatuException("Nie wystarczyc srodkow w bankomacie");
        }

    }

    public void wyplacGotuwke(final Integer kwota) {
        this.saldo-=kwota;
    }
}
