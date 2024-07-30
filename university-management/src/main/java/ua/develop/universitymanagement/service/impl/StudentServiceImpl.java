package ua.develop.universitymanagement.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import ua.develop.universitymanagement.dto.student.StudentRead;
import ua.develop.universitymanagement.dto.student.StudentSave;
import ua.develop.universitymanagement.mapper.StudentMapper;
import ua.develop.universitymanagement.model.Student;
import ua.develop.universitymanagement.repository.StudentRepo;
import ua.develop.universitymanagement.service.StudentService;

import java.util.NoSuchElementException;
import java.util.UUID;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepo studentRepo;
    private final StudentMapper studentMapper;

    @Override
    public Student saveStudent(StudentSave studentSave) {
        Student student = studentMapper.toStudent(studentSave);
        return studentRepo.save(student);
    }

    @Override
    public StudentRead getStudentById(UUID id) {
        return studentRepo
                .findById(id)
                .map(studentMapper::toStudentRead)
                .orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Student updateStudentById(StudentSave student, UUID id) {
        return null;
    }

    @Override
    public void deleteStudentById(UUID id) {
        try {
            Student student = studentRepo
                    .findById(id)
                    .orElseThrow(ChangeSetPersister.NotFoundException::new);
        } catch (ChangeSetPersister.NotFoundException e) {
            throw new RuntimeException(e);
        }
        studentRepo.deleteById(id);
    }
}
