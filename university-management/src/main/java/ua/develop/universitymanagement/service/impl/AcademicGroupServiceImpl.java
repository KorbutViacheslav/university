package ua.develop.universitymanagement.service.impl;

import ua.develop.universitymanagement.dto.group.AcademicGroupRead;
import ua.develop.universitymanagement.dto.group.AcademicGroupSave;
import ua.develop.universitymanagement.mapper.AcademicGroupMapper;
import ua.develop.universitymanagement.model.AcademicGroup;
import ua.develop.universitymanagement.repository.AcademicGroupRepo;
import ua.develop.universitymanagement.service.AcademicGroupService;

public class AcademicGroupServiceImpl implements AcademicGroupService {
    AcademicGroupRepo academicGroupRepo;
    AcademicGroupMapper academicGroupMapper;
    @Override
    public AcademicGroupRead saveAcademicGroup(AcademicGroupSave academicGroupSave) {
        AcademicGroup aG = academicGroupMapper.toAcademicGroup(academicGroupSave);
        academicGroupRepo.save(aG);
        return academicGroupMapper.toAcademicGroupRead(aG);
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
