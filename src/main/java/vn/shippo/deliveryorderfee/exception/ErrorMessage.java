package vn.shippo.deliveryorderfee.exception;

import org.springframework.http.HttpStatus;

public class ErrorMessage {

    private HttpStatus status;

    private String message;

    private String name;

    private String debugMessage;


    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDebugMessage() {
        return debugMessage;
    }

    public void setDebugMessage(String debugMessage) {
        this.debugMessage = debugMessage;
    }

    public ErrorMessage(HttpStatus status, String message, String name, Throwable ex) {
        this.status = status;
        this.message = message;
        this.name = name;
        this.debugMessage = ex.getLocalizedMessage();

    }

    public ErrorMessage(HttpStatus status) {
        this.status = status;
    }

    public ErrorMessage(String message){
        this.message = message;
    }

}

