package com.java.test.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class ReportingException extends RuntimeException {
    private HttpStatus httpStatus;

    public ReportingException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    public ReportingException(String message, Throwable cause, HttpStatus httpStatus) {
        super(message, cause);
        this.httpStatus = httpStatus;
    }
}
