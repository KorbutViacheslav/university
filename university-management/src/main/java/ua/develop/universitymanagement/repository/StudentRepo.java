package ua.develop.universitymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.develop.universitymanagement.model.Student;

import java.util.UUID;

@Repository
public interface StudentRepo extends JpaRepository<Student, UUID> {
}
