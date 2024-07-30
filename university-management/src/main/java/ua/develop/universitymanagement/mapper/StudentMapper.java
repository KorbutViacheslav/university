package ua.develop.universitymanagement.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ua.develop.universitymanagement.dto.student.StudentRead;
import ua.develop.universitymanagement.dto.student.StudentSave;
import ua.develop.universitymanagement.model.Student;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    StudentRead toStudentRead(Student student);

    StudentSave toStudentSave(Student student);

    @Mapping(target = "studentId", ignore = true)
    Student toStudent(StudentSave studentSave);

    List<Student> toStudentList(List<StudentSave> studentSaveList);

    List<StudentRead> toStudentReadList(List<Student> studentList);
}
