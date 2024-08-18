package ua.develop.universitymanagement.dto.group;

import io.swagger.v3.oas.annotations.media.Schema;
import ua.develop.universitymanagement.dto.student.StudentRead;

import java.util.Set;

public record AcademicGroupRead(
        @Schema(description = "Group number", example = "TE58")
        String groupNumber,

        @Schema(description = "Department of the group", example = "Transport Engineering")
        String department,

        Set<StudentRead> students) {
}
