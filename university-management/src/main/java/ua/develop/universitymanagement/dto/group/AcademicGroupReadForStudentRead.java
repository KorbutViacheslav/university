package ua.develop.universitymanagement.dto.group;

import io.swagger.v3.oas.annotations.media.Schema;

public record AcademicGroupReadForStudentRead(
        @Schema(description = "Group number", example = "TE58")
        String groupNumber,
        @Schema(description = "Department of the group", example = "Transport Engineering")
        String department) {
}
