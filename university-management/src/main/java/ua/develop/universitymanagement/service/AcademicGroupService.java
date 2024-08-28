package ua.develop.universitymanagement.service;

import ua.develop.universitymanagement.model.AcademicGroup;

public interface AcademicGroupService {
    AcademicGroup saveAcademicGroup(AcademicGroup academicGroup);
    AcademicGroup getAcademicGroupById(int id);
}
