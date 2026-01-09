public class NumberNotSuitableException extends Exception {
    public NumberNotSuitableException(){}
    public NumberNotSuitableException(String message){
        super(message);
    }
    public NumberNotSuitableException(Throwable cause){
        super(cause);
    }
    public NumberNotSuitableException(String message, Throwable cause){
        super(message,cause);
    }
}
