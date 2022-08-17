package plcybertrainees.wyjasnienia.bankomat;

public class StanKontaException extends RuntimeException{
    private final double stanKonta;

    public StanKontaException(String message, double stanKonta){
        super("Nie dostatnie srodkow na koncie!Dostepnych srodków:");
        this.stanKonta = stanKonta;
    }

}
