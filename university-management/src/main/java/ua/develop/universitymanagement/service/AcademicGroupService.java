package ua.develop.universitymanagement.service;

import org.springframework.stereotype.Service;
import ua.develop.universitymanagement.dto.group.AcademicGroupRead;
import ua.develop.universitymanagement.dto.group.AcademicGroupSave;
import ua.develop.universitymanagement.model.AcademicGroup;

public interface AcademicGroupService {
    AcademicGroupRead saveAcademicGroup(AcademicGroupSave academicGroup);

    AcademicGroup getAcademicGroupById(Integer id);

    AcademicGroup updateAcademicGroupById(AcademicGroupSave academicGroupSave, Integer id);

    void deleteAcademicGroupById(Integer id);
}
