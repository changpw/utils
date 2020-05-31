package com.cpw.exception;

public class MyException extends RuntimeException {
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
        System.out.println(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
        System.out.println(message+cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }

}
