package ua.develop.universitymanagement.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.develop.universitymanagement.dto.student.StudentRead;
import ua.develop.universitymanagement.dto.student.StudentSave;
import ua.develop.universitymanagement.exceptions.custom.StudentAlreadyExistsException;
import ua.develop.universitymanagement.exceptions.custom.StudentNotFoundException;
import ua.develop.universitymanagement.mapper.StudentMapper;
import ua.develop.universitymanagement.model.Student;
import ua.develop.universitymanagement.repository.StudentRepo;
import ua.develop.universitymanagement.service.StudentService;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepo studentRepo;
    private final StudentMapper studentMapper;

    @Override
    public Student saveStudent(StudentSave studentSave) {

        Student student = geStudent(studentSave);

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
        if (!studentRepo.existsById(id)) {
            throw new StudentNotFoundException(id.toString());
        }
        studentRepo.deleteById(id);
    }

    private Student getStudent(UUID id) {
        return studentRepo.findById(id)
                .orElseThrow(NoSuchElementException::new);
    }

    private Student geStudent(StudentSave studentSave) {
        Optional<Student> student = studentRepo.getStudentByFirstNameAndLastNameAndPhoneNumber(
                studentSave.firstName(),
                studentSave.lastName(),
                studentSave.phoneNumber());
        if (student.isPresent()) {
            throw new StudentAlreadyExistsException(student.get().getStudentId().toString());
        }
        return studentMapper.toStudent(studentSave);
    }
}
