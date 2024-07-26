package ua.develop.universitymanagement.dto.student;

import ua.develop.universitymanagement.dto.group.AcademicGroupRead;

import java.time.LocalDate;

public record StudentRead(String firstName,

                          String lastName,

                          LocalDate dateOfBirth,

                          LocalDate dateOfAdmission,

                          String email,

                          String phoneNumber,

                          AcademicGroupRead group) {
}
