package ua.develop.universitymanagement.dto.student;

import java.time.LocalDate;

public record StudentSave(String firstName,

                          String lastName,

                          LocalDate dateOfBirth,

                          LocalDate dateOfAdmission,

                          String email,

                          String phoneNumber) {
}
