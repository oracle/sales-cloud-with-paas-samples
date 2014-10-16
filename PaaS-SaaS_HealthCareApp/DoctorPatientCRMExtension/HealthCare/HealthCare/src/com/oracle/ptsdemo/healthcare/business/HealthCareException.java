package com.oracle.ptsdemo.healthcare.business;

public class HealthCareException extends Exception {
    @SuppressWarnings("compatibility:7765396036789060778")
    private static final long serialVersionUID = 3672655663746425695L;

    public HealthCareException(Throwable throwable) {
        super(throwable);
    }

    public HealthCareException(String string, Throwable throwable) {
        super(string, throwable);
    }

    public HealthCareException(String string) {
        super(string);
    }

    public HealthCareException() {
        super();
    }
}
