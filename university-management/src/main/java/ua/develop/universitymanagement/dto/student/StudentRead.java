package ua.develop.universitymanagement.dto.student;

import io.swagger.v3.oas.annotations.media.Schema;
import ua.develop.universitymanagement.dto.group.AcademicGroupRead;

import java.time.LocalDate;

public record StudentRead(
        @Schema(description = "Student name", example = "Michael")
        String firstName,

        @Schema(description = "Student last name", example = "Jackson")
        String lastName,

        @Schema(description = "Date of birth", example = "2000-01-01")
        LocalDate dateOfBirth,

        @Schema(description = "Date of admission", example = "2023-09-01")
        LocalDate dateOfAdmission,

        @Schema(description = "Student email", example = "michael.jackson@gmail.com")
        String email,

        @Schema(description = "Student phone number", example = "+380630505055")
        String phoneNumber,

        AcademicGroupRead group) {
}
