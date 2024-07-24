package ua.develop.universitymanagement.web.controller;

import ua.develop.universitymanagement.model.Student;

import java.util.UUID;

public interface StudentController {

    Student createStudent(Student student);

    Student getStudentById(UUID id);

    void deleteStudentById(UUID id);
    Student updateStudentById(Student student, UUID id);
}
