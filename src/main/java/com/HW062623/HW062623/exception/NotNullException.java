package com.HW062623.HW062623.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NotNullException extends IllegalArgumentException {
    public NotNullException(){

    }

    public NotNullException(String s) {
        super(s);
    }

    public NotNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotNullException(Throwable cause) {
        super(cause);
    }

}
