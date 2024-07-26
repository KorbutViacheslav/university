package ua.develop.universitymanagement.dto.group;

import ua.develop.universitymanagement.dto.student.StudentRead;

import java.util.Set;

public record AcademicGroupRead(String groupNumber,

                                String department,

                                Set<StudentRead> students) {
}
