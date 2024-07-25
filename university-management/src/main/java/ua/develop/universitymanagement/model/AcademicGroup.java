package ua.develop.universitymanagement.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "academic_group")
public class AcademicGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer groupId;

    private String groupNumber;

    private String department;

    @OneToMany(mappedBy = "academicGroup", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Student> students = new HashSet<>();

}
