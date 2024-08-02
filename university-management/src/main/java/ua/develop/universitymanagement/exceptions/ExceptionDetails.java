package ua.develop.universitymanagement.exceptions;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ExceptionDetails {
    private int status;
    private String message;
    private LocalDateTime timestamp;
    private String details;

    public ExceptionDetails(int status, String message, String details) {
        this.status = status;
        this.message = message;
        this.timestamp = LocalDateTime.now();
        this.details = details;
    }
}
