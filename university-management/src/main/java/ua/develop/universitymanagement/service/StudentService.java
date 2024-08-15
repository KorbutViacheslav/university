package ua.develop.universitymanagement.service;

import ua.develop.universitymanagement.dto.student.StudentRead;
import ua.develop.universitymanagement.dto.student.StudentSave;
import ua.develop.universitymanagement.model.Student;

import java.util.List;
import java.util.UUID;

public interface StudentService {

    Student saveStudent(StudentSave student);

    StudentRead getStudentById(UUID id);

    Student updateStudentById(StudentSave student, UUID id);

    void deleteStudentById(UUID id);

    List<StudentRead> getAllStudents();
    //For testing online
    List<Student> getAll();
}
