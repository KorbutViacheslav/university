package ua.develop.universitymanagement.service;

import ua.develop.universitymanagement.dto.group.AcademicGroupRead;
import ua.develop.universitymanagement.dto.group.AcademicGroupSave;

public interface AcademicGroupService {
    AcademicGroupRead saveAcademicGroup(AcademicGroupSave academicGroup);

    AcademicGroupRead getAcademicGroupById(Integer id);

    AcademicGroupRead updateAcademicGroupById(AcademicGroupSave academicGroupSave, Integer id);

    void deleteAcademicGroupById(Integer id);
}
