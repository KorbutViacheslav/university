package ua.develop.universitymanagement.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ua.develop.universitymanagement.model.Student;

import java.util.UUID;

public interface StudentController {

    public Student createStudent(Student student);

    public Student getStudentById(UUID id);

    public void deleteStudentById(UUID id);
}
