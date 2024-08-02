package ua.develop.universitymanagement.exceptions.custom;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message) {
        super(message);
    }
}
