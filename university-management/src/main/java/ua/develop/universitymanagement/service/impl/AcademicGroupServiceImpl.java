package ua.develop.universitymanagement.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.develop.universitymanagement.dto.group.AcademicGroupRead;
import ua.develop.universitymanagement.dto.group.AcademicGroupSave;
import ua.develop.universitymanagement.mapper.AcademicGroupMapper;
import ua.develop.universitymanagement.model.AcademicGroup;
import ua.develop.universitymanagement.repository.AcademicGroupRepo;
import ua.develop.universitymanagement.service.AcademicGroupService;

import java.rmi.NotBoundException;

@Service
@AllArgsConstructor
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
    public AcademicGroupRead getAcademicGroupById(Integer id) {
        return academicGroupMapper.toAcademicGroupRead(academicGroupRepo.findById(id).orElse(null));
    }

    @Override
    public AcademicGroupRead updateAcademicGroupById(AcademicGroupSave academicGroupSave, Integer id) {
        AcademicGroup aG = academicGroupRepo.findById(id).orElse(null);
        return academicGroupMapper.toAcademicGroupRead(aG);
    }

    @Override
    public void deleteAcademicGroupById(Integer id) {
        academicGroupRepo.deleteById(id);
    }
}
