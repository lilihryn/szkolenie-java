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

    public Integer getNrKarty() {
        return nrKarty;
    }

    public boolean sprawdzPin(final Integer pinKarty) {
        if(!this.pinKarty.equals((pinKarty))){
            throw new KartaException("Niepoprawny pin do karty");

        }
        return false;
    }
}
