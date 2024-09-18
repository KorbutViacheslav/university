package ua.develop.universitymanagement.web.controller;

import ua.develop.universitymanagement.dto.group.AcademicGroupRead;
import ua.develop.universitymanagement.dto.group.AcademicGroupSave;

public interface AcademicGroupController {

    AcademicGroupRead createAcademicGroup(AcademicGroupSave academicGroupSave);

    AcademicGroupRead getAcademicGroupById(Integer id);

    AcademicGroupRead updateAcademicGroup(AcademicGroupSave academicGroupSave);

    void deleteAcademicGroupById(Integer id);
}
