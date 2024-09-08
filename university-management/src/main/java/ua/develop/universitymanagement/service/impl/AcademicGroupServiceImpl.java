package ua.develop.universitymanagement.service.impl;

import ua.develop.universitymanagement.model.AcademicGroup;
import ua.develop.universitymanagement.repository.AcademicGroupRepo;
import ua.develop.universitymanagement.service.AcademicGroupService;

public class AcademicGroupServiceImpl implements AcademicGroupService {
    AcademicGroupRepo academicGroupRepo;
    @Override
    public AcademicGroup saveAcademicGroup(AcademicGroup academicGroup) {
        return academicGroupRepo.save(academicGroup);
    }

    @Override
    public AcademicGroup getAcademicGroupById(Integer id) {
        return academicGroupRepo.findById(id).orElse(null);
    }

    @Override
    public AcademicGroup updateAcademicGroupById(AcademicGroup academicGroup, Integer id) {
        return null;
    }

    @Override
    public void deleteAcademicGroupById(Integer id) {
        academicGroupRepo.deleteById(id);
    }
}
