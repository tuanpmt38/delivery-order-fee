package vn.shippo.deliveryorderfee.exception;

import org.springframework.http.HttpStatus;

public class ApiError {

    private HttpStatus status;

    private String message;

    private String name;

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

    public ApiError(HttpStatus httpStatus, String message, String name) {
        this.status = httpStatus;
        this.message = message;
        this.name = name;
    }

    public ApiError(HttpStatus status) {
        this.status = status;
    }

    public ApiError(String message){
        this.message = message;
    }

}

