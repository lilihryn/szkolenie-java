package plcybertrainees.wyjasnienia.bankomat;

public class Karta {
    private final Integer nrKarty;
    private final Integer pinKarty;
    private Integer saldo;

    public Karta(final Integer nrKarty, final Integer pinKarty, final Integer saldo) {//przez konstruktor
        this.nrKarty = nrKarty;
        this.pinKarty = pinKarty;
        this.saldo = saldo;
    }

    public Integer getNrKarty() {return nrKarty;
    }

    public Integer getPinKarty() {return pinKarty;
    }

    public Integer getSaldo() {return saldo;
    }

    public boolean sprawdzPin(final Integer pinKarty) {
        if (!this.pinKarty.equals((pinKarty))) {
            throw new KartaException("Niepoprawny pin do karty");

        }
        return false;
    }

    public void wplacGotuwke(final Integer kwota) {
        this.saldo += kwota;
    }

    public void sprawdzWyplate(final Integer kwota) {
        if (this.saldo - kwota < 0) {
            throw new KartaException("Nie wystarczająca ilość ");
        }
    }

    public void wyplacGotuwke(final Integer kwota) {
        this.saldo -= kwota;
    }

    public Integer stanKonta() {
        return this.saldo;
    }
}
