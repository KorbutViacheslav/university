package ua.develop.universitymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.develop.universitymanagement.model.AcademicGroup;

public interface AcademicGroupRepo extends JpaRepository<AcademicGroup, Integer> {
}
