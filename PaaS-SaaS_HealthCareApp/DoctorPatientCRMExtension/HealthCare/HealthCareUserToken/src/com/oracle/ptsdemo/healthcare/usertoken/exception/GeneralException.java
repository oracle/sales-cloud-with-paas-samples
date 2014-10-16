package com.oracle.ptsdemo.healthcare.usertoken.exception;

public class GeneralException extends Exception {
    @SuppressWarnings("compatibility:-8079180916312418972")
    private static final long serialVersionUID = -5145456261686456270L;

    public GeneralException(Throwable throwable) {
        super(throwable);
    }

    public GeneralException(String string, Throwable throwable) {
        super(string, throwable);
    }

    public GeneralException(String string) {
        super(string);
    }

    public GeneralException() {
        super();
    }
}
