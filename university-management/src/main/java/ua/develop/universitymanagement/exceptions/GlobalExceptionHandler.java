package ua.develop.universitymanagement.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import ua.develop.universitymanagement.exceptions.custom.StudentAlreadyExistsException;
import ua.develop.universitymanagement.exceptions.custom.StudentNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
    private static final String STUDENT_NOT_FOUND = "Student not found with id: ";
    private static final String STUDENT_ALREADY_EXISTS = "Student already exists with id: ";

    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<ExceptionDetails> handleStudentNotFoundException(StudentNotFoundException ex, WebRequest request) {
        ExceptionDetails details = new ExceptionDetails(
                HttpStatus.NOT_FOUND.value(),
                STUDENT_NOT_FOUND + ex.getMessage(),
                request.getDescription(false)
        );
        return new ResponseEntity<>(details, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(StudentAlreadyExistsException.class)
    public ResponseEntity<ExceptionDetails> handleStudentAlreadyExistsException(StudentAlreadyExistsException ex, WebRequest request) {
        ExceptionDetails details = new ExceptionDetails(
                HttpStatus.CONFLICT.value(),
                STUDENT_ALREADY_EXISTS + ex.getMessage(),
                request.getDescription(false)
        );
        return new ResponseEntity<>(details, HttpStatus.CONFLICT);
    }
}
