package ua.develop.universitymanagement.service;

import ua.develop.universitymanagement.model.Student;

import java.util.UUID;

public interface StudentService {

    Student saveStudent(Student student);

    Student getStudentById(UUID id);

    Student updateStudentById(Student student, UUID id);

    void deleteStudentById(UUID id);
}
