package plcybertrainees.wyjasnienia.bankomat;

public class StanKontaBankomatuException extends RuntimeException{
    public StanKontaBankomatuException(final String message) {//przez constructor,opcja message
        super(message);
    }
}
