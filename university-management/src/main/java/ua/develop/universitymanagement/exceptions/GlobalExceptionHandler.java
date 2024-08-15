package ua.develop.universitymanagement.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import ua.develop.universitymanagement.exceptions.custom.StudentAlreadyExistsException;
import ua.develop.universitymanagement.exceptions.custom.StudentNotFoundException;

import java.util.HashMap;
import java.util.Map;

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
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return ResponseEntity.badRequest().body(errors);
    }
}
