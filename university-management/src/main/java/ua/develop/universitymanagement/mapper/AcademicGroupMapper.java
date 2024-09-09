package ua.develop.universitymanagement.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ua.develop.universitymanagement.dto.group.AcademicGroupRead;
import ua.develop.universitymanagement.dto.group.AcademicGroupSave;
import ua.develop.universitymanagement.model.AcademicGroup;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AcademicGroupMapper {

    AcademicGroupMapper INSTANCE = Mappers.getMapper(AcademicGroupMapper.class);

    AcademicGroupRead toAcademicGroupSave (AcademicGroup academicGroup);

    AcademicGroupRead toAcademicGroupRead (AcademicGroup academicGroup);

    AcademicGroup toAcademicGroup (AcademicGroupSave academicGroupSave);

    List<AcademicGroupRead> toAcademicGroupReads (List<AcademicGroup> academicGroups);

}
