package ua.develop.universitymanagement.web.controller.impl;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.develop.universitymanagement.dto.group.AcademicGroupRead;
import ua.develop.universitymanagement.dto.group.AcademicGroupSave;
import ua.develop.universitymanagement.web.controller.AcademicGroupController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/group")
public class AcademicGroupControllerImpl implements AcademicGroupController {
    @Override
    public AcademicGroupRead createAcademicGroup(AcademicGroupSave academicGroupSave) {
        return null;
    }

    @Override
    public AcademicGroupRead getAcademicGroupById(Integer id) {
        return null;
    }

    @Override
    public AcademicGroupRead updateAcademicGroup(AcademicGroupSave academicGroupSave) {
        return null;
    }

    @Override
    public void deleteAcademicGroupById(Integer id) {

    }
}
