package com.atos.dk;

public class CustomerNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 7784812509339490442L;

    public CustomerNotFoundException(String exception) {
        super(exception);
    }

}