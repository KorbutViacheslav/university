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

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

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
                .orElseThrow(() -> new StudentNotFoundException(id.toString()));
    }

    @Override
    public Student updateStudentById(StudentSave student, UUID id) {
        return studentRepo.save(overrideStudent(student, id));
    }

    @Override
    public void deleteStudentById(UUID id) {
        if (!studentRepo.existsById(id)) {
            throw new StudentNotFoundException(id.toString());
        }
        studentRepo.deleteById(id);
    }

    @Override
    public List<StudentRead> getAllStudents() {
        return studentRepo.findAll()
                .stream()
                .map(studentMapper::toStudentRead)
                .collect(Collectors.toList());
    }

    private Student getStudent(UUID id) {
        return studentRepo.findById(id)
                .orElseThrow(() -> new StudentNotFoundException(id.toString()));
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

    private Student overrideStudent(StudentSave studentSave, UUID id) {
        Student dbStudent = getStudent(id);
        Student newStudent = new Student();
        newStudent.setFirstName(studentSave.firstName());
        newStudent.setLastName(studentSave.lastName());
        newStudent.setPhoneNumber(studentSave.phoneNumber());
        newStudent.setEmail(studentSave.email());
        newStudent.setStudentId(id);
        newStudent.setDateOfBirth(studentSave.dateOfBirth());
        newStudent.setDateOfAdmission(studentSave.dateOfAdmission());
        //delete old student
        deleteStudentById(dbStudent.getStudentId());
        return newStudent;
    }
}
