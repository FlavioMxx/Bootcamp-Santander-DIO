package br.edu.flaviomxx.primeira_web_api_dio.handler;

import java.time.LocalDateTime;

public class ResponseError {
    private LocalDateTime timestamp = LocalDateTime.now();
    private String status = "error";
    private int statusCode = 400;
    private String error;

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
