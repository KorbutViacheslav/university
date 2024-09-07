package ua.develop.universitymanagement.service;

import ua.develop.universitymanagement.model.AcademicGroup;

public interface AcademicGroupService {
    AcademicGroup saveAcademicGroup(AcademicGroup academicGroup);

    AcademicGroup getAcademicGroupById(Integer id);

    AcademicGroup updateAcademicGroupById(AcademicGroup academicGroup, Integer id);

    AcademicGroup deleteAcademicGroupById(Integer id);
}
