package plcybertrainees.wyjasnienia.bankomat;

public class BusinessException extends RuntimeException{
    public BusinessException(final String message) {
        super(message);
    }
}
