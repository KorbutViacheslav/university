package ua.develop.universitymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.develop.universitymanagement.model.Student;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface StudentRepo extends JpaRepository<Student, UUID> {
    /**
     * @param firstName
     * @param lastName
     * @param phoneNumber
     * @return
     */
    Optional<Student> getStudentByFirstNameAndLastNameAndPhoneNumber(String firstName, String lastName, String phoneNumber);
}
