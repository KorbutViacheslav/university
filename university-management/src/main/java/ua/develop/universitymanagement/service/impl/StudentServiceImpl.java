package ua.develop.universitymanagement.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.develop.universitymanagement.model.Student;
import ua.develop.universitymanagement.repository.StudentRepo;
import ua.develop.universitymanagement.service.StudentService;

import java.util.UUID;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    private StudentRepo studentRepo;

    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student getStudentById(UUID id) {
        return studentRepo.getReferenceById(id);
    }

    @Override
    public Student updateStudentById(Student student, UUID id) {
        return null;
    }

    @Override
    public void deleteStudentById(UUID id) {
        studentRepo.deleteById(id);
    }
}
