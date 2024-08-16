package ua.develop.universitymanagement.dto.group;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record AcademicGroupSave(
        @Size(min = 2, max = 32, message = "Group number must be between 2 and 32 characters long")
        @Schema(description = "Group number", example = "TE58")
        String groupNumber,

        @Pattern(regexp = "^[A-Z][a-zA-Z]*(-[A-Z][a-zA-Z]*)?$", message = "Invalid name of the group.")
        @Size(min = 2, max = 32, message = "Name department of the group must be between 2 and 32 characters long")
        @Schema(description = "Department of the group", example = "Transport Engineering")
        String department) {
}
