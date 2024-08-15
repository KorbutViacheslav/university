package ua.develop.universitymanagement.web.controller;

import ua.develop.universitymanagement.dto.student.StudentRead;
import ua.develop.universitymanagement.dto.student.StudentSave;
import ua.develop.universitymanagement.model.Student;

import java.util.List;
import java.util.UUID;

public interface StudentController {

    Student createStudent(StudentSave studentSave);

    StudentRead getStudentById(UUID id);

    void deleteStudentById(UUID id);

    Student updateStudentById(StudentSave student, UUID id);

    List<StudentRead> getAllStudents();
    //For testing online
    List<Student> getAll();
}
