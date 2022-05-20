package co.com.app.exceptions;

public class StatusException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = -8517480541563809506L;


    public StatusException(String errorMessage) {
        super(errorMessage);
    }

}
