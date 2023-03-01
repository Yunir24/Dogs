package com.example.dogs;

public class DogImage {

    private String message;
    private String status;

    @Override
    public String toString() {
        return "DogImage{" +
                "message='" + message + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }

    public DogImage(String message, String status) {
        this.message = message;
        this.status = status;
    }
}
