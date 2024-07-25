package ua.develop.universitymanagement.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID studentId;

    private String firstName;

    private String lastName;

    private LocalDate dateOfBirth;

    private LocalDate dateOfAdmission;

    private String email;

    private String phoneNumber;

    @ManyToOne()
    @JoinColumn(name = "academic_group_id")
    @JsonBackReference
    private AcademicGroup academicGroup;


}
