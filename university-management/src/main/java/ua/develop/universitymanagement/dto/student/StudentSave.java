package ua.develop.universitymanagement.dto.student;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public record StudentSave(
        @Pattern(regexp = "^[A-Z][a-z]+$", message = "Invalid student first name format")
        @Size(min = 2, max = 32, message = "Name must be between 2 and 32 characters long")
        @Schema(description = "Student name", example = "Michael")
        String firstName,

        @Pattern(regexp = "^[A-Z][a-zA-Z.]+$", message = "Invalid student last name format")
        @Size(min = 2, max = 32, message = "Name must be between 2 and 32 characters long")
        @Schema(description = "Student last name", example = "Jackson")
        String lastName,

        @NotNull(message = "Date of birth is required")
        @Past(message = "Date of birth must be in the past")
        @Schema(description = "Date of birth", example = "2000-01-01")
        LocalDate dateOfBirth,

        @NotNull(message = "Date of admission is required")
        @Schema(description = "Date of admission", example = "2023-09-01")
        LocalDate dateOfAdmission,

        @Email(message = "Invalid email format")
        @NotNull(message = "Email is required")
        @Schema(description = "Student email", example = "michael.jackson@gmail.com")
        String email,

        @Pattern(regexp = "^\\+\\d{12}$", message = "Phone number must start with '+' and contain exactly 12 digits")
        @Schema(description = "Student phone number", example = "+380630505055")
        String phoneNumber) {
}
